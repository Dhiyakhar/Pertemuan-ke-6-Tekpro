import java.util.Calendar; 
import java.util.GregorianCalendar; 

class Manager extends Employee implements Sortable {		//*Langkah 1 : ubah extends diantara "Employee" dan "Sortable" dengan implements.*//
    private String secretaryName;
    
    //Constructor
    public Manager(String n, double s, int d, int m, int y) {	//Superclass dari Employee
        super(n, s, d, m, y);
        secretaryName = "";
    }

    //override methods raiseSalary yang ada pada Class Employee
    public void raiseSalary(double byPercent) {		
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }
    
    //Getter
    public String getSecretaryName() {	//Getter secretaryName
        return secretaryName;
    }

	@Override
	public int compare(Sortable b) {	//*Langkah 2 : Buat Override Sortable untuk mengurutkan.*//
		Manager eb= (Manager) b;    
		if (salary<eb.salary) 
			return -1;     
		if (salary>eb.salary) 
			return +1;
		return 0;
	}
}
