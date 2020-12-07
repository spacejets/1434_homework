/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        List <String> familys = new ArrayList<>();
        ArrayList <String> towns = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию");
        while (true) {
            System.out.print((int) (familys.size()+1) +" фамилия " +  " : ");
            String family = scanner.nextLine();
            System.out.println("Есть еще фамилии? если нет нажмите Enter");
            if (family.isEmpty()) break;
            else familys.add(family);
        }
        System.out.println("Введите название города \n");
        while (towns.size() < familys.size()) {
            System.out.print("город " + (int) (towns.size()+1) +" из " + (int) familys.size() + " : ");
            String town = scanner.nextLine();
            if (town.isEmpty()) System.out.println("городов меньше фамилий, введите еще " +(int)(familys.size()-towns.size()) + " городов");
            else towns.add(town);
        }
        
        System.out.println("Введите фамилию чтобы узнать место проживания" +" : " );
        String family = scanner.nextLine();
        int index = familys.indexOf(family);
        if (index!=-1) System.out.println(family + ": город " + towns.get(index));
        else System.out.println("такой фамилии нет в списке, начните заново.");

    }
}
