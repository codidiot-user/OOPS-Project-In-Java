public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee(101, "John Doe", 5000);
        Manager emp2 = new Manager(102, "Jane Smith", 8000, 2000);
        Developer emp3 = new Developer(103, "Mike Johnson", 6000, 8);
        
        // Display details
        
        System.out.println("\n--- Regular Employee ---");
        emp1.displayDetails();
        System.out.println("Monthly Salary: " + emp1.calculateSalary());
        
        System.out.println("\n--- Manager ---");
        emp2.displayDetails();
        
        System.out.println("\n--- Developer ---");
        emp3.displayDetails();
    }
}
