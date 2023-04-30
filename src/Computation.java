public class Computation {
    String mon;
    String tues;
    String wed;
    String thurs;
    String fri;
    double timeIn, timeOut;
    public static String dash = "----------------------------------------------------------------";

    public static String tabs = "\t\t\t";

    Employee employee;
    double dailyWorkingHours;
    double totalWorkingHours;

    public double weeklyGrossIncome;
    public double weeklyRiceSubsidy;
    public double weeklyPhoneAllowance;
    public double weeklyClothingAllowance;
    public double weeklyTaxDue;
    public double weeklySssContri;
    public double weeklyPhilhealthContri;
    public double weeklyPagibigContri;

    public double totalGrossIncome;
    public double totalWeeklyDeductions;
    public double weeklyNetIncome;

    public Computation(String mon, String tues, String wed, String thurs, String fri, Employee employee) {
        this.mon = mon;
        this.tues = tues;
        this.wed = wed;
        this.thurs = thurs;
        this.fri = fri;
        this.employee = employee;

        this.timeIn = computeTime(employee.timeIn);
        this.timeOut = computeTime(employee.timeOut);

        this.dailyWorkingHours = ((this.timeOut - this.timeIn) / 3600 - 1) * 5;
        this.totalWorkingHours = this.dailyWorkingHours * 5;

        this.weeklyGrossIncome = (this.totalWorkingHours * employee.hourlyRate);
        this.weeklyRiceSubsidy = (employee.riceSubsidy / 21) * 5;
        this.weeklyPhoneAllowance = (employee.phoneAllowance / 21) * 5;
        this.weeklyClothingAllowance = (employee.clothingAllowance / 21) * 5;
        this.weeklyTaxDue = (employee.taxDue / 21) * 5;
        this.weeklySssContri = (employee.sssContri / 21) * 5;
        this.weeklyPhilhealthContri = (employee.philhealhtContri / 21) * 5;
        this.weeklyPagibigContri = (employee.pagibigContri / 21) * 5;


        this.totalGrossIncome = this.weeklyGrossIncome + (this.weeklyRiceSubsidy + this.weeklyPhoneAllowance +
                this.weeklyClothingAllowance);

        this.totalWeeklyDeductions = (this.weeklyTaxDue + this.weeklySssContri + this.weeklyPhilhealthContri +
                weeklyPagibigContri);

        this.weeklyNetIncome = (this.totalGrossIncome - this.totalWeeklyDeductions);

    }

    public static double computeTime(String time) {
        String[] timeComponentsIn = time.split(":");
        double hours = Integer.parseInt(timeComponentsIn[0]);
        double minutes = Integer.parseInt(timeComponentsIn[1]);
        double seconds = Integer.parseInt(timeComponentsIn[2]);
        return (hours * 3600) + (minutes * 60) + seconds;
    }

}
