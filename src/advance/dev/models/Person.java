package advance.dev.models;
public class Person {
  protected String name;
  protected int old;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}

  public Person(String name, int old) {
    super();
    this.name = name;
    this.old = old;
  }
}