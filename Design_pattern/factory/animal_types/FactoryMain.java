public class FactoryMain {
    public static void main(String[] args) {

        factoryOperator factory = new factoryOperator();

        Animals cat = factory.getAnimals("Crista", "cat", "local",1);
        Animals dog = factory.getAnimals("bob", "dog", "bhatuwa", 6);
        Animals horse = factory.getAnimals("badal", "horse", "Stallion", 22);
        Animals dog1 = factory.getAnimals("bob", "dog", "aafw", 6);

        System.out.println("_____Your Animals Details_____");
        System.out.println("name: "+cat.getName()+" Age: "
                +cat.getAge()+" Animal Type: "+cat.getType()+" Breed: "+cat.getBreed());

        System.out.println();
        System.out.println("name: "+dog.getName()+" Age: "
                +dog.getAge()+" Animal Type: "+dog.getType()+" Breed: "+dog.getBreed());

        System.out.println();
        System.out.println("name: "+horse.getName()+" Age: "
                +horse.getAge()+" Animal Type: "+horse.getType()+" Breed: "+horse.getBreed());

        //to check if we are getting correct instances based on type
        System.out.println();
        System.out.println(dog1);
    }
}
