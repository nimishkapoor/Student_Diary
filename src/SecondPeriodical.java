


public class SecondPeriodical implements Mark{
    int mark;
    public SecondPeriodical(){
        mark = 0;
    }
    public SecondPeriodical(int mark){
        this.mark = mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public void addMark(){
        System.out.println("SECOND PERIODICAL MARKS : ");

    }
    public void printMark(){
        System.out.println("SECOND PERIODICAL MARKS : " + mark);
    }

    public String toString(){
        return "Second Periodical Mark:" + this.mark + '\n';
    }
}

