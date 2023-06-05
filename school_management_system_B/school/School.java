package school;

import java.util.List;
import student.Student;
import teacher.Teacher;


public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalFeesPaid;
    private int totalFeesSpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalFeesPaid = 0;
        this.totalFeesSpent = 0;
    }

    

    public List<Teacher> getTeachers() {
        return teachers;
    }



    public List<Student> getStudents() {
        return students;
    }



    public int getTotalFeesPaid() {
        return totalFeesPaid;
    }

    public int getTotalFeesSpent() {
        return totalFeesSpent;
    }

    public void setTotalFeesPaid(int getFeesPaid()) {
        this.totalFeesPaid = totalFeesPaid;
    }

    public void setTotalFeesSpent(int totalFeesSpent) {
        this.totalFeesSpent = totalFeesSpent;
    }

    
    
    
}
