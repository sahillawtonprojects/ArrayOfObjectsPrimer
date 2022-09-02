package sahillawtonyoutube.arrayofobjectsprimer;

public class Dog {
    private String name;
    private int age;
    private DogBreed breed;
    
    public Dog(String name, int age, DogBreed breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DogBreed getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setBreed(DogBreed breed) {
        this.breed = breed;
    }
    
    public void printDogInformation(){
        System.out.println(this.name + " is a dog of breed " + this.breed.toString()+ " and is "+ this.age+
                " years old.");
    }
}
