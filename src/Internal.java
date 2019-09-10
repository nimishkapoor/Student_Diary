

public class Internal {
    float mark;
    public Internal(){
        mark = 0;
    }

    public void setMark(FirstPeriodical fpmk, SecondPeriodical spmk, ContinuousAssesment camk) {

        this.mark = fpmk.getMark() * 15 / 50 +  spmk.getMark() * 15 / 50 + camk.getMark();
    }
    public float getMark(){
        return mark;
    }
    public String toString(){
        return "\nINTRNALS : " + mark + '\n';
    }
    public void printDetail(){
        System.out.println(toString());
    }
}

