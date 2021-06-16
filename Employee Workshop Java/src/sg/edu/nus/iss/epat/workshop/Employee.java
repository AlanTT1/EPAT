package sg.edu.nus.iss.epat.workshop;

public abstract class Employee {
	private String name;
	private float salary;
	private float variableComponent;
	
	public Employee (String name, float salary){
		this.name = name;
		this.salary = salary;
	}
	
	public float getBaseSalary() { return salary; }
	public String getName() { return name;}
	public float computeDeductions() { return salary*0.2f;}
	public float computeSalary() {
		return getBaseSalary() 
				- computeDeductions() + variableComponent();
	}
	public float variableComponent() {
		return variableComponent;
	}

	public float getVariableComponent() {
		return variableComponent;
	}

	public void setVariableComponent(float variableComponent) {
		this.variableComponent = variableComponent;
	}	

}

