package Pets;

import Humans.Person;

public class Pet {
    protected String name;
    protected Person owner;

    public Pet(String name, Person owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println("Не умею издавать звуки.");
    }
}
