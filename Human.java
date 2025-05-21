public class Human implements Person {
    private String firstName;
    private String birthday; 
    private char gender; 

    public Human(String firstName, String birthday, char gender) {
        this.firstName = firstName;
        this.birthday = birthday;
        this.gender = gender;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + firstName);
        System.out.println("Birthday: " + birthday);
        System.out.println("Gender: " + gender);
    }
}