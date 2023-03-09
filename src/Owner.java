import java.lang.reflect.Array;
import java.util.ArrayList;

public class Owner {
    private String name;
    private int age;
    private String address;
    private ArrayList<Pet> pets;

    public Owner(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;

        pets = new ArrayList<Pet>();
        pets.add(new Pet());
        pets.add(new Pet("dog","tlapka", (byte) 10, "female"));
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", pets=" + pets +
                '}';
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
}
