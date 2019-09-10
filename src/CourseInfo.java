
import java.util.Scanner;
public class CourseInfo {
    String degree;
    String branch;
    String batch;
    String year;

    public CourseInfo(){
        degree = "";
        branch = "";
        batch = "";
        year = "";
    }
    public CourseInfo(String degree, String course, String batch, String year){
        this.degree = degree;
        this.branch = course;
        this.batch = batch;
        this.year = year;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setCourseInfo(String degree, String course, String batch, String year){

        this.degree = degree;
        this.branch = course;
        this.batch = batch;
        this.year = year;
    }
    public void addCourseInfo(){
        System.out.println("DEGREE : ");
        Scanner in = new Scanner(System.in);
        degree = in.next();
        System.out.println();
        System.out.println("BRANCH : ");
        branch = in.next();
        System.out.println();
        System.out.println("BATCH : ");
        batch = in.next();
        System.out.println();
        System.out.println("CURRENT YEAR : ");
        year = in.next();
    }
    public String getDegree(){
        return degree;
    }
    public String getBranch(){
        return branch;
    }
    public String getBatch(){
        return batch;
    }
    public String getYear(){
        return year;
    }
    public void displayCourseInfo(){
        System.out.println("DEGREE:" + degree);
        System.out.println();
        System.out.println("BRANCH : " + branch);
        System.out.println();
        System.out.println("BATCH : " + batch);
        System.out.println();
        System.out.println("CURRENT YEAR : " + year);
        System.out.println();
    }

}

