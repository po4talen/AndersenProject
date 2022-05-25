package school.lesson3;

public class Employee {
    private String name;
    private String position;
    private String email;
    private int mob;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String position, String email, int mob, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.mob = mob;
        this.salary = salary;
        this.age = age;
    }

   public void employeeInfo(){
       System.out.println("Name: " + this.name + " | Position: " + this.position + " | Email: " + this.email + " | Mobile: " + this.mob + " | Salary: " + this.salary + " | Age: " + this.age);
   }
}
