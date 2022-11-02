package animals;

public class Dogs extends Animal{
        private Integer pawsLength; // Dogs має всі філди абстрактного класу Animal + свій свій філд (довжина хвоста)

    public Dogs(String dogName, Integer dogWeight, Integer pawsLength) { // конструктор з усіма філдами
        super.setName(dogName);
        super.setWeight(dogWeight);
        this.pawsLength = pawsLength;
        super.setSpeciesName("Dogs");
    }

    public Dogs(String dogName, Integer dogWeight) {                    // контсруктор без філду pawsLength
        super.setName(dogName);
        super.setWeight(dogWeight);
        this.pawsLength = 0;
        super.setSpeciesName("Cats");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
