import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавление сотрудников
        Employee employee1 = new Employee(1, "111-1111", "John", 5);
        Employee employee2 = new Employee(2, "222-2222", "Jane", 3);
        directory.addEmployee(employee1);
        directory.addEmployee(employee2);

        // Поиск сотрудника по стажу
        List<Employee> employeesWithExperience5 = directory.searchByExperience(5);
        System.out.println("Сотрудники со стажем 5 лет:");
        for (Employee employee : employeesWithExperience5) {
            System.out.println("Табельный номер: " + employee.getEmployeeId());
            System.out.println("Имя: " + employee.getName());
        }

        // Вывод номеров телефонов сотрудников по имени
        List<String> phoneNumbers = directory.getPhoneNumbersByName("Jane");
        System.out.println("Номера телефонов сотрудника Jane:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        // Поиск сотрудника по табельному номеру
        Employee employee = directory.searchByEmployeeId(2);
        if (employee != null) {
            System.out.println("Сотрудник с табельным номером 2 найден:");
            System.out.println("Табельный номер: " + employee.getEmployeeId());
            System.out.println("Имя: " + employee.getName());
        } else {
            System.out.println("Сотрудник с табельным номером 2 не найден");
        }
    }
}