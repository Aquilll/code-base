public class dogs implements Animals {

    private String name;
    private String type;
    private String breed;
    private int age;
    private String trueform = "dogs";

    public dogs(String name, String type, String breed, int age){
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getBreed() {
        return this.breed;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    //to check if proper class is instiantiated
    public String confirmation(){
        return "true dog";
    }

    //to check if proper class is instiantiated
    @Override
    public String toString() {
        return "dogs{" +
                "trueform='" + trueform + '\'' +
                '}';
    }
}
