package chapter9;

public class Dog extends Mammal {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.setDiet("Herbs");
        Dog dog = new Dog();
        dog.breed = "Labrador";

        polyMorphismTest(mammal);
        polyMorphismTest(dog);

    }

    private String breed;

    public static void polyMorphismTest(Mammal mammal) {
        System.out.println(mammal.getDiet());
    }
    

}
