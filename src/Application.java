import animals.Cats;
import animals.Dogs;

public class Application {
    public static void main(String[] args) {
        Cats myCat = new Cats("Markus", 4, 32);  // створив екземляр класу Cats

        myCat.getInfo();
        myCat.makeSound();
        System.out.println("My species is: " + myCat.getSpeciesName());
        myCat.pet();

        Dogs myDog = new Dogs("Sharik", 10, 45);

        myDog.getInfo();
        myDog.makeSound();
        myDog.pet();

        myCat.contact(myDog);
        myCat.contact(myCat);

        Human myHuman = new Human("Vasia", "Pupkin");
        myHuman.sayHello();
    }
}
