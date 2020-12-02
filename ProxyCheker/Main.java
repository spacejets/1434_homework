import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

class ProxyChecker {
    public static void main(String[] args) {
        ArrayList<String> ipList = new ArrayList<>(); //создается список ip лист
        try {
            FileReader reader = new FileReader("C://java/ip.txt");
            int c;
            String proxy = "";
            while ((c = reader.read()) != -1) { //с помощью ридера читаем по символам файл ip.txt
                if (c == 13) {
                    continue;
                } else if (c == 10) {
                    ipList.add(proxy);
                    proxy = "";
                } else if (c != 9) // 9 - это табуляция
                    proxy = proxy + (char) c;
                else
                    proxy += ":"; //меняем табуляцию после айпи на двоеточие
            }
            for (String ipString : ipList) {   //цикл форэйч
                String ip = ipString.split(":")[0];//дробим строку ip с помощью сплита на 2 массива, к примеру ["192.241.157.67","80"]
                int port = Integer.parseInt(ipString.split(":")[1]);//преобразуем строку к числу с помощью integer
                MyRunnableClass t1 = new MyRunnableClass(ip, port);
                t1.run();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }}}
class MyRunnableClass implements Runnable {
    String ip;
    int port;
    
    public MyRunnableClass(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
                    @Override
                    public void run() {//запускаем функцию проверки run
                        System.out.println("Проверяю " + ip + ":" + port);
                        try {
                            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
                            URLConnection connection = new URL("https://vozhzhaev.ru/test.php").openConnection(proxy);
                            InputStream is = connection.getInputStream();
                            InputStreamReader reader = new InputStreamReader(is);
                            char[] buffer = new char[256];
                            int c;

                            StringBuilder stringBuilder = new StringBuilder();//ответ от серверпа

                            while ((c = reader.read(buffer)) != -1) {
                                stringBuilder.append(buffer, 0, c);
                            }
                            reader.close();
                            System.out.println("ip: " + stringBuilder + " РАБОТАЕТ!!!!!!!!!!");

                        } catch (IOException e) {
                            System.out.println("ip: " + ip + " не работает");
                        }
                    }
}
