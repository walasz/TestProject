package school;

public class History extends Subject {

    static History history = null;

    private History() {
        this.name = "History";
    }

    public static History builder() {
        if (history == null) {
            return history = new History();
        }

        return history;
    }

}
