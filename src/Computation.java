public class SalaryComputation {
    String mon;
    String tues;
    String wed;
    String thurs;
    String fri;
    double timeIn, timeOut;

    public Employee employee;
    double dailyWorkingHours;
    double totalWorkingHours;
    public SalaryComputation(String mon,String tues,String wed,String thurs,String fri, Employee employee) {
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

        double weeklyGrossIncome = (this.totalWorkingHours * hourlyRate);
        double weeklyRiceSubsidy = (riceSubsidy / 21) * 5;
        double weeklyPhoneAllowance = (phoneAllowance / 21) * 5;
        double weeklyClothingAllowance = (clothingAllowance / 21) * 5;
        double weeklyTaxDue = (taxDue / 21) * 5;
        double weeklySssContri = (sssContri / 21) * 5;
        double weeklyPhilhealthContri = (philhealhtContri / 21) * 5;
        double weeklyPagibigContri = (pagibigContri / 21) * 5;
    }

    public static double computeTime(String time) {
        String[] timeComponentsIn = time.split(":");
        double hours = Integer.parseInt(timeComponentsIn[0]);
        double minutes = Integer.parseInt(timeComponentsIn[1]);
        double seconds = Integer.parseInt(timeComponentsIn[2]);
        return (hours * 3600) + (minutes * 60) + seconds;
    }

    public static double computeWeekly(double num) {
        return num * 5;
    }

}
