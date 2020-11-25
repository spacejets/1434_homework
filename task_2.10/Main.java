/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.

*/


public class Main {
    public static void main(String[] args) {
        boolean a = true;
        int[] num = {1, 2, 3, 4, 5, 5, 6};
            for (int i = 0; i < num.length; i++)
                for (int j = 1; j < num.length - 1; j++)
                    if (num[i] == num[j] - 1){
        a = true;
        System.out.println("да");
        break;}
        else {
        System.out.println("нет");}
    }}
