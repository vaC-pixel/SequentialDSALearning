public class Student {

    //1. Class is the blueprint of an object.
    //2. Class does not occupy any space in memory.
    //3. Many objects can be made by a single class.
    //4. Objects take space in the memory.
    //5. The variable that are defined in a scope or method
    //   is called local variable.
    //6. The variable that are defined inside the class and
    //   outside the method or scope is  called instance variable.
    //7. Class is the collection of variables or properties and methods or behavior.

    //this keyword :
    //This is actually current calling object.

    String name;//instance
    int age;//instance also called properties


    //Constructor :
    //It is a special type of method that automatically call on every object creation.
    //Rules :
    //1. Name of the constructor must be same as the class name.
    //2. There will be no return type.
    Student(String name , int age){
        this.name  = name;//local
        this.age = age;
    }

    //Methods are also called behavior
    public void print(){
        System.out.println("[ Name : "+name+" age : "+age+" ]");
    }

}

class Tempo{
    static void main(String[] args) {
        Student s1 = new Student("Golu", 34);
        s1.print();
        Student s2 = new Student("Polu", 43);
        s2.print();
    }
}
