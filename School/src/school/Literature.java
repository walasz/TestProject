package school;

public class Literature extends Subject {

    static Literature literature = null;

    private Literature() {
        this.name = "Literature";
    }

    public static Literature builder() {
        if (literature == null) {
            return literature = new Literature();
        }

        return literature;
    }

}
