public class Student implements Person{

    String studentId;
    String name;
    String surname;
    int age;

    public Student(String studentId, String name, String surname, int age) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public void getInfo() {
        System.out.println("Student ID: " + studentId + " Name: " + name + " Surname: " + surname + " Age: " + age);
    }


}
