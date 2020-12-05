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
        ArrayList<String> user = new ArrayList<>();
        Socket socket;
        try {
            ServerSocket serverSocket = new ServerSocket(8187);
            System.out.println("INFO: Сервер запущен");

            while (true){// Ожидаем клиента бесконечно
                socket = serverSocket.accept();// Ожидаем клиента
                DataInputStream in = new DataInputStream(socket.getInputStream());// Поток ввода
                DataOutputStream out; // Поток вывода
                String name = in.readUTF(); //читаем имя клиента
                clients.add(socket);//Добавляем клиента в список
                user.add(name);// добавляем имя в список user
                System.out.println(name + " подключился");
                for (Socket count : clients){
                out = new DataOutputStream(count.getOutputStream());
                out.writeUTF(name + " подключился");}
                Thread thread = new Thread(new Runnable() { // Открываем поток для клиента
                    @Override
                    public void run() {
                        try {
                            while (true){
                                System.out.println("Ожидаем сообщение...");
                                String request = in.readUTF();
                                System.out.println(name+": "+request );
                                for (Socket socket: clients) { // Перебираем список клиентов
                                    DataOutputStream out = new DataOutputStream(socket.getOutputStream()); //временный поток ввывода
                                    out.writeUTF(name+": "+request);
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
