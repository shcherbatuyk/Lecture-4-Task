package animals;

public class Cats extends Animal{
    private Integer tailLength; // має всі філди абстрактного класу Animal + свій свій філд (довжина хвоста)

    public Cats(String name, Integer weight, Integer tailLength) {
        super.setName(name);
        super.setWeight(weight);
        this.tailLength = tailLength;
        super.setSpeciesName("Cats");
    }

    public Cats() {

    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void contact(Dogs dogs)
    {
        System.out.println("Hello, dog!");
    }

    public void contact(Cats cats)
    {
        System.out.println("Hello, cat!");
    }

    public void contact()
    {
        System.out.println("Hello! You're neither cat nor dog!");
    }

}
