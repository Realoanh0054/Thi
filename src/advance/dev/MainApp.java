package advance.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import advance.dev.dao.IManager;
import advance.dev.dao.Manager;
import advance.dev.models.Person;
import advance.dev.models.Student;
import advance.dev.models.Teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainApp {
	static List<Person> readFromFile(String fileName) throws Exception{
		List<Person> arrList  = new LinkedList<Person>();
		
		FileInputStream fts = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(fts));
		String strLine;
		while((strLine = br.readLine()) != null) {
			if(strLine.indexOf("#sv") == 0){
				String name = strLine.substring(1,strLine.length());
				int old = Integer.parseInt(strLine);
				double mark = Double.parseDouble(br.readLine());
				Student sv = new Student(name,old, mark);
				arrList.add(sv);
			}
			
			if(strLine.indexOf("#tc") == 0){
				String name = strLine.substring(1,strLine.length());
				int old = Integer.parseInt(strLine);
				double salary = Double.parseDouble(br.readLine());
				Teacher tc = new Teacher(name,old,salary);
				arrList.add(tc);
			}
		}
		return arrList;
		}
	static void print(List<Person> Person) {
		Iterator<Person> it = Person.iterator();
		while (it.hasNext()) {
			Person p =  it.next();
			if (p instanceof Teacher) {
				Teacher tc = (Teacher) Person;
				System.out.println(tc.toString());
			}else if (Person instanceof Student) {
				Student sv = (Student) Person;
				System.out.println(sv.toString());	
			}
		}
	}
	
	static void findMax(List<Person> personList) {
		Iterator<Person> it = personList.iterator();
		Student sv = null;
		Teacher tc = null;
		while (it.hasNext()) {
			Person person = it.next();
			if (person instanceof Student == true) {
				Student student = (Student) person;
				if (sv == null) {
					sv = student;
				}else if (sv.getMark() < student.getMark()) {
					sv = student;
				}
			}
			if (person instanceof Teacher == true) {
				Teacher teacher = (Teacher) person;
				if (tc == null) {
					tc = teacher;
				}else if (tc.getSalary() < teacher.getSalary()) {
					tc = teacher;
				}
			}
		}
		System.out.println("Student co diem trung binh cao nhat la: ");
		System.out.println(sv.toString());
		System.out.println("Teacher co diem trung binh cao nhat la:");
		System.out.println(tc.toString());
	}
	

  public static void main(String[] args) {
    IManager Manager = new Manager();
    try {
      FileInputStream fis = new FileInputStream("in.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(fis));
      String line= ":";
      while ((line = br.readLine()) != null) {
    	  System.out.println(line);
    	  
      }
     System.out.println();
		
	
    } catch (FileNotFoundException e) {
      // TODO: handle exception
      e.printStackTrace();
    } catch (IOException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
    Manager.print();
  }
}
