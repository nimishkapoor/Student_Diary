


import java.util.Date;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Student implements Serializable{
	String name;
	String rollno;
	Date DOB;
	
	public Student(){
		name = "";
		rollno = "";
		Calendar cal = Calendar.getInstance();
	    cal.set(2016, 1, 1);
		DOB = cal.getTime();
	}
	public Student(String name, String rollno, Date dob) {
		this.name = name;
		this.rollno = rollno;
		this.DOB = dob;
	}
	public String getName() {
		return name;
	}
	public Date getDate() {
		return DOB;
	}
	public String getRollNo() {
		return rollno;
	}

	public void newStudent() {
		System.out.println("*******ENTER STUDENT DETAILS*******");
		System.out.print("NAME : ");
		Scanner in = new Scanner(System.in);
		this.name = in.next();
		System.out.print("ROLL NO : ");
		this.rollno = in.next();
		System.out.print("DOB (DD/MM/YYYY) : ");
		int d, m, y;
		d = in.nextInt();
		m = in.nextInt();
		y = in.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(y, m-1, d);
		this.DOB = cal.getTime();
	}

	public void printInfo() {
		
		System.out.println("*******STUDENT INFO*******");
		System.out.println();
		SimpleDateFormat dateOnly = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("NAME :" + name );
		System.out.println();
		System.out.println("ROLL NI :" + rollno);
		System.out.println();
		System.out.println("DATE OF BIRTH :" + dateOnly.format(DOB));
		System.out.println();
	}
	public void setStudentObject(Student s){
		this.rollno = s.getRollNo();
		this.name = s.getName();
		this.DOB = s.getDate();
	}
	public Student getStudentObject(){
		Student s = new Student(this.rollno, this.name, this.DOB);
		return s;
	}
	
}
