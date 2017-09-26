public class Person {
    private String name;

    public static void main(String[] args) {
        Person person =new Person("Roger Smith");
        System.out.println(person.getName());
        person.setName("The Comedian");
        person.sayHello();
    }

    public Person(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public void sayHello() {
        System.out.println("Hello from "+this.name);
    }
}
