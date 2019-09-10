
import java.util.ArrayList;

public class AcademicInfo extends CourseInfo{
    ArrayList<SemesterInfo> semester;
    CGPA cgpa;
    public AcademicInfo(){
        super();
        semester = new ArrayList<SemesterInfo>();
        cgpa = new CGPA();
    }
    public void addCourInfo(){
        this.addCourseInfo();
    }
    public void addSem(){
        SemesterInfo s = new SemesterInfo(this.semester.size()+1);
        s.addCourse();
        this.semester.add(s);
    }


    public String toString() {
        String st = "";
        for(SemesterInfo s:semester)
            st += s.toString();
        return st;
    }
    public void print(){
        System.out.println("*******ACADEMIC DETAILS*******");
        System.out.println("");
        this.displayCourseInfo();
        System.out.println(this.toString());
        System.out.println(cgpa.toString());
    }
 
    public void calculateCGPA(){
        cgpa.setGpa(semester);
    }
}
