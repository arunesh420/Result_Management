import models.Marks;
import models.Students;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Students std1 = new Students("Sita Nirdayal", 12, 18);
        Students std2 = new Students("Gore Nogopal", 12, 16);
        Students std3 = new Students("Ram Janak", 11, 16);
        Students std4 = new Students("Shrap Bishrestha", 12, 17);
        Students std5 = new Students("Kadak Padka", 11, 17);

        Marks mk1 = new Marks(std1.getName(), 61, 64, 71, 96, 88, 76);
        Marks mk2 = new Marks(std2.getName(), 60, 73, 77, 68, 73, 79);
        Marks mk3 = new Marks(std3.getName(), 78, 56, 79, 67, 80, 78);
        Marks mk4 = new Marks(std4.getName(), 88, 67, 77, 80, 71, 72);
        Marks mk5 = new Marks(std5.getName(), 71, 55, 51, 89, 66, 41);

        System.out.println(std1.getName() + " of grade " + std1.getGrade() + " got " + mk1.getPercent());
        System.out.println(std2.getName() + " of grade " + std2.getGrade() + " got " + mk2.getPercent());
        System.out.println(std3.getName() + " of grade " + std3.getGrade() + " got " + mk3.getPercent());
        System.out.println(std4.getName() + " of grade " + std4.getGrade() + " got " + mk4.getPercent());
        System.out.println(std5.getName() + " of grade " + std5.getGrade() + " got " + mk5.getPercent());

        ArrayList<String> Twelvth_grade = new ArrayList<>();
        ArrayList<String> Elebenth_grade = new ArrayList<>();

        System.out.println("\nStudents of Grade 12:");
        Twelvth_grade.add(std1.getName());
        Twelvth_grade.add(std2.getName());
        Twelvth_grade.add(std4.getName());
        for(String singleTwelvth_grade: Twelvth_grade){
            System.out.println(singleTwelvth_grade);
        }

        System.out.println("\nStudents of Grade 11:");
        Elebenth_grade.add(std3.getName());
        Elebenth_grade.add(std5.getName());
        for(String singleElebenth_grade: Elebenth_grade){
            System.out.println(singleElebenth_grade);
        }

        ArrayList<String> overallGradeA = new ArrayList<>();
        ArrayList<String> overallGradeBPlus = new ArrayList<>();
        ArrayList<String> overallGradeCPlus = new ArrayList<>();

        System.out.println("\nStudents with overall grade A:");
        overallGradeA.add(std2.getName());
        for(String singleOverallGradeA: overallGradeA){
            System.out.println(singleOverallGradeA);
        }

        System.out.println("\nStudents with overall grade B+:");
        overallGradeBPlus.add(std1.getName());
        overallGradeBPlus.add(std3.getName());
        overallGradeBPlus.add(std4.getName());
        for(String singleOverallGradeBPlus: overallGradeBPlus){
            System.out.println(singleOverallGradeBPlus);
        }

        System.out.println("\nStudents with overall grade C+:");
        overallGradeCPlus.add(std5.getName());
        for(String singleOverallGradeCPlus: overallGradeCPlus){
            System.out.println(singleOverallGradeCPlus);
        }
    }
}