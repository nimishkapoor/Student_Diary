



import java.io.Serializable;
import java.util.Scanner;

public class ParentInfo  extends StudentInfo  implements Serializable {
	String fatherName;
	String motherName;
	String Phno;
	String fatherOccupation;
	public ParentInfo() {
		super();
		fatherName = "";
		motherName = "";
		Phno = "";
		String fatherOccupation = "";
	}
	public ParentInfo(String father, String mother, String phno, String fatherocp) {
		super();
		this.fatherName = father;
		this.motherName = mother;
		this.Phno = phno;
		this.fatherOccupation = fatherocp;
	}
	public void setParentInfo(String father, String mother, String phno, String fatherocp) {
		this.fatherName = father;
		this.motherName = mother;
		this.Phno = phno;
		this.fatherOccupation = fatherocp;
	}
	public String getFatherName() {
		return fatherName;
		
	}
	public String getMotherName() {
		return motherName;
		
	}
	
	public String getPhno() {
		return Phno;
		
	}
	public String getFatherOccupation() {
		return fatherOccupation;
		
	}
	public void newParentInfo() {
		try {
			super.newStudentInfo();
			System.out.println("*******PARENTS DETAIL*******");
			System.out.print("FATTHER'S NAME : ");
			Scanner in = new Scanner(System.in);
			this.fatherName = in.next();
			System.out.print("MOTHER'S NAME : ");
			this.motherName = in.next();
			System.out.print("FATHER'S OCCUPATION : ");
			fatherOccupation = in.next();
			System.out.print("PHONE NUMBER : ");
			Phno = in.next();
			if(Phno.length() != 10) throw new InvalidPhoneNumberException();
			 
	}catch(InvalidPhoneNumberException e) {
		System.out.println(e);
		System.exit(0);
			
	}
	}

	public void printParentDetails() {
		System.out.println("*******PARENT DETAILS*******");
		System.out.println();
		System.out.println("FATHER NAME:" + fatherName);
		System.out.println();
		System.out.println("MOTHER NAME:" + motherName);
		System.out.println();
		System.out.println("PHONE NUMBER :" + Phno);
		System.out.println();
		System.out.println("FATHER'S OCCUPATION :" + fatherOccupation);
		
	}
	public void printAll(){
		this.printInfo();;
		this.printPDetail();
		this.printParentDetails();


	}
	
}
