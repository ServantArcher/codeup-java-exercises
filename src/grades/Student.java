package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, int grade){
        this.name=name;
        this.grades=new ArrayList<>();
        this.addGrades(grade);
    }


    public String getNames() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrades(int grade){
        this.grades.add(grade);

    }

    public double getGradeAverage(){
        double total = 0;
        for(int grade: grades) {
            total += grade;
        }
            return (total/(grades.size()));
    }
    public static void main(String[] args) {
//        Student student;
//
//        student=new Student("Roger", 94);
//        System.out.println(student.getNames());
//        student.addGrades(34);
//        System.out.println(student.getGrades());
//        System.out.println("Here is the student avg: "+student.getGradeAverage());
    }


}
