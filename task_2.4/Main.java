//Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.*/


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сумму вклада: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите процентную ставку: ");
        int b = scan.nextInt();
        int y1 = 0;
        int y2 = 0;
        int y3 = 0;
        int y4 = 0;
        int y5 = 0;
            y1=a+a*b/100;
            y2=y1+a*b/100;
            y3=y2+a*b/100;
            y4=y3+a*b/100;
            y5=y4+a*b/100;

            {System.out.println("размер вклада за первый год: " + y1 + "руб.");
                System.out.println("размер вклада за второй год: " + y2 + "руб.");
                System.out.println("размер вклада за третий год: " + y3 + "руб.");
                System.out.println("размер вклада за четвертый год: " + y4 + "руб.");
                System.out.println("размер вклада за пятый год: " + y5 + "руб.");}}
            }
