public class factoryOperator {

    public Animals getAnimals(String name, String type, String breed, int age){

        if(type == "cat"){
            return new cats(name, type, breed, age);
        }else if(type == "dog"){
            return new dogs(name, type, breed, age);
        }else{
            return new horse(name, type, breed, age);
        }

    }
}
