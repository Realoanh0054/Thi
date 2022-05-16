package advance.dev.dao;

import java.util.ArrayList;
import java.util.List;

import advance.dev.models.Person;

public class Manager implements IManager {
	private List<Person> list = new ArrayList<Person>();
	@Override
	public void add(Person p) {
		// TODO Auto-generated method stub
		list.add(p);
	}
	@Override
	public Person get(int index) {
		// TODO Auto-generated method stub
		return list.get(index);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (Person p : list) {
			System.out.println(p);
			
		}
	}

	@Override
	public void findExcelentStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findExcellentTeacher() {
		// TODO Auto-generated method stub
		for (Person p : list) {
			System.out.println(p);
			
		}	
	}

}
