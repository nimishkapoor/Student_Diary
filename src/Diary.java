



import java	.util.ArrayList;
import java.util.Scanner;

public class Diary {
    ParentInfo ptd;
    AcademicInfo acd;
    
    public Diary(){
        ptd = new ParentInfo();
        acd = new AcademicInfo();
    }
    public void addStudentInfo(){
        ptd.newParentInfo();
    }
    public void addAcademicInfo(){
        acd.addCourseInfo();
        Scanner in = new Scanner(System.in);

        System.out.println("NO OF COURSES : ");
        int c = in.nextInt();
        int i = 0;
        acd.addSem();

        while(i<c-1){
            acd.semester.get(acd.semester.size()).addCourse();
            i++;
        }
    }
}
