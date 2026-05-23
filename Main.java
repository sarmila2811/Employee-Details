import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list =
                new ArrayList<>();

        EmployeeView view =
                new EmployeeView();

        EmployeeController controller =
                new EmployeeController(list, view);

        int choice;

        do {

            System.out.println("\n===== EMPLOYEE MENU =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Employee ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Salary : ");
                    double salary = sc.nextDouble();

                    controller.addEmployee(id,
                                           name,
                                           salary);

                    break;

                case 2:

                    controller.displayEmployees();

                    break;

                case 3:

                    System.out.print("Enter ID to Update : ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name : ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Salary : ");
                    double newSalary = sc.nextDouble();

                    controller.updateEmployee(updateId,
                                              newName,
                                              newSalary);

                    break;

                case 4:

                    System.out.print("Enter ID to Delete : ");
                    int deleteId = sc.nextInt();

                    controller.deleteEmployee(deleteId);

                    break;

                case 5:

                    System.out.print("Enter ID to Search : ");
                    int searchId = sc.nextInt();

                    controller.searchEmployee(searchId);

                    break;

                case 6:

                    System.out.println("Program Ended");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while(choice != 6);
    }
}