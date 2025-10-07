class Employee {
    // Attributes
    private int employeeId;
    private String name;
    private double baseSalary;
    
    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    // Calculate salary method
    public double calculateSalary() {
        return baseSalary;
    }
    
    // Display details method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
    
    // Getters
    public double getBaseSalary() {
        return baseSalary;
    }
}
