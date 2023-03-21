public class Animal {
    private String name, color;
    private int age;
    private boolean vaccinated;


    public Animal(String name, String color, int age, boolean vaccinated) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public void adopt() {
        System.out.println("I have been adopted");
    }

    public void feed() {
        System.out.println("I have been fed");
    }

    public void jump() {
        System.out.println("I can jump so high");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public int getAge() {
        return age;
    }
}
