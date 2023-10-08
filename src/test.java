import Tables.Departments;
import Tables.Faculties;
import Tables.Student;
import crudhibernate.Dao.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eng Michael
 */
public class test {
     public static void main(String[] args) {
       //try{
         Session ss=HibernateUtil.getSessionFactory().openSession();
//           Transaction tx=ss.beginTransaction();
//         Faculties fc=new Faculties();
//         fc.setFacultyName("information");
//         fc.setFacultyCode("informas");
//         Departments dp=new Departments();
//         dp.setDepartmentCode("1258");
//         dp.setDepartmentName("vwrgw");
//         dp.setDepartmentFacultyCode(fc);
//         Student st=new Student();
//         st.setGender("Male");
//         st.setPassword("fjnwbv");
//         st.setStudDepCode(dp);
//         st.setStudentId("12344");
//         st.setStudentNames("Igiraneza");
//         ss.save(fc);
//         ss.save(dp);
//         ss.save(st);
//         tx.commit();
//         ss.close();




//         Transaction ts=ss.beginTransaction();
//         Students st=new Students();
//        st.setGender("male");
//        st.setPassword("jnfk");
//        //Departments d=new Departments();
//        //d.setDepartmentCode("info");
//        //st.setStudentDepartment(d);
//        st.setStudentId("23674");
//        st.setStudentNames("Ifiraneza");
//       ss.save(st);
//       ts.commit();
//       ss.close();
//           System.out.println("Saved");      }
//       catch(Exception e)
//       {
//           System.out.println(e);
//       }
        
    }
}
