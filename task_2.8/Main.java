
/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int[] buk = {2, 3, 4, 5};
        int all = 1;
        for (int i = 0; i < buk.length; i++)
        {
        all *= buk[i];}

        System.out.println(all);

    }
}
