/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,4,4,7,6,15};
int sum = 0;
int alln = 0;
        for (int i = 0; i < num.length; i++) {
            sum=sum+num[i];
            alln++;
while (sum>10)
break;}
        {System.out.println(alln);}
    }}
