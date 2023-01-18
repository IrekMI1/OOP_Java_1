package Pets;

import Humans.Person;

public class Minipig extends Pet {
    public Minipig(String name, Person owner) {
        super(name, owner);
    }

    @Override
    public void voice() {
        System.out.println("Хрю-хрю!");
    }

    @Override
    public String toString() {
        return String.format("Свинка с именем %s, хозяин %s", name, owner.getFullName());
    }
}
