package LAB4;

public class Contract extends Employee {

    private double nbHours = -1.0;
    private double hourRate = -1.0;
    private double percentHourSup  = -1.0;
    private static final double dueHour  = 40.0;
  
    Contract(String name) {
    //VOTRE CODE VIENT ICI
    }
  
    Contract (String name, double nbHours, double hourRate, double percentHourSup) {
    //VOTRE CODE VIENT ICI
    }
  
    public void setSalaryInfo(double nbHours, double hourRate, double percentHourSup) {
    //VOTRE CODE VIENT ICI
    }
    
     
    public double getSalary() {
    //VOTRE CODE VIENT ICI
    }
  
   public double getNbHours() {  
        return nbHours;
    }
  
    public double getHourRate() {
        return hourRate;
    }
  
    public double getPercentHourSup() {
        return percentHourSup;
    }
  
    public String toString() {
        return super.toString() + "; nbHours=" + nbHours + "; Hour rate=" + hourRate + "; % Hour Sup=" + percentHourSup;
    }
  
  }
  
  
