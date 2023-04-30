import java.text.DecimalFormat;

public class Employee {
    public static String dash = "----------------------------------------------------------------";
    public static String tabs = "\t\t\t";

    public int id;
    public String lastName;
    public String firstName;
    public String birthDate;
    public String address;
    public String phoneNumber;
    public String sss;
    public String philhealth;
    public String tin;
    public String pagibig;
    public String status;
    public String position;
    public String iSupervisor;
    public double basicSalary;
    public double riceSubsidy;
    public double phoneAllowance;
    public double clothingAllowance;
    public double taxDue;
    public double sssContri;
    public double philhealhtContri;
    public double pagibigContri;

    public String fullName;
    public double grossRate;
    public double hourlyRate;


    public String timeIn;
    public String timeOut;

    Computation computation;

    public Employee(int id, String lastName, String firstName, String birthDate, String address, String phoneNumber, String sss, String philhealth, String tin, String pagibig, String status, String position, String iSupervisor, double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance, double taxDue, double sssContri, double philhealhtContri, double pagibigContri,
                    String timeIn, String timeOut) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sss = sss;
        this.philhealth = philhealth;
        this.tin = tin;
        this.pagibig = pagibig;
        this.status = status;
        this.position = position;
        this.iSupervisor = iSupervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.taxDue = taxDue;
        this.sssContri = sssContri;
        this.philhealhtContri = philhealhtContri;
        this.pagibigContri = pagibigContri;
        this.fullName = firstName + " " + lastName;
        this.grossRate =  this.basicSalary / 2;
        this.hourlyRate = (this.basicSalary / 21) / 8;

        this.timeIn = timeIn;
        this.timeOut = timeOut;

