package sg.edu.nus.iss.epat.workshop;

public class SalesEmployee extends Employee {
	SalesComission salesComission;
	
	public SalesEmployee (String name, float salary, 
	      float commissionRate, int salesMade){
		super(name, salary);
		salesComission = new SalesComission(commissionRate, salesMade);
	}

	
}
