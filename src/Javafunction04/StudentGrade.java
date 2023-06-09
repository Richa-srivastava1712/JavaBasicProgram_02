package Javafunction04;

public class StudentGrade {

    public static String Grade(int marks){
        switch (marks/10){
            case 10:
            case 9:
                return "AA";
            case 8:
                return "AB";
            case 7:
                return "BB";
            case 6:
                return "BC";
            case 5:
                return "CD";
            case 4:
                return "DD";
            default:
                return "fail";
        }
    }
    public static void main(String args[]){
        System.out.println(Grade(88));
    }
}
