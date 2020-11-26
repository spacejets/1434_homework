/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.

*/

public class Main {
    public static void main(String[] args) {
        boolean a = false;
        int num [] = {1, 2, 3, 4, 5, 6, 6};
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) a = true;
            }
        }
        if (a) System.out.println("да");
        else Syste
