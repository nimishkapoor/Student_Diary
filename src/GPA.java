

public class GPA {
    float gpa;
    GPA(){
        gpa = 0;
    }
    public void setGpa(Internal imk, EndSemester esmk){
        gpa = (imk.getMark() + esmk.getMark()/2)/10;
    }
    public float getGpa(){
        return gpa;
    }
    public String toString(){
        return "\nGPA:" + gpa;
    }
    public void print(){
        System.out.println(toString());
    }

    }


