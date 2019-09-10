


import java.io.Serializable;
import java.util.Scanner;

public class StudentInfo  extends Student implements Serializable{
	long phno;
	String address;
	public StudentInfo() {
		super();
		phno = 0;
		address = "";
	}
	public StudentInfo(long phno, String addr) {
		this.address = addr;
		this.phno = phno;
	}
	public long getPhoneNo() {
		return phno;
	}
	public String getAddress() {
		return address;
	}
	public void setStudentInfo(long phno, String addr) {
		this.phno = phno;
		this.address = addr;
	}
	
	public void newStudentInfo() {
	try {	
			this.newStudent();
			System.out.println("*******ENTER STUDENT ADDRESS AND CONTACT*******");
			System.out.println();
			System.out.println("ADDRESS");
			Scanner in = new Scanner(System.in);
			address = in.next();
			System.out.println();
			System.out.println("PHONE NUMBER");
			phno = in.nextLong();
			int length=0; 
			long n = phno;
			while(n != 0) {
				n = n/10;
				length++;
			}
			if(length != 10) throw new InvalidPhoneNumberException();
			
	}catch(InvalidPhoneNumberException e) {
		System.out.println(e);
		System.exit(0);
			
	}
	}

	public void printPDetail() {
		System.out.println("*******ADDRESS AND CONTACT*******");
		System.out.println();
		System.out.println("Address:"+ this.address);
		System.out.println();
		System.out.println("Phone no:"+ this.phno );
		System.out.println();
	}


}
