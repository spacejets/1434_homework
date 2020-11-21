/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] et = {1, 2, 3, 4,6,5,};
        for (int i = 0; i < et.length; i++){
            if (et[i] == 5) {
                System.out.println("yes"); break;}

        else if (i==et.length-1) {System.out.println("no");}
    }
}}
