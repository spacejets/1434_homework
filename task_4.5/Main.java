
/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/


public class Main{
    public static void main(String[] args) {
        //Ваш код
        Horse horse = new Horse("Bojack",40,70,150);
        horse.run();
        Pegasus pegas = new Pegasus("Пегас",25,80,170);
        pegas.fly();

    }
}
abstract class Animal{
  String name;
  int age;
  int runningspeed;
  int weight;

    public Animal(String name, int age, int runningspeed, int weight) {
        this.name = name;
        this.age = age;
        this.runningspeed = runningspeed;
        this.weight = weight;
    }

}

class Horse extends Animal {
    public Horse(String name, int age,  int runningspeed, int weight) {
        super(name, age, runningspeed, weight);
    }
    public void run() {System.out.println("Игого, я поскакал");}
}

class Pegasus extends Horse {
    public Pegasus(String name, int age, int runningspeed, int weight) {
        super(name, age,runningspeed, weight);
    }
    public void fly(){ System.out.println("Игого, я полетел");}
}
