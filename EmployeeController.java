import java.util.ArrayList;

public class EmployeeController {

    private ArrayList<Employee> list;
    private EmployeeView view;

    // Constructor
    public EmployeeController(ArrayList<Employee> list,
                              EmployeeView view) {

        this.list = list;
        this.view = view;
    }

    // Add Employee
    public void addEmployee(int id,
                            String name,
                            double salary) {

        Employee emp =
                new Employee(id, name, salary);

        list.add(emp);

        view.showMessage("Employee Added Successfully");
    }

    // Display Employees
    public void displayEmployees() {

        view.displayAll(list);
    }

    // Update Employee
    public void updateEmployee(int id,
                               String newName,
                               double newSalary) {

        boolean found = false;

        for(Employee emp : list) {

            if(emp.getId() == id) {

                emp.setName(newName);
                emp.setSalary(newSalary);

                found = true;

                view.showMessage("Employee Updated");

                break;
            }
        }

        if(found == false) {

            view.showMessage("Employee ID Not Found");
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        boolean found = false;

        for(int i = 0; i < list.size(); i++) {

            if(list.get(i).getId() == id) {

                list.remove(i);

                found = true;

                view.showMessage("Employee Deleted");

                break;
            }
        }

        if(found == false) {

            view.showMessage("Employee ID Not Found");
        }
    }

    // Search Employee
    public void searchEmployee(int id) {

        boolean found = false;

        for(Employee emp : list) {

            if(emp.getId() == id) {

                System.out.println("\nEmployee Found");
                System.out.println("----------------");
                System.out.println("ID : " + emp.getId());
                System.out.println("Name : " + emp.getName());
                System.out.println("Salary : " + emp.getSalary());

                found = true;

                break;
            }
        }

        if(found == false) {

            view.showMessage("Employee ID Not Found");
        }
    }
}