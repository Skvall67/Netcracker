package ru.ncedu.java.tasks;

/**
 * Created by i.ruzhentsev on 14.07.2017.
 */
public class EmployeeImpl implements Employee {
    private String firstName;
    private String lastName;
    private Employee manager;
    private int salary;

    public EmployeeImpl(){
        salary = 1000;
    }

    public static void main(String[] args) {

    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void increaseSalary(int value) {
        salary += value;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String getManagerName() {
        if (manager == null) {
            return "No manager";
        } else {
            return manager.getFirstName() + " " + manager.getLastName();
        }
    }

    @Override
    public Employee getTopManager() {

        if (manager != null) {
            return manager.getTopManager();
        } else {
            return this;
        }
    }
}
