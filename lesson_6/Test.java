import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        StudentService ob=new StudentService();
        try {
            Student[] students=StudentService.read("java\\Karen.txt");
            Scanner s= new Scanner(System.in);
            boolean isMenuActive=true;
            while(isMenuActive) {
                System.out.println("1 : printFullNameStudents ");
                System.out.println("2 : printAllMaleStudents ");
                System.out.println("3 : printAllFemaleWheHasMarkGreaterThen50.4 ");
                System.out.println("4 : printStudentsInformationHavingMinimalMark ");
                System.out.println("5 : printBiggestMaleStudentsInformation ");
                System.out.println("6 : printStudentsSortedByMark ");
                System.out.println("7 : printAllFemaleStudentsSortedByYear ");
                System.out.println("Process finished with exit");

                int command = s.nextInt();
                switch (command) {
                    case 1:ob.printFullNameStudents(students);
                        break;
                    case 2:ob.printAllMaleStudents(students);
                        break;
                    case 3:ob.printAllFemaleWheHasMarkGreaterThen50_4(students);
                        break;
                    case 4:ob.printStudentsInformationHavingMinimalMark(students);
                        break;
                    case 5:ob.printBiggestMaleStudentsInformation(students);
                        break;
                    case 6:ob.printStudentsSortedByMark(students);
                        break;
                    case 7:ob.printFemaleStudentsSortedByYear(students);
                        break;
                    default:

                        isMenuActive=false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
