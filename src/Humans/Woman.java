package Humans;

public class Woman extends Person {
    private Man husband = null;

    public Woman(String fullName, int age) {
        super(fullName, age);
    }

    public Woman(String fullName, int age, Man husband) {
        super(fullName, age);
        this.setHusband(husband);
    }

    public void setHusband(Man husband) {
        if (this.getAge() < 18) {
            System.out.println("Рано еще тебе замуж.");
        } else {
            this.husband = husband;
        }
    }

    public void addChild(Person child) {
        child.setMother(this);
        this.childList.add(child);
        if (!(husband == null)) {
            husband.childList.add(child);
            child.setFather(husband);
        }
    }

    @Override
    public String getMaritalStatus() {
        if (husband == null) {
            return "Незамужем";
        }
        return String.format("Замужем за %s", husband.getFullName());
    }
}