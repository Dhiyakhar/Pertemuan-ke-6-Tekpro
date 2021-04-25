class Employee{
    private String name;
    protected double salary;	//*ubah salary dari "private" menjadi "protected"*//
    private int hireday;
    private int hiremonth;
    private int hireyear;

    //constructor
    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }
    
  //Getter and setter for all the instance variables.
    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    //kenaikan gaji sebesar n persen
    public void raiseSalary(double byPercent) {		
        salary *= 1 + byPercent / 100;
    }
    
    //Setter tahun
    public int hireYear() {							
        return hireyear;
    }
}
