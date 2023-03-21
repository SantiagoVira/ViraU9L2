public class Cat extends Animal {
    private boolean playedWith;
    private int timesMeowed;

    public Cat(String name, String color, int age, boolean vaccinated, boolean playedWith) {
        super(name, color, age, vaccinated);
        this.playedWith = playedWith;
        this.timesMeowed = 0;
    }

    public void play() {
        playedWith = true;
        System.out.println("Played with the cat.");
    }

    public boolean hasPlayedWith() {
        return playedWith;
    }

    public int getTimesMeowed() {
        return timesMeowed;
    }

    public void meow() {
        timesMeowed++;
        System.out.println("meoww");
    }
}
