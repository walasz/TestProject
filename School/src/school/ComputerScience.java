package school;

public class ComputerScience extends Subject {

    static ComputerScience computerScience = null;

    private ComputerScience() {
        this.name = "ComputerScience";
    }

    public static ComputerScience builder() {
        if (computerScience == null) {
            return computerScience = new ComputerScience();
        }

        return computerScience;
    }
}
