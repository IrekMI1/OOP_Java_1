package Humans;

public class Man extends Person {
    private Woman wife = null;

    public Man(String fullName, int age) {
        super(fullName, age);
    }

    public Man(String fullName, int age, Woman wife) {
        super(fullName, age);
        this.setWife(wife);
    }

    public void setWife(Woman wife) {
        if (this.getAge() < 18) {
            System.out.println("Рано еще тебе жениться.");
        } else {
            this.wife = wife;
        }
    }

    public void addChild(Person child) {
        child.setFather(this);
        this.childList.add(child);
        if (!(wife == null)) {
            wife.childList.add(child);
            child.setMother(wife);
        }
    }

    @Override
    public String getMaritalStatus() {
        if (wife == null) {
            return "Холост";
        }
        return String.format("Женат на %s", wife.getFullName());
    }
}