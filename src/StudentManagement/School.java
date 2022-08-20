package StudentManagement;


import java.util.List;

//Somany teacher and student
//So we implement using ArrayList
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

//    new school object is created
//    teachers is the list of teachers
//    students is the list of students

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    //return the list of teacher in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }

    //add the teacher to teh school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    //return the list of students in the school
    public List<Student> getStudents() {
        return students;
    }

    //add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    //totaal money earned by school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //add money
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    //return the tonal money earned by the school
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    //update the money spent by teh school
    //used by school school to pay teacher's salary
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }
}
