/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/


public class Main {
    public static void main(String[] args) {
        int num[] = {1,2,3,1,0,1,7,6,15};
        int sum = 0;
        int alln = 0;
        while (sum<=10){
            sum=sum+num[alln];
            alln++;}
        {System.out.println(alln);}
    }}
