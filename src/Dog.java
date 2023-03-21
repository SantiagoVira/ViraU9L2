public class Dog extends Animal {
    private boolean beenWalked;
    private int timesBarked;

    public Dog(String name, String color, int age, boolean vaccinated, boolean hasBeenWalked) {
        super(name, color, age, vaccinated);
        this.beenWalked = hasBeenWalked;
        this.timesBarked = 0;
    }

    public void walk() {
        beenWalked = true;
        System.out.println("Dog has been walked.");
    }

    public boolean hasBeenWalked() {
        return beenWalked;
    }

    public void bark() {
        timesBarked++;
        System.out.println("woofffffffff");
    }

    public int getTimesBarked() {
        return timesBarked;
    }
}
