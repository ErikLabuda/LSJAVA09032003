public class Main {
    public static void main(String[] args) {
        Pet basicCat = new Pet();
        System.out.print(basicCat);
        basicCat.setGender("male");
        System.out.print(basicCat);

        Owner owner = new Owner("Jozko", 10, "Zizkov");
        System.out.print(owner);
        System.out.print(owner.getPets());
    }
}