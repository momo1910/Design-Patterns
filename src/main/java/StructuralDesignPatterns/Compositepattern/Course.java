package StructuralDesignPatterns.Compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject{
    String courseName;
    int fees ;
    List<Subject> subjectList= new ArrayList<>();

    public Course(String courseName, List<Subject> subjectList) {
        this.courseName = courseName;
        this.subjectList = subjectList;
        this.fees=setFees(subjectList);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getFees() {
        return fees;
    }

    public int setFees(List<Subject> subjectList) {
        fees=0;
        for (Subject subject:subjectList) {
             fees+=subject.getFees();
        }
        this.fees = fees;
        return fees;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String getSubjectName() {
        String CourseSubject="";
        for (Subject subject:subjectList) {
            CourseSubject+=subject.getSubjectName() + " ";
        }
        return CourseSubject;
    }
    public void addSubject(Subject subject){
        subjectList.add(subject);
    }
    public void deleteSubject(Subject subject){
        subjectList.remove(subject);
    }
}