        this.computation = new Computation(
                "05-Sept-2022",
                "06-Sept-2022",
                "07-Sept-2022",
                "08-Sept-2022",
                "09-Sept-2022",
                this
                );
    }

    public String printNumberWithCommas(double amount) {
        DecimalFormat formatter = new DecimalFormat("PHP ##,###.00");
        String formattedNumber = formatter.format(amount);
        return String.format(formattedNumber, amount);
    }

    public void displayData() {
        String tabs = "\t\t\t";
        String idTitle = "EMPLOYEE NUMBER";
        String lastNameTitle = "LAST NAME";
        String firstNameTitle = "FIRST NAME";
        String birthDateTitle = "BIRTHDATE";
        String fullNameTitle = "FULL NAME";
        String addressTitle = "ADDRESS";
        String phoneNumberTitle = "PHONE NUMBER";
        String sssTitle = "SSS NO.";
        String philhealthTitle = "PHILHEALTH NO.";
        String tinTitle = "TIN NO.";
        String pagibigTitle = "PAG-IBIG NO.";
        String statusTitle = "STATUS";
        String positionTitle = "POSITION";
        String iSupervisorTitle = "IMMEDIATE SUPERVISOR";
        String basicSalaryTitle = "BASIC SALARY";
        String riceSubsidyTitle = "RICE SUBSIDY";
        String phoneAllowanceTitle = "PHONE ALLOWANCE";
        String clothingAllowanceTitle = "CLOTHING ALLOWANCE";

        System.out.println("EMPLOYEE DETAILS\n" +
                fullNameTitle + ":" + tabs + fullName + "\n" +
                birthDateTitle + ":" + tabs + birthDate + "\n" +
                addressTitle + ":" + tabs + address + "\n" +
                phoneNumberTitle + ":" + tabs + phoneNumber + "\n" +
                sssTitle + ":" + tabs + sss + "\n" +
                philhealthTitle + ":" + tabs + philhealth + "\n" +
                tinTitle + ":" + tabs + tin + "\n" +
                pagibigTitle + ":" + tabs + pagibig + "\n" +
                statusTitle + ":" + tabs + tabs + status +"\n" +
                positionTitle + ":" + tabs + position + "\n" +
                basicSalaryTitle + ":" + tabs +
                this.printNumberWithCommas(basicSalary) + "\n" +
                riceSubsidyTitle + ":" + tabs +
                this.printNumberWithCommas(riceSubsidy) + "\n" +
                phoneAllowanceTitle + ":" + tabs +
                this.printNumberWithCommas(phoneAllowance) + "\n" +
                clothingAllowanceTitle + ":" + tabs +
                this.printNumberWithCommas(clothingAllowance));
        System.out.println("----------------------------------------------------------------");
    }


    public void displaySalaryComputation() {

        String idTitle = "EMPLOYEE NUMBER";
        String lastNameTitle = "LAST NAME";
        String firstNameTitle = "FIRST NAME";
        String birthDateTitle = "BIRTHDATE";
        String fullNameTitle = "FULL NAME";
        String addressTitle = "ADDRESS";
        String phoneNumberTitle = "PHONE NUMBER";
        String sssTitle = "SSS NO.";
        String philhealthTitle = "PHILHEALTH NO.";
        String tinTitle = "TIN NO.";
        String pagibigTitle = "PAG-IBIG NO.";
        String statusTitle = "STATUS";
        String positionTitle = "POSITION";
        String iSupervisorTitle = "IMMEDIATE SUPERVISOR";
        String basicSalaryTitle = "BASIC SALARY";
        String riceSubsidyTitle = "RICE SUBSIDY";
        String phoneAllowanceTitle = "PHONE ALLOWANCE";
        String clothingAllowanceTitle = "CLOTHING ALLOWANCE";
        String grossRateTitle = "GROSS SEMI-MONTHLY RATE";
        String hourlyRateTitle = "HOURLY RATE";
        String hoursWorkedTitle = "TOTAL HOURS WORKED";
        String grossIncomeTitle = "GROSS WEEKLY INCOME";
        String timeInTitle = "TIME IN";
        String timeOutTitle = "TIME OUT";
        String remarksTitle = "REMARKS";
        String dateTitle = "DATE";
        final String govDeductions = "GOVERNMENT MANDATORY DEDUCTIONS";


        System.out.println(dash);
        System.out.println("WEEKLY SALARY COMPUTATION");
        System.out.println("September 5-9, 2022");
        System.out.println();

        Computation computation = this.computation;

        System.out.println("WEEKLY BASIC SALARY: " + tabs  +
                printNumberWithCommas(computation.weeklyGrossIncome) + "\n" + riceSubsidyTitle + ":" +
                tabs + tabs + "\t" + printNumberWithCommas(this.riceSubsidy) + "\n" + phoneAllowanceTitle +
                ":" + tabs + tabs + printNumberWithCommas(this.phoneAllowance) + "\n" +
                clothingAllowanceTitle + ":" + tabs + tabs +
                printNumberWithCommas(this.clothingAllowance));
        System.out.println();
        System.out.println("TOTAL WEEKLY GROSS INCOME: " + tabs + "\t" +
                printNumberWithCommas(computation.weeklyGrossIncome));
        System.out.println();
        System.out.println(govDeductions + "\n" + "TAX: " + tabs + tabs + tabs +
                printNumberWithCommas(computation.weeklyTaxDue) +
                "\n" + sssTitle + ":" + tabs + tabs  + printNumberWithCommas(computation.weeklySssContri) + "\n" +
                philhealthTitle + ":" + tabs + tabs + "\t" + printNumberWithCommas(computation.weeklyPhilhealthContri) +
                "\n" + pagibigTitle + ":" + tabs + tabs + "\t" +
                printNumberWithCommas(computation.weeklyPagibigContri));
        System.out.println();
        System.out.println("TOTAL WEEKLY NET INCOME: " + tabs + "\t" +
                printNumberWithCommas(computation.weeklyNetIncome));
        System.out.println();
        System.out.println();
        System.out.println(dash);
        System.out.println("***CONFIDENTIAL***");
        System.out.println(dash);

    }

    public void displayTimeKeeping() {
        System.out.println(this.id + tabs + this.lastName + tabs + this.firstName + tabs + this.position +
                tabs + "\t" + this.computation.totalWorkingHours);
    }





}
