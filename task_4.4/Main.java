/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Cat1 butchCat  =new Cat1("Бутч",true,true);
        Cat tomCat = new Cat("Том","Grey",true);
        Dog spikeDog = new Dog("Спайк",20,true);

    }
}

class Cat {
    String name;
    String color;
    boolean hunger;

    public Cat(String name, String color, boolean hunger) {
        this.name = name;
        this.color = color;
        this.hunger = hunger;
    }
}
class Cat1 {
    String name;
    Boolean cunning;
    Boolean agility;
    public Cat1(String name,boolean cunning,boolean agility){
        this.name=name;
        this.cunning = cunning;
        this.agility = agility;}
    }

class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
class Dog {
    String name;
    int weight;
    boolean anger;

    public Dog(String name, int weight, boolean anger) {
        this.name = name;
        this.weight = weight;
        this.anger = anger;
    }
}
