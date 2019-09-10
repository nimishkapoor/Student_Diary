

import java.util.Scanner;

public class Course {

    String courseName;
    String courseCode;
    FirstPeriodical fpmk;
    SecondPeriodical spmk;
    EndSemester endsemmk;
    Internal imk;
    ContinuousAssesment camk;
    GPA gpa;
    boolean supply = false;

    public Course() {
        fpmk = new FirstPeriodical();
        spmk = new SecondPeriodical();
        endsemmk = new EndSemester();
        imk = new Internal();
        camk = new ContinuousAssesment();
        gpa = new GPA();
    }

    public void addCourse() {
        Scanner in = new Scanner(System.in);
        System.out.println("COURSE CODE : ");
        courseName = in.nextLine();
        System.out.println("COURSE NAME : ");
        courseCode = in.next();
    }

    public void CalculateInternal() {
        imk.setMark(fpmk, spmk, camk);
    }

    public void CalculateGPA() {
        gpa.setGpa(imk, endsemmk);
    }
    public String toString(){
        return "COURSE NAME : " + courseName + '\n' + "COURSE CODE : " + courseCode + '\n' +fpmk.toString() + spmk.toString() + endsemmk.toString() + imk.toString() + camk.toString() + gpa.toString();
    }
    public void print() {
        System.out.println(toString());
    }
    public void addSupply(){
        supply = true;
    }
}


