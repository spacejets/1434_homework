  
/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
public class Main {
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
... */
    public static void main(String... args){
        for(int i = 1; i < 11; i++){
            for(int a = 1; a < 11; a++){
                System.out.print(a * i + "  ");
            }
            System.out.println("");
        }
    }
}
