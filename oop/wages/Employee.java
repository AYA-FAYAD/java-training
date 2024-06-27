public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmploy;
    

    public Employee (int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmploy ++;
    }

    public Employee (int baseSalary){
       this(baseSalary, 0);
    }
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate *extraHours);
    }
    public int calculateWage(){
        return  calculateWage(0);
    }


    private void setBaseSalary(int baseSalary){
        if (baseSalary <=0 ) {
            throw new IllegalArgumentException("Salary must be greter then 0");
        }
         this.baseSalary = baseSalary;
    }

    private int  getBaseSalary (){
        return baseSalary;
    }

    private void setHourlyRate (int hourlyRate){
        if (hourlyRate < 0){
              throw new IllegalArgumentException("no way ");
        }
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;

    }
}
