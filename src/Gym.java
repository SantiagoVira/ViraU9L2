public class Gym extends Class {
    private String sport;

    public Gym(int size, String subject, String sport) {
        super(size, subject);
        this.sport = sport;
    }

    public void warmup() {
        System.out.println("Doing some jumping jacks.");
    }
}
