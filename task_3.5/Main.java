/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/

public class Main {
public static void main(String[] args) {
        int num[] = {4, 2, 6, 2, 65};
        alln(num,0);
        }
public static void alln(int nams[],int index){
        if (index <nams.length) {
        System.out.println(nams[index]);
        index++;
        alln(nams, index);
        }}}
