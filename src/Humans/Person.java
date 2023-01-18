package Humans;
import Devices.TV;
import Pets.*;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String fullName;
    private int age;
    private Woman mother;
    private Man father;
    protected List<Person> childList = new ArrayList<>();

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Woman getMother() {
        return mother;
    }

    public void setMother(Woman mother) {
        this.mother = mother;
    }

    public Man getFather() {
        return father;
    }

    public void setFather(Man father) {
        this.father = father;
    }

    public List<Person> getChildList() {
        return childList;
    }

    public void showChildren() {
        if (childList.isEmpty()) {
            System.out.println("Детей нет.");
        } else {
            System.out.println("Дети: ");
            for (Person child : childList) {
                System.out.println(child.getFullName());
            }
        }
    }

    public void showParents() {
        if (father != null || mother != null) {
            System.out.printf("Родители: %s и %s\n", father.getFullName(), mother.getFullName());
        } else {
            System.out.println("Родители не найдены.");
        }
    }

    public String getMaritalStatus() {
        return "Холост/незамужем";
    }

    public void turnOnTV(TV tv) {
        tv.pushPowerButton(this);
    }

    public void callPet(Pet pet) {
        System.out.printf("%s позвал питомца %s, а он в ответ: \n", this.getFullName() ,pet.getName());
        pet.voice();
    }
}