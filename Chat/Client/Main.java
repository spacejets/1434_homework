package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static String name;
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8187);// ip адрес сервера localhost потому что сервер на пк
            DataInputStream in = new DataInputStream(socket.getInputStream());//поток ввода информации
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());//поток вывода информации
            Thread thread = new Thread(new Runnable() {       //поток для чтения
                @Override
                public void run() {
                    try {   System.out.println("Ввведите имя и напишите сообщение (если захотите покинуть чат, отправьте пустое сообщение): ");
                        name = in.readUTF();
                        while (true){ //бесконечный цикл
                            String response = in.readUTF(); //ждем ответ от сервера в переменную response
                            System.out.println(response);//выводим ответ сервера через переменную response
                        }
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
            Scanner scanner = new Scanner(System.in);
            String mess = "";
            while(true){      //бесконечный цикл для общения с сервером
                mess= scanner.nextLine();// создаем строку для общения
                if (mess.equals("")){
                    out.writeUTF("пользователь покинул чат"); //выход информации, ответ

               socket.close();} //отключаем клента от сервера
            else out.writeUTF(mess);}
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }


}
