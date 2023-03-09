public class Pet {
    private String type;
    private String name;
    private byte age;
    private String gender;



    public Pet(){
        type = "cat";
        age = 1;
        name = "Blecha";
        gender = "non-binary";

    }

    public Pet(String type, String name, byte age, String gender) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
