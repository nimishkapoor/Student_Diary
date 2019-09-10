

import java.util.Scanner;

public class ContinuousAssesment{
    int mark;
    public ContinuousAssesment(){
        mark = 0;
    }
    public ContinuousAssesment(int mark){
        this.mark = mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public void addMark(){
        System.out.println("CONTINUOUS ASSESMENT MARKS : ");
        Scanner in = new Scanner(System.in);
        this.mark = in.nextInt();
    }
    public void printMark(){
        System.out.println("CONTINUOUS ASSESMENT MARKS : " + mark);
    }

    public String toString(){
        return "CONTINUOUS ASSESMENT MARKS : " + this.mark + '\n';
    }
}
