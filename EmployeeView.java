import java.util.ArrayList;

public class EmployeeView {

    // Display all employees
    public void displayAll(ArrayList<Employee> list) {

        if(list.isEmpty()) {

            System.out.println("No Employee Records");
        }
        else {

            System.out.println("\nEmployee Details");
            System.out.println("----------------------------");

            for(Employee emp : list) {

                System.out.println("ID : " + emp.getId());
                System.out.println("Name : " + emp.getName());
                System.out.println("Salary : " + emp.getSalary());

                System.out.println("----------------------------");
            }
        }
    }

    // Message
    public void showMessage(String msg) {

        System.out.println(msg);
    }
}