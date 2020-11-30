/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */
/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/



import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите путь к файлу:");
        String test = scan.nextLine();
        FileReader reader  = new FileReader(test);
        Scanner scanFileReader = new Scanner(reader);
        ArrayList<Integer> nums = new ArrayList<>();
        String nextLine="";
        int nextInt;

        while (scanFileReader.hasNextLine()){
            nextLine = scanFileReader.nextLine();
            nextInt=Integer.parseInt(nextLine) ;
            if (nextInt % 2 == 0 ) nums.add(nextInt);}
        reader.close();
        Collections.sort(nums);
        nums.forEach(System.out::println);
    }
}
