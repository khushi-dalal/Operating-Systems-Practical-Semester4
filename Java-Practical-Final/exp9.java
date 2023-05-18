// Create a Java class named Animal with properties for name and age, and methods for setting these properties and displaying them. Then, create a subclass named Dog that inherits from Animal and adds a new property for breed and a new method for setting and displaying this property.
class Animal{
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
        // Getters and setters for name and age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, String breed) {
    super(name, age);
    this.breed = breed;
}
        public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Breed: " + breed);
}
}
public class exp9 {
    public static void main(String[] args) {
        Animal animal = new Animal("Fluffy", 5);
        animal.displayInfo(); 
        Dog dog = new Dog("Fido", 3, "Labrador");
        dog.displayInfo(); 
    }
}