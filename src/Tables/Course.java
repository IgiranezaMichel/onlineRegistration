/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Course implements Serializable{
    @Id
    private String CourseCode;
    private String CourseName;
    private int Credit;
    @ManyToMany
    @JoinTable(name = "TeacherCourseRelation",joinColumns={@JoinColumn(name = "CourseCode")},inverseJoinColumns = {@JoinColumn(name = "teacherId")})
    List<Teachers>Teacher;
    @ManyToMany
    @JoinTable(name = "StudentCourseRelation",joinColumns = {@JoinColumn(name = "CourseCode")},inverseJoinColumns = {@JoinColumn(name = "StudentId")})
    List<Student>studentList;

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public int getCredit() {
        return Credit;
    }

    public void setCredit(int Credit) {
        this.Credit = Credit;
    }

    public List<Teachers> getTeacher() {
        return Teacher;
    }

    public void setTeacher(List<Teachers> Teacher) {
        this.Teacher = Teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
