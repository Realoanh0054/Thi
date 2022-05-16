package advance.dev.models;
public class Student extends Person {
	// Thuoc tinh
	private double mark;

	// Phuong thuc
    // Ham khoi tao co doi so
	
  public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

public Student(String name, int old, double mark) {
    super(name, old);
    // TODO Auto-generated constructor stub
  }
}