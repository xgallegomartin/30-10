public class Employee implements Person{

    String name;
    String surname;
    int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public void getInfo() {
        System.out.println("Name: " + name + " Surname: " + surname + " Age: " + age);
    }

    public void yearstoretire(int age){
        int years = 62 - age;
        System.out.println("The years left to retire are: " + years);
    }
}
