package StudentManagement;


import java.util.ArrayList;
import java.util.List;

public class StudentManagementMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1,"teacher1",300);
        Teacher teacher2 = new Teacher(2,"teacher2",400);
        Teacher teacher3 = new Teacher(3,"teacher3",350);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        Student student1 = new Student(1,"student1",5);
        Student student2 = new Student(2,"student2",11);
        Student student3 = new Student(3,"student3",6);
        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        School theSchool1 = new School(teacherList,studentList);

        Teacher teacher4 = new Teacher(6,"teacher4", 400);

        theSchool1.addTeacher(teacher4);

        student1.payFees(10000);
        student2.payFees(60000);
        
        System.out.println("School1 has earned $"+ theSchool1.getTotalMoneyEarned());

        System.out.println("--- SCHOOL SALARY LIST ---");
        teacher1.receiveSalary(teacher1.getSalary());
        System.out.println("School1 has spent for salary to " + teacher1.getName()
                +" and now they has $" + theSchool1.getTotalMoneyEarned());

        teacher2.receiveSalary(teacher2.getSalary());
        System.out.println("School1 has spent for salary to " + teacher2.getName()
                +" and now they has $" + theSchool1.getTotalMoneyEarned());

        teacher3.receiveSalary(teacher3.getSalary());
        System.out.println("School1 has spent for salary to " + teacher3.getName()
                +" and now they has $" + theSchool1.getTotalMoneyEarned());

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        teacher3.receiveSalary(teacher3.getSalary());
        System.out.println(teacher3);
    }
}
