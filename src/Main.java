public class Main {
    public static void main(String[] args) {
        Dog rufus = new Dog("rufus", "brown", 4, true, false);
        Cat ralph = new Cat("ralph", "orange", 6, false, false);

        System.out.println(rufus.getName());
        System.out.println(rufus.getAge());
        System.out.println(rufus.isVaccinated());
        System.out.println(rufus.getColor());
        System.out.println(rufus.getTimesBarked());
        System.out.println(rufus.hasBeenWalked());
        rufus.adopt();
        rufus.feed();
        rufus.walk();
        rufus.jump();
        rufus.bark();

        System.out.println(ralph.getName());
        System.out.println(ralph.getAge());
        System.out.println(ralph.isVaccinated());
        System.out.println(ralph.getTimesMeowed());
        System.out.println(ralph.getColor());
        System.out.println(ralph.hasPlayedWith());
        ralph.adopt();
        ralph.feed();
        ralph.play();
        ralph.jump();
        ralph.meow();
    }
}