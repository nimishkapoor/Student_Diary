

import java.util.ArrayList;

public class CGPA {
        float cgpa;
        CGPA(){
            cgpa= 0;
        }
        public void setGpa(ArrayList<SemesterInfo> s){
            for(SemesterInfo i:s) {
                cgpa += i.sgpa.getSgpa();
            }
            cgpa /= cgpa/s.size();
        }
        public float getGpa(){
            return cgpa;
        }
        public String toString(){
            return '\n' + "CUMLATIVE GPA : " + cgpa;
        }
        public void print(){
            System.out.println(toString());
        }


}
