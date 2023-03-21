public class Science extends Class {
    private String field;

    public Science(int size, String subject, String field) {
        super(size, subject);
        this.field = field;
    }

    public void lab() {
        System.out.println("Starting a lab experiment...");
    }
}
