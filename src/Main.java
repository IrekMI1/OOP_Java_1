import Devices.TV;
import Humans.*;;
import Pets.*;

public class Main {
    public static void main(String[] args) {
        Man Igor = new Man("Igor Matveev", 33);
        Woman Ira = new Woman("Irina Matveeva", 30);
        Man Kirill = new Man("Kirill Matveev", 6);
        Woman Vera = new Woman("Vera Matveeva", 3);

        Igor.setWife(Ira);
        System.out.println(Igor.getMaritalStatus());

        Kirill.setFather(Igor);
        Kirill.setMother(Ira);

        Vera.showParents();
        Kirill.showParents();

        Dog dog = new Dog("Chen", Igor);
        Minipig pig = new Minipig("Piggy", Vera);

        Igor.callPet(dog);
        Ira.callPet(pig);

        System.out.println(dog.toString());
        System.out.println(pig.toString());

        Kirill.turnOnTV(new TV("на кухне"));
    }
}