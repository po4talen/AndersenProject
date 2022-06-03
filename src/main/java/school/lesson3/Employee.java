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
       System.out.println("Name: " + name + " | Position: " + position + " | Email: " + email + " | Mobile: " + mob + " | Salary: " + salary + " | Age: " + age);
   }



//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", position='" + position + '\'' +
//                ", email='" + email + '\'' +
//                ", mob=" + mob +
//                ", salary=" + salary +
//                ", age=" + age +
//                '}';
//    }


}
