public class HealthProfile extends Human {
    private double weight;
    private double height; 

    public HealthProfile(String firstName, String birthday, char gender, double weight, double height) {
        super(firstName, birthday, gender);
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("BMI: " + calculateBMI());
    }
}
