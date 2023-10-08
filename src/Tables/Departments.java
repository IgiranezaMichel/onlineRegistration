package Tables;
// Generated Jun 20, 2022 5:55:05 PM by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Departments  implements java.io.Serializable {

      @Id
     private String DepartmentCode;
     private String DepartmentName;
     @ManyToOne
     @JoinColumn(name = "DepFacultyCode")
     private Faculties DepartmentFacultyCode;
     @OneToMany(mappedBy = "StudDepCode")
     List<Student>StudentDepCode;

    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(String DepartmentCode) {
        this.DepartmentCode = DepartmentCode;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public Faculties getDepartmentFacultyCode() {
        return DepartmentFacultyCode;
    }

    public void setDepartmentFacultyCode(Faculties DepartmentFacultyCode) {
        this.DepartmentFacultyCode = DepartmentFacultyCode;
    }

    public List<Student> getStudentDepCode() {
        return StudentDepCode;
    }

    public void setStudentDepCode(List<Student> StudentDepCode) {
        this.StudentDepCode = StudentDepCode;
    }
}


