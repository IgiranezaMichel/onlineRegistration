
package crudhibernate.Dao;
import Tables.Course;
import Tables.Departments;
import Tables.Faculties;
import Tables.Student;
import Tables.Teachers;
import java.util.List;
import javassist.bytecode.stackmap.BasicBlock;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.ehcache.search.aggregator.Count;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CrudDao {
   public String AddStudent(Student st)
   {
      try{ Session ss=HibernateUtil.getSessionFactory().openSession();
       Transaction ts=ss.beginTransaction();
       ss.save(ts);
       ts.commit();
       ss.close();
      }catch(Exception e)
      {
          return e+"";
      }
      return "Saved Sucessfully";
   }
   public void DeleteStudent(String id)
   {  try{ Session ss=HibernateUtil.getSessionFactory().openSession();
       Transaction ts=ss.beginTransaction();
       Query q=ss.createQuery("delete from Student where StudentId=:i");
       q.setParameter("i",id);
       int result=q.executeUpdate();
       if(result>0)
       {
           JOptionPane.showMessageDialog(null,"Deleted Sucessfully");
       }
   }catch(Exception e)
   {
       JOptionPane.showMessageDialog(null, e);
   }
   }
   public  String AddFaculty(Faculties fcty)
   {
      try{ Session ss=HibernateUtil.getSessionFactory().openSession();
       Transaction ts=ss.beginTransaction();
       ss.save(fcty);
       ts.commit();
       ss.close();
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, e);
      }
      return "Inserted Sucessfully";
   }
   public  void UpdateLectureAtFirstLogIn(String username,String fPassword,String newpasswd)
   {Session ss=HibernateUtil.getSessionFactory().openSession();
       Transaction ts=ss.beginTransaction();
       int counter=0;
       Query q=ss.createQuery("from Teacher where TeacherId=:t and Passwd=:p");
       q.setParameter("t",username);
       q.setParameter("p", fPassword);
       List<Teachers>tchr=q.list();
       for(Teachers i:tchr)
       {
           counter=2;
       }
       if(counter==0)
       {
           JOptionPane.showMessageDialog(null,"Specify Right Username And Password The administrator Has been Giving to you");
       }
       else{
            Query m=ss.createQuery("update Teacher set Passwd=:p where TeacherId=:t");
            m.setParameter("p", newpasswd);
            m.setParameter("t",username);
            int p=m.executeUpdate();
            if(p>0)
            {
                JOptionPane.showMessageDialog(null,"Updated Sucessfully");
            }
            else{
                JOptionPane.showMessageDialog(null,"Connection fails");
            }
       }
   }
   public String deleteFaculties(Faculties fc)
   {
        try{ Session ss=HibernateUtil.getSessionFactory().openSession();
       Transaction ts=ss.beginTransaction();
       ss.delete(fc);
       ts.commit();
       ss.close();
      }
      catch(Exception e)
      {
         return e+"";
      }
      return "Faculty Removed Sucessfully";
   }
   public List <Student> verifyStudent(String Id,String Password)
   {
       Session ss=HibernateUtil.getSessionFactory().openSession();
       Transaction ts=ss.beginTransaction();
       int Count=0;
       Query q=ss.createQuery("from Student where StudentId=:s and Password=:p");
       q.setParameter("s", Id);
       q.setParameter("p", Password);
       List <Student>td=q.list();
   
       return td;
   }
   public  List<Teachers> LogInLecture(String Id,String Passwd)
   { Session ss=HibernateUtil.getSessionFactory().openSession();
       Transaction ts=ss.beginTransaction();
       int Count=0;
       Query q=ss.createQuery("from Teachers where teacherId=:ti and passwd=:ps");
       q.setParameter("ti", Id);
       q.setParameter("ps", Passwd);
       List<Teachers>ls=q.list();
       return ls;
   }

    public List<Faculties> displayFaculty() {
   Session ss=HibernateUtil.getSessionFactory().openSession();
       Query q=ss.createQuery("from Faculties");
      List<Faculties>ls=q.list();
      return ls;
    }

    public String updateFaculty(Faculties f) {
    try{Session ss=HibernateUtil.getSessionFactory().openSession();
      Transaction tx=ss.beginTransaction();
      ss.update(f);
     tx.commit();
    }
    catch(HibernateException e)
    {
        return e+"";
    }
     return "Update Sucessfully";
    }

    public String AddDepartment(Departments dp) {
       try{Session ss=HibernateUtil.getSessionFactory().openSession();
      Transaction tx=ss.beginTransaction();
      ss.save(dp);
     tx.commit();
    }
    catch(HibernateException e)
    {
        return e+"";
    }
     return "Added Sucessfully"; 
    }

    public String DeleteDepartment(Departments dp) {
        try{Session ss=HibernateUtil.getSessionFactory().openSession();
      Transaction tx=ss.beginTransaction();
      ss.delete(dp);
     tx.commit();
    }
    catch(HibernateException e)
    {
        return e+"";
    }
     return "Removed Sucessfully"; 
    }

    public String UpdateDepartment(Departments dp) {
        try{Session ss=HibernateUtil.getSessionFactory().openSession();
      Transaction tx=ss.beginTransaction();
      ss.update(dp);
     tx.commit();
    }
    catch(HibernateException e)
    {
        return e+"";
    }
     return "Updated Sucessfully"; 
    }

    public List<Departments> DisplayDepartment() {
      Session ss=HibernateUtil.getSessionFactory().openSession();
       Query q=ss.createQuery("from Departments");
      List<Departments>ls=q.list();
      return ls;
    }

    public String AddCourse(Course cs) 
    {try{Session ss=HibernateUtil.getSessionFactory().openSession();
      Transaction tx=ss.beginTransaction();
      ss.save(cs);
     tx.commit();
    }
    catch(HibernateException e)
    {
        return e+"";
    }
     return "Course Added Sucessfully"; 
    }

    public String RemoveCourse(Course cs) {
     try{Session ss=HibernateUtil.getSessionFactory().openSession();
      Transaction tx=ss.beginTransaction();
      ss.delete(cs);
     tx.commit();
    }
    catch(HibernateException e)
    {
        return e+"";
    }
     return "Course Deleted Sucessfully"; 
    }

    public String UpdateCourse(Course cs) {
   try{Session ss=HibernateUtil.getSessionFactory().openSession();
      Transaction tx=ss.beginTransaction();
      ss.update(cs);
     tx.commit();
    }
    catch(HibernateException e)
    {
        return e+"";
    }
     return "Couse Updated Sucessfully"; 
    }

    public List<Course> DisplayCourse() {
       Session ss=HibernateUtil.getSessionFactory().openSession();
       Query q=ss.createQuery("from Course");
      List<Course>ls=q.list();
      return ls;
    }

    public List<Student> DisplayAllStudents() {
     Session ss=HibernateUtil.getSessionFactory().openSession();
       Query q=ss.createQuery("from Student");
      List<Student>ls=q.list();
      return ls;
    }

    public List<Teachers> DisplayAllTeacher() {
      Session ss=HibernateUtil.getSessionFactory().openSession();
       Query q=ss.createQuery("from Teachers");
      List<Teachers>ls=q.list();
      return ls;
    }
}
