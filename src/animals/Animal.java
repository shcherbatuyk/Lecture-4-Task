package animals;

public abstract class Animal {  // Мій абстрактний клас. Можу від нього унаслідуватися, але не можу створити його екземпляр
    private String speciesName;
    private Integer weight;

    private String name;

    public void makeSound(){        // метод, який я потім можу оверрайднути
        System.out.println("This animal has no specified sound!");
    }

    public void getInfo(){          // метод, який я можу оверрайднути
        System.out.println("Species name:" + speciesName + " , weight: " + weight+ " , name: " + name);
    }

    public void pet() {             // метод, який я можу оверрайднути
        System.out.println(name + ": Wow, I'm pet!");
    }

    public String getSpeciesName() {
        return speciesName;
    }

    // сеттери в Animal зробив protected, щоб сеттити філди в Animal можна було тільки з класів, що у пекеджі animals
    protected void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public Integer getWeight() {
        return weight;
    }

    protected void setWeight(Integer weight) { // тут спробував в сеттер засунути логіку
        if (weight > 1) {
            this.weight = weight;
        }
        else {
            this.weight = 1;
        }
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

}
