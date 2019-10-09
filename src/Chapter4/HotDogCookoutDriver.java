package Chapter4;

public class HotDogCookoutDriver {
    public static void main(String[] args) {
        hotDogCookoutDemo();
    }

    public static void hotDogCookoutDemo() {
        HotDogCookout cookout0 = new HotDogCookout();
        cookout0.setHotDogsPerPerson(10);
        cookout0.setPeople(1);
        System.out.println(cookout0.statement());
    }
}
