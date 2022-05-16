package advance.dev.models;
public class Teacher extends Person {
	// Thuoc tinh
	private double salary;

	// Phuong thuc
    // Ham khoi tao co doi so


public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

public Teacher(String name, int old, double salary) {
    super(name, old);
    // TODO Auto-generated constructor stub
  }
}