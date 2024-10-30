//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("10923981","Sergio","Gallego",21);
        Employee e1 = new Employee("Sergio","Gallego",21);

        s1.getInfo();
        e1.getInfo();
        e1.yearstoretire(21);

    }
}