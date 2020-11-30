/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.

*/

public class Main {
    public static void main(String[] args) {
        boolean a = false;
        int num [] = {1, 2, 3, 4, 5, 6, 6};
        for (int i = 1; i < num.length; i++) {
                if (num[i] == num[i-1]) 
                {a = true; break;
            }
        }
        if (a==true) System.out.println("да");
        else System.out.println("нет");}
}

       
