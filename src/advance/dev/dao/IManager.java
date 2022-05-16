package advance.dev.dao;

import advance.dev.models.Person;

public interface IManager {
	public void add(Person p);
	public Person get(int index);
	public void print();

public void findExcelentStudent(); //Tìm sinh viên có mark cao nhất
public void findExcellentTeacher(); //Tìm giáo viên có salary cao nhất

}