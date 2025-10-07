// Manager class
class Manager extends Employee {
    private double bonus;
    
    public Manager(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }
    
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Developer class
class Developer extends Employee {
    private int overtimeHours;
    
    public Developer(int employeeId, String name, double baseSalary, int overtimeHours) {
        super(employeeId, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }
    
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (overtimeHours * 500);
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Overtime Pay: " + (overtimeHours * 500));
        System.out.println("Total Salary: " + calculateSalary());
    }
}
