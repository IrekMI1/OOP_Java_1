package Devices;
import Humans.Person;

public class TV {
    private String place;
    private boolean turnedOn;

    public String getPlace() {
        return place;
    }

    public TV(String place) {
        this.place = place;
        turnedOn = false;
    }

    public void pushPowerButton(Person person) {
        if (turnedOn) {
            System.out.printf("%s выключил телевизор %s", person.getFullName(), this.place);
        } else {
            System.out.printf("%s включил телевизор %s",person.getFullName(), this.place);
        }
        turnedOn = !turnedOn;
    }
}
