public class Human implements Nameable {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void sayHello()
    {
        System.out.println("Hello, I'm a human. My name is " + firstName);
    }
}
