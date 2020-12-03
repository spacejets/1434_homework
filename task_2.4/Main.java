//Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сумму вклада: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите процентную ставку: ");
        int b = scan.nextInt();
        for (int i = 0; i < 5; i++) {
            a+=a*b/100;
            System.out.println("размер вклада за " +i+" год : " + a + "руб.");
        }}
}
