public class Student {

    //1. Class is the blueprint of an object.
    //2. Class does not occupy any space in memory.
    //3. Many objects can be made by a single class.
    //4. Objects take space in the memory.
    //5. The variable that are defined in a scope or method
    //is called local variable.
    //6. The variable that are defined inside the class and
    //   outside the method or scope is  called instance variable.


    String name;
    int age;
    public void print(){
        System.out.println("[ Name : "+name+" age : "+age+" ]");
    }
    public void initialize(String name , int age){
        this.name  = name;
        this.age = age;
    }
}

class Tempo{
    static void main(String[] args) {
    Student s1 = new Student();
    s1.initialize("Golu", 34);
    s1.print();
    }
}
