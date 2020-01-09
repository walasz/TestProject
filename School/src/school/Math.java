package school;

public class Math extends Subject {

    static Math mathematics = null;

    private Math() {
        this.name = "Mathematics";
    }

    public static Math builder() {
        if (mathematics == null) {
            return mathematics = new Math();
        }

        return mathematics;
    }
}
