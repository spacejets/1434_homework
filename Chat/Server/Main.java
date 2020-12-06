package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {


    public static void main(String[] args) {
        ArrayList<Socket> clients = new ArrayList<>();// список наших клиентов
        Socket socket=null;
        try {
            ServerSocket serverSocket = new ServerSocket(8187);
            System.out.println("INFO: Сервер запущен");

            while (true){// Ожидаем клиента бесконечно
                socket = serverSocket.accept();// Ожидаем клиента
                DataInputStream in = new DataInputStream(socket.getInputStream());// Поток ввода
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());   // Поток вывода
                System.out.println("Клиент подключился");
                clients.add(socket);
                Thread thread = new Thread(new Runnable() { // Открываем поток для клиента
                    @Override
                    public void run() {
                        try {
                            out.writeUTF("введите имя: ");
                            String names = in.readUTF();
                            while (true){
                                System.out.println("Ожидаем сообщение от " + names);
                                String request = in.readUTF();
                                System.out.println(names+": "+request );
                                for (Socket socket: clients) { // Перебираем список клиентов
                                    DataOutputStream out = new DataOutputStream(socket.getOutputStream()); //временный поток ввывода
                                    out.writeUTF(names+": "+request);
                                }
                            }
                        }catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
