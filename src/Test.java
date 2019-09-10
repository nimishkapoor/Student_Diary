//    ____ _____ _   _ ____  _____ _   _ _____   ____ ___    _    ______   __
//   / ___|_   _| | | |  _ \| ____| \ | |_   _| |  _ \_ _|  / \  |  _ \ \ / /
//   \___ \ | | | | | | | | |  _| |  \| | | |   | | | | |  / _ \ | |_) \ V / 
//    ___) || | | |_| | |_| | |___| |\  | | |   | |_| | | / ___ \|  _ < | |  
//   |____/ |_|  \___/|____/|_____|_| \_| |_|   |____/___/_/   \_\_| \_\|_|  
                                                                         

//  ______   __    _   _ ___ __  __ ___ ____  _   _     _  __    _    ____   ___   ___  ____    
// | __ ) \ / /   | \ | |_ _|  \/  |_ _/ ___|| | | |   | |/ /   / \  |  _ \ / _ \ / _ \|  _ \   
// |  _ \\ V /    |  \| || || |\/| || |\___ \| |_| |   | ' /   / _ \ | |_) | | | | | | | |_) |  
// | |_) || |     | |\  || || |  | || | ___) |  _  |   | . \  / ___ \|  __/| |_| | |_| |  _ <   
// |____/ |_|_    |_| \_|___|_|  |_|___|____/|_| |_|   |_|\_\/_/___\_\_|__  \___/ \___/|_| \_\



//     _    __  __   _____ _   _  _   _ _  _    ____ ____  _____ _  __    ___  _  _    __   
//    / \  |  \/  | | ____| \ | || | | | || |  / ___/ ___|| ____/ |/ /_  / _ \| || |  / /_  
//   / _ \ | |\/| | |  _| |  \| || | | | || |_| |   \___ \|  _| | | '_ \| | | | || |_| '_ \ 
//  / ___ \| |  | |_| |___| |\  || |_| |__   _| |___ ___) | |___| | (_) | |_| |__   _| (_) |
// /_/   \_\_|  |_(_)_____|_| \_(_)___/   |_|  \____|____/|_____|_|\___/ \___/   |_|  \___/ 





import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;




public class Test {
    public void writefile(ArrayList<Diary> sd){
        try{
            FileOutputStream f = new FileOutputStream("Diary.obj");
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(sd);
            f.close();
            oos.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public ArrayList<Diary> readfile(){
        ArrayList<Diary> sd = new ArrayList<Diary>();
        try{
            FileInputStream f = new FileInputStream("Diary.obj");
            ObjectInputStream ois = new ObjectInputStream(f);
            ArrayList<Diary> s = (ArrayList<Diary>) ois.readObject();
            for(Diary i:s)
                sd.add(i);
            f.close();
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    return sd;
    }
    public static void main(String[] args){

    	
    	Test T=new Test();
    	
    	
    	
    	
        ArrayList<Diary> sd = new ArrayList<Diary>();
        Scanner in = new Scanner(System.in);
        int ch1 = -1;
        while(ch1!=6){
            System.out.println("*******MAIN MENU*******");
            System.out.println();
            System.out.println("1.NEW STUDENT ENTRY");
            System.out.println("2.EXISTING STUDENT");
            System.out.println("3.PRINT");
            System.out.println("4.WRITE FILE");
            System.out.println("5.READ FILE");
            System.out.println("6.EXIT");
            ch1 = in.nextInt();
            switch(ch1){
                case 1: Diary s = new Diary();
                        int ch2 = -1;
                        while(ch2!=3) {
                            System.out.println("*******ADD DETAILS*******");
                            System.out.println();
                            System.out.println("1.ENTER STUDENT DETAILS");
                            System.out.println("2.ENTER ACADEMIC DETAILS");
                            
                            System.out.println("3.RETURN TO MAIN MENU");
                            ch2 = in.nextInt();
                            switch(ch2){
                                case 1:s.addStudentInfo();
                                    break;
                                case 2:s.addAcademicInfo();
                                break;
                                
                            }
                        }
                        break;
                case 2:System.out.println("ENTER ROLLNO TO BE MODIFIED : ");
                       String roll = in.next();
                       Diary modStud = new Diary();
                       for(Diary i:sd){
                           if(i.ptd.getRollNo().equals(roll)) {
                               modStud = i;
                               break;
                           }
                       }
                       int ch3 = -1;
                    while(ch3!=2){
                        System.out.println("1.ACADEMIC DETAILS");
                        System.out.println("2.Exit");
                        ch3 = in.nextInt();
                        switch(ch3){
                            case 1:int ch4 = -1;
                                    System.out.println("SEMESTER NO : ");
                                    int semNo = in.nextInt();
                                    System.out.println("COURSENAME : ");
                                    String cn = in.next();
                                    int courseIndex=0;
                                    for(Course i : modStud.acd.semester.get(semNo-1).courses){
                                        if(i.courseName.equals(cn))
                                            break;
                                        courseIndex++;
                                    }
                                }
                          
                        }
                case 3:
                	Diary pp = new Diary();
                	for(Diary i:sd){
                		pp=i;
                	pp.ptd.printAll();
                	pp.acd.print();
                
                	}
                	break;
                case 4:T.writefile(sd);
                System.out.println("SUCCESS!");
                break;
                case 5:ArrayList<Diary> pd = new ArrayList<Diary>();
                pd=T.readfile();
                Diary temp=new Diary();
                for(Diary i:pd){
                	temp=i;
                	temp.ptd.printAll();
                	temp.acd.print();
                	
                }
                break;
                case 6:
                	System.out.println("CLOSING PROGRAM!");
                	System.exit(0);
            }
        }
    }
}

