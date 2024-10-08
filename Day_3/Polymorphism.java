class Animal {
    public void sound() {
        System.out.println("Hop Hop");
    }
}

//Subclass no.1
class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("Barking");
    }
}

//Subclass no.2
class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println("Meowwww");
    }
}

//Subclass no.3
class Cow extends Animal {
    @Override
    public void sound(){
        System.out.println("Mooo");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();

        myAnimal = new Cow();
        myAnimal.sound();
    }
}


