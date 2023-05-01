import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.lang.Math;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static String dash = "----------------------------------------------------------------";
    public static String tabs = "\t\t\t";

    public void displayData() {
        final String companyName = "MOTOR PH DATABASE";
        final String hoursWorked = "TOTAL HOURS WORKED";
        final String totalWeekIncome = "TOTAL WEEKLY INCOME";
        final String govDeductions = "GOVERNMENT MANDATORY DEDUCTIONS";
        String attendance = "ATTENDANCE";
        String week = "September 5-9, 2022";

//   Title of database


//tabs shortcut
        String tabs = "\t\t\t";
    }

    public static void passwordPrompt() {
        Scanner input = new Scanner(System.in);
        String pass = "******";
        String admin = "admin";
        String passcode = "admin123";
        String user = "";
        String password = "";

        System.out.println("Hello, Admin! Please Login");

        int count = 1;
        while (count < 4) {

            System.out.print("\nEnter Username:");
            user = input.nextLine();
            System.out.print("Enter Password:");
            password = input.nextLine();

            count++;
            if (count > 3) {
                System.out.println("Not authorized. Goodbye");
                System.exit(0);
            }

            if ((user.equals(admin)) && (password.equals(passcode))) {
                System.out.println(dash);
                System.out.println("Username: " + admin);
                System.out.println(dash);
                System.out.println("MOTORPH PAYROLL SYSTEM" + "\n" + "(1) List of Employees" + "\n"+
                        "(2) Employee's Profile" + "\n" +
                        "(3) Time Keeping" + "\n" + "(4) Salary Computation" + "\n" + "(5) Logout");
                System.out.println(dash);
                break;

            } else {
                System.out.println("Incorrect username or password, please try again!");
            }


        }
    }

    public static void main(String[] args) {


        Employee employee1 = new Employee(
                10001,
                "Crisostomo",
                "Jose",
                "February 14, 1984",
                "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands",
                "918-621-603",
                "49-1632020-8",
                "382189453145",
                "317-674-022-000",
                "441093369646",
                "Regular",
                "HR Manager",
                "None",
                62670.00,
                1500,
                1000,
                1000,
                9526.34,
                581.30,
                550,
                100,
                "08:00:00",
                "17:00:00"
        );
        Employee employee2 = new Employee(
                10002,
                "Mata",
                "Christian",
                "October 21, 1987",
                "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu ",
                "783-776-744",
                "49-2959312-6",
                "824187961962",
                "103-100-522-000",
                "4631052853464",
                "Regular",
                "Account Team Leader",
                "Romualdez, Fredrick",
                42975.00,
                1500,
                800,
                800,
                7532.12,
                581.30,
                550,
                100,
                "08:00:00",
                "17:00:00"
        );
        Employee employee3 = new Employee(
                10003,
                "San Jose",
                "Brad",
                "March 15, 1996",
                "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi",
                "797-009-261",
                "40-2400714-1",
                "239192926939",
                "672-474-690-000",
                "210850209964",
                "Regular",
                "HR Team Leader",
                "Crisostomo, Jose",
                42975,
                1500,
                800,
                800,
                7532.12,
                581.30,
                550,
                100,
                "11:30:00",
                "17:00:00"
        );

        Employee employees[] = {employee1, employee2, employee3};
        System.out.println();
        passwordPrompt();

        int[] employeeIds = new int[employees.length];
        for (int i = 0; i < employees.length; i++) {
            int employeeId = employees[i].id;
            employeeIds[i] = employeeId;
        }

        Scanner input = new Scanner(System.in);

        int option = input.nextInt();

        if(option == 1) {
            for(int i=0; i< employees.length; i++) {
                System.out.println(
                        employees[i].id +
                                tabs +
                                employees[i].lastName +
                                tabs +
                                employees[i].firstName +
                                tabs +
                                employees[i].position +
                                tabs +
                                employees[i].computation.totalWorkingHours
                );
            }
        }

        if(option == 2) {
            System.out.println("EMPLOYEE'S PROFILE\n");
            for(int i=0; i < employeeIds.length; i++) {
                System.out.println("("+(i+1)+") " + employeeIds[i]);
            }

            int idNoEmployeeProfile = input.nextInt();
            for(int i=0; i< employees.length; i++) {
                if(employees[i].id == idNoEmployeeProfile) {
                    employees[i].displayData();
                }
            }
        }

        //time keeping
        if(option == 3) {
            final String hoursWorkedTitle = "TOTAL HOURS WORKED";
            final String week = "September 5-9, 2022";
            String idTitle = "EMPLOYEE NUMBER";
            String lastNameTitle = "LAST NAME";
            String firstNameTitle = "FIRST NAME";
            String positionTitle = "POSITION";

            System.out.println(dash);
            System.out.println(hoursWorkedTitle);
            System.out.println(week);
            System.out.println(dash);

            System.out.println(idTitle + tabs + lastNameTitle + "\t" + tabs + firstNameTitle + tabs +
                    positionTitle + tabs + "\t" + hoursWorkedTitle);

            for(int i=0; i< employees.length; i++) {
                employees[i].displayTimeKeeping();
            }

            System.out.println(dash);
        }

        //salary computation
        if(option == 4) {
            System.out.println("EMPLOYEE'S PROFILE\n");
            for(int i=0; i < employeeIds.length; i++) {
                System.out.println("("+(i+1)+") " + employeeIds[i]);
            }

            int idNoEmployeeProfile = input.nextInt();
            for(int i=0; i< employees.length; i++) {
                if(employees[i].id == idNoEmployeeProfile) {
                    employees[i].displaySalaryComputation();
                }
            }
        }

        //logout
        if(option == 5) {
            System.out.println("Logged out!");
            passwordPrompt();
        }
    }
}







    










