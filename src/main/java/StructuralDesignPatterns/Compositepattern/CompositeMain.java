package StructuralDesignPatterns.Compositepattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {
    public static void main (String args[]){

        Physics physics= new Physics("physics",200);
        Chemistry chemistry= new Chemistry("chemistry",300);
        Maths maths= new Maths("maths",400);

        List<Subject> pcmlist= new ArrayList<>();
        pcmlist.add(0,physics);
        pcmlist.add(1,chemistry);
        Course PCM= new Course("PCM",pcmlist);
        System.out.println("Subject offered in the Course is " + PCM.getSubjectName() + " ");
        System.out.println("Fees offered in the PCM Course is " + PCM.getFees());
        PCM.addSubject(maths);
        System.out.println("Subject offered in the Course is " + PCM.getSubjectName() + " ");
    }
}
