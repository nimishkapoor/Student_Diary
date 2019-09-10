

public class FirstPeriodical implements Mark{
    int mark;
    public FirstPeriodical(){
        mark = 0;
    }
    public FirstPeriodical(int mark){
        this.mark = mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public void addMark(){
        System.out.println("1st PERIODICAL MARK : ");

    }
    public void printMark(){
        System.out.println("1st PERIODICAL MARK : " + mark);
    }
    public String toString(){
        return "First Periodical Mark:" + this.mark + '\n';
    }
}

