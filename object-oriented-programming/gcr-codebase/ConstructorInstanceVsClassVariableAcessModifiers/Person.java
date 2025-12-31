

public class Person {
    private String name;
    private int age;

    Person(){}
    Person(Person p){
       this.name = p.name;
       this.age = p.age;
    }
}
