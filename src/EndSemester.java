


public class EndSemester implements Mark{
    int mark;
    public EndSemester(){
        mark = 0;
    }
    public EndSemester(int mark){
        this.mark = mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public void addMark(){
        System.out.println("END SEMESTER MARKS : ");

    }
    public void printMark(){
        System.out.println("END SEMESTER MARKS : " + mark);
    }

    public String toString(){
        return "END SEMESTER MARKS : " + this.mark + '\n';
    }
}
