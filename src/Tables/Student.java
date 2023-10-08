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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student implements Serializable{
    @Id
    private String StudentId;
    private String gender;
     private String password;
     private String studentNames;
     @ManyToOne
     private Departments StudDepCode;
      @JoinTable(name = "StudentCourseRelation",joinColumns = {@JoinColumn(name = "StudentId")},inverseJoinColumns = {@JoinColumn(name = "CourseCode")})
    @ManyToMany
      private List<Course>CourseList;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(String studentNames) {
        this.studentNames = studentNames;
    }

    public Departments getStudDepCode() {
        return StudDepCode;
    }

    public void setStudDepCode(Departments StudDepCode) {
        this.StudDepCode = StudDepCode;
    }

    public List<Course> getCourseList() {
        return CourseList;
    }

    public void setCourseList(List<Course> CourseList) {
        this.CourseList = CourseList;
    }
}
