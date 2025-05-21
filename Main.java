public class Main {
    public static void main(String[] args) {
        System.out.println("------ Health Info ------");

        Person person1 = new HealthProfile("Alice", "1995-01-01", 'F', 50.0, 1.53);
        person1.displayInfo();

        System.out.println("\n------ Another ------");

        Person person2 = new HealthProfile("Bob", "1990-06-14", 'M', 70.0, 1.75);
        person2.displayInfo();
    }
}
