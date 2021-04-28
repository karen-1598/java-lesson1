import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StudentService {
    static Student[] read(String path) throws IOException {

        String[] array=Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        Student[] student=new Student[array.length];
        for (int i = 0; i < array.length; i++) {
            student[i]=new Student();
        String[] a=array[i].split(",");
        String firstName=a[0];
        String lastName=a[1];
        int year=Integer.parseInt(a[2]);
        char gender=a[3].charAt(0);
        double mark=Double.parseDouble(a[4]);

        student[i].setFirstName(firstName);
        student[i].setLastName(lastName);
        student[i].setGender(gender);
        student[i].setYear(year);
        student[i].setMark(mark);
        }
        return student;

    }
    public void printFullNameStudents(Student[] students) {
        for(Student student : students)
            student.fullName();
    }
    public void printAllMaleStudents(Student[] students){
        for(Student student : students)
            if(student.getGender()=='m')
            student.fullName();
            //System.out.println(student.getGender()=='m'?"Male":"Female");

    }
    public void printAllFemaleWheHasMarkGreaterThen50_4(Student[] students){
        for(Student student : students)
        if(student.getGender()=='f' && student.getMark()>50.4)
            student.fullName();
    }
    public void printStudentsInformationHavingMinimalMark(Student[] students){
        /*ete miqani hoqi kan minimal gnahatakanov
        double min=students[0].getMark();
        for(int i=1;i<students.length;i++)
            if(students[i].getMark()<min)min=students[i].getMark();
            for(Student student : students)
                if(student.getMark()==min) student.printInfo();*/

        //ete 1 hoqi e;
        double min=students[0].getMark();
        int index=0;
        for(int i=1;i<students.length;i++)
            if(students[i].getMark()<min){min=students[i].getMark();index=i;}
        students[index].printInfo();

    }
    public void printBiggestMaleStudentsInformation(Student[] students){
        /*ete miqani hoqi kan maximal gnahatakanov
        double max=students[0].getMark();
        for(int i=1;i<students.length;i++)
            if(students[i].getMark()>max)max=students[i].getMark();
            for(Student student : students)
                if(student.getMark()==max) student.printInfo();*/

        //ete 1 hoqi e;
        double max=0;
        int index=0;
        for(int i=0;i<students.length;i++)
            if(students[i].getGender()=='m' && students[i].getMark()>max){max=students[i].getMark();index=i;}
        students[index].printInfo();
    }
    public void printStudentsSortedByMark(Student[] students){
        boolean isActive=true;
            int count=0;
            while(isActive) {
                for (int i = 0; i < students.length - 1-count; i++) {
                    if (students[i].getMark() > students[i + 1].getMark()) {
                        Student x = students[i];
                        students[i] = students[i + 1];
                        students[i + 1] = x;
                        isActive=false;
                    }
                } count++;
                if(students.length - 1-count==0)isActive=false;
            }
            for(Student student : students) {
                student.fullName();
                System.out.println(" : "+student.getMark());}
    }
    public void printFemaleStudentsSortedByYear(Student[] students){
        boolean isActive=true;
        int count=0;
        while(isActive) {
            for (int i = 0; i < students.length - 1-count; i++) {
                if (students[i].getGender()=='f' && students[i].getYear() > students[i + 1].getYear()) {
                    Student x = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = x;
                    isActive=false;
                }
            } count++;
            if(students.length - 1-count==0)isActive=false;
        }
        for(Student student : students) {
            if(student.getGender()=='f') {
                student.fullName();
                System.out.println(student.getYear());
            }
        }
    }
}
