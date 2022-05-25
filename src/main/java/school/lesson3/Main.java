package school.lesson3;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Oleg Olegov", "secretary", "oleg@e.com", 50000000, 500, 42);
        employeeArray[1] = new Employee("Petro Petrov", "driver", "petro@e.com", 97777777, 200, 35);
        employeeArray[2] = new Employee("Vova Vovanov", "accountant", "vova@e.com", 96666666, 800, 41);
        employeeArray[3] = new Employee("Igor Igorov", "batman", "igor@e.com", 63333333, 5000, 44);
        employeeArray[4] = new Employee("Viktor Viktorov", "director", "viktor@e.com", 988888888, 2000, 33);

        for (Employee tempArray : employeeArray) {
            if (tempArray.getAge() > 40)
                tempArray.employeeInfo();
        }
    }
}
