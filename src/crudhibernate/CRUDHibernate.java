/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudhibernate;
import Tables.Course;
import Tables.Departments;
import Tables.Faculties;
import Tables.Student;
import Tables.Teachers;
import crudhibernate.Dao.CrudDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Eng Michael
 */
public class CRUDHibernate extends javax.swing.JFrame {
CrudDao dao=new CrudDao();
    public CRUDHibernate() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel31 = new javax.swing.JPanel();
        studtab = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        Lecturerpaswd = new javax.swing.JTextField();
        LecturePaswd = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        lecFpasswd = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        LectureId = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        StudLogId = new javax.swing.JTextField();
        StudLogpasswd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        teacherLogPasswd = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        teacherLogId = new javax.swing.JFormattedTextField();
        LectureId1 = new javax.swing.JFormattedTextField();
        jLabel57 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CourseAnme = new javax.swing.JTextField();
        CourseCode = new javax.swing.JTextField();
        CourseCredit = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Coursetab = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        FacultyName = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        factab = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        FacultyCode = new javax.swing.JFormattedTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        DepartmentName = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DepartmentTab = new javax.swing.JTable();
        DepartmentFacultyCode = new javax.swing.JFormattedTextField();
        Depaertmentcode = new javax.swing.JFormattedTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        Tgender = new javax.swing.JComboBox<>();
        Tname = new javax.swing.JTextField();
        TDepaCode = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        RstudPass1 = new javax.swing.JPasswordField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Tpassword = new javax.swing.JPasswordField();
        studPass3 = new javax.swing.JPasswordField();
        jButton16 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lectureCourse = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        LecId = new javax.swing.JTextField();
        CoursesCodes = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel58 = new javax.swing.JLabel();
        Tecname = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        StudGender = new javax.swing.JComboBox<>();
        StudName = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        RstudPass = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        studPasswd = new javax.swing.JPasswordField();
        studPass2 = new javax.swing.JPasswordField();
        StudId = new javax.swing.JFormattedTextField();
        StudDepCode = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DisplayedCourses = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        ChoisentCourses = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        StudentNames = new javax.swing.JLabel();
        StudentFaculty = new javax.swing.JLabel();
        StudentDepartment = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1137, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        studtab.addTab("Home", jPanel3);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Id");
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 69, -1, -1));

        jLabel6.setText("New Passwd");
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        jLabel7.setText("Retype pswd");
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));
        jPanel11.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 288, 10));
        jPanel11.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 288, 10));
        jPanel11.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 288, 10));

        Lecturerpaswd.setBorder(null);
        Lecturerpaswd.setOpaque(false);
        jPanel11.add(Lecturerpaswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 288, 18));

        LecturePaswd.setBorder(null);
        LecturePaswd.setOpaque(false);
        jPanel11.add(LecturePaswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 288, 18));

        jButton13.setText("Save");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 370, -1));

        jLabel25.setText("Passwd");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        lecFpasswd.setBorder(null);
        lecFpasswd.setOpaque(false);
        lecFpasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecFpasswdActionPerformed(evt);
            }
        });
        jPanel11.add(lecFpasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 300, 30));
        jPanel11.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 290, 0));
        jPanel11.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 288, 10));

        try {
            LectureId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("A ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel11.add(LectureId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 290, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        studtab.addTab("TeacherProfile", jPanel5);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Id");
        jPanel12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 69, -1, -1));

        jLabel9.setText("Passwd");
        jPanel12.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 116, -1, -1));
        jPanel12.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 288, 10));
        jPanel12.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 288, 10));

        StudLogId.setBorder(null);
        StudLogId.setOpaque(false);
        StudLogId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudLogIdActionPerformed(evt);
            }
        });
        jPanel12.add(StudLogId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 288, 18));

        StudLogpasswd.setBorder(null);
        StudLogpasswd.setOpaque(false);
        jPanel12.add(StudLogpasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 290, 20));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 370, -1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("SignUp?");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 90, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        studtab.addTab("StudLog", jPanel6);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Id");
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 69, -1, -1));

        jLabel11.setText("Passwd");
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 116, -1, -1));
        jPanel13.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 288, 10));
        jPanel13.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 288, 10));

        teacherLogPasswd.setBorder(null);
        teacherLogPasswd.setOpaque(false);
        jPanel13.add(teacherLogPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 290, 20));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 370, -1));

        teacherLogId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        try {
            teacherLogId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("A#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel13.add(teacherLogId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 290, 20));

        try {
            LectureId1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("A ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel13.add(LectureId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 290, -1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("SignUp?");
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 90, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        studtab.addTab("TeacherLog", jPanel7);

        jLabel12.setText("Name");

        jLabel13.setText("Code");

        jLabel14.setText("Credit");

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Remove");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Coursetab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Id", "Course Name", "Course Credit"
            }
        ));
        Coursetab.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CoursetabAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(Coursetab);
        if (Coursetab.getColumnModel().getColumnCount() > 0) {
            Coursetab.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("Courses");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(2, 2, 2)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButton5))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CourseCredit))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(CourseCode))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(CourseAnme, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CourseAnme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(CourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(CourseCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        studtab.addTab("Course", jPanel8);

        jLabel16.setText("Name");

        jLabel17.setText("Code");

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Remove");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        factab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Faculty Code", "Faculty Name"
            }
        ));
        factab.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                factabAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        factab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                factabMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(factab);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setText("Faculty");

        try {
            FacultyCode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAAAA ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(2, 2, 2)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButton8))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(22, 22, 22)))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FacultyName, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(FacultyCode))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addComponent(FacultyCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FacultyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1137, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(41, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        studtab.addTab("Faculty", jPanel9);

        jLabel20.setText("Name");

        jLabel21.setText("Code");

        jLabel22.setText("Faculty Code");

        jButton9.setText("Add");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Remove");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Update");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setText("Department");

        DepartmentTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department Code", "Department Name", "Faculty Name"
            }
        ));
        DepartmentTab.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DepartmentTabAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(DepartmentTab);
        if (DepartmentTab.getColumnModel().getColumnCount() > 0) {
            DepartmentTab.getColumnModel().getColumn(2).setResizable(false);
        }

        try {
            DepartmentFacultyCode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAAAA ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            Depaertmentcode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAAAA ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(DepartmentFacultyCode))
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Depaertmentcode))
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(DepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(2, 2, 2)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButton11)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(DepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(Depaertmentcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(DepartmentFacultyCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton10)
                            .addComponent(jButton11)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        studtab.addTab("Department", jPanel10);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setText("Id");

        jLabel32.setText("Names");

        jLabel33.setText("RPasswd");

        jLabel34.setText("Department Code");

        Tgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        Tname.setBorder(null);
        Tname.setOpaque(false);

        TDepaCode.setBorder(null);
        TDepaCode.setOpaque(false);

        RstudPass1.setBorder(null);
        RstudPass1.setOpaque(false);

        jLabel35.setText("Gender");

        jLabel36.setText("Passwd");

        Tpassword.setBorder(null);
        Tpassword.setOpaque(false);
        Tpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpasswordActionPerformed(evt);
            }
        });

        studPass3.setBorder(null);
        studPass3.setOpaque(false);

        jButton16.setText("Save");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("A#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jButton16)
                .addContainerGap(639, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(401, 401, 401))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(0, 377, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel31)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel35)
                            .addGap(48, 48, 48)
                            .addComponent(Tgender, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel34)
                            .addGap(4, 4, 4)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(TDepaCode, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel32)
                            .addGap(57, 57, 57)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addGap(54, 54, 54)
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studPass3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addGap(47, 47, 47)
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RstudPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGap(0, 377, Short.MAX_VALUE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(26, 26, 26))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(0, 148, Short.MAX_VALUE)
                    .addComponent(jLabel31)
                    .addGap(27, 27, 27)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel32))
                        .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(1, 1, 1)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel35))
                        .addComponent(Tgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(jLabel34))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(TDepaCode, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(12, 12, 12)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel36))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studPass3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel33))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(RstudPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 149, Short.MAX_VALUE)))
        );

        studtab.addTab("Teacher", jPanel16);

        jLabel37.setText("Lecture Name:");

        jLabel38.setText("jLabel38");

        lectureCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecture Name", "Courses"
            }
        ));
        jScrollPane6.setViewportView(lectureCourse);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(701, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        studtab.addTab("TeacherCourse", jPanel2);

        jLabel39.setText("LectureId:");

        jLabel40.setText("CourseCode:");

        jButton15.setText("Save");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LecId, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(CoursesCodes))))
                .addContainerGap(583, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LecId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CoursesCodes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1137, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addGap(0, 73, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        studtab.addTab("AddTeacherAnd Course", jPanel17);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentId", "Student Name", "Gender", "Department Name"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane7.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        studtab.addTab("Students", jPanel32);

        jPanel33.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel33AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Teacher Id", "Teacher Name", "Gender", "Course"
            }
        ));
        jTable2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane8.setViewportView(jTable2);

        jLabel58.setText("Names:");

        Tecname.setText("jLabel59");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tecname, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(Tecname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        studtab.addTab("Teachers", jPanel33);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Id");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 69, -1, -1));

        jLabel2.setText("Names");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 116, -1, -1));

        jLabel3.setText("RPasswd");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        jLabel4.setText("Department Code");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 227, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 288, 10));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 131, 288, 10));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 288, 10));

        StudGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel4.add(StudGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 288, -1));

        StudName.setBorder(null);
        StudName.setOpaque(false);
        jPanel4.add(StudName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 288, 18));
        jPanel4.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 288, 10));
        jPanel4.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 238, 288, 10));

        RstudPass.setBorder(null);
        RstudPass.setOpaque(false);
        jPanel4.add(RstudPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 290, 20));

        jLabel18.setText("Gender");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 172, -1, -1));

        jLabel24.setText("Passwd");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        jButton12.setText("Save");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 380, -1));

        studPasswd.setBorder(null);
        studPasswd.setOpaque(false);
        studPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studPasswdActionPerformed(evt);
            }
        });
        jPanel4.add(studPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 290, 20));

        studPass2.setBorder(null);
        studPass2.setOpaque(false);
        jPanel4.add(studPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 290, 20));

        StudId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        try {
            StudId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(StudId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 290, -1));

        StudDepCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        try {
            StudDepCode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAAAA ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(StudDepCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 280, -1));

        studtab.addTab("StudentProfile", jPanel4);

        DisplayedCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CourseCode", "CourseNAme", "CourseCredit"
            }
        ));
        DisplayedCourses.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DisplayedCoursesAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        DisplayedCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayedCoursesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(DisplayedCourses);

        ChoisentCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CourseCode", "CourseName", "Student Id"
            }
        ));
        jScrollPane5.setViewportView(ChoisentCourses);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setText("Choisen Course");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setText("Course");

        jButton14.setText("Add Course");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel28.setText("Student Name:");

        jLabel29.setText("Faculty:");

        jLabel30.setText("Department:");

        StudentNames.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        StudentNames.setText("jLabel31");

        StudentFaculty.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        StudentFaculty.setText("jLabel31");

        StudentDepartment.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        StudentDepartment.setText("jLabel31");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 535, Short.MAX_VALUE)
                                .addComponent(jLabel26)
                                .addGap(258, 258, 258))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(StudentDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(StudentFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StudentNames, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(StudentNames))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(StudentFaculty))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(StudentDepartment))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14)
                .addGap(24, 24, 24))
        );

        studtab.addTab("StudentAfterLogIn", jPanel1);

        getContentPane().add(studtab, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1160, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StudLogIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudLogIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudLogIdActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Course cs=new Course();
cs.setCourseName(CourseAnme.getText());
cs.setCourseCode(CourseCode.getText());
cs.setCredit(Integer.parseInt(CourseCredit.getText()));
String result=dao.RemoveCourse(cs);
JOptionPane.showMessageDialog(null, result);
displayCourses();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
Faculties fc=new Faculties();
   //String SaveFaculty(Faculties f)
   fc.setFacultyCode(FacultyCode.getText());
   fc.setFacultyName(FacultyName.getText());
   String result=dao.deleteFaculties(fc);
   JOptionPane.showMessageDialog(null, result);
   DisplayFaculty();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      Departments dp=new Departments();
       Faculties fc=new Faculties();
       fc.setFacultyCode(DepartmentFacultyCode.getText());
       dp.setDepartmentCode(Depaertmentcode.getText());
       dp.setDepartmentName(DepartmentName.getText());
       dp.setDepartmentFacultyCode(fc);
       String result=dao.DeleteDepartment(dp);
        JOptionPane.showMessageDialog(null, result);
        DisplayDepartments();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   Faculties fc=new Faculties();
   //String SaveFaculty(Faculties f)
   fc.setFacultyCode(FacultyCode.getText());
   fc.setFacultyName(FacultyName.getText());
      String res=dao.AddFaculty(fc);
      JOptionPane.showMessageDialog(null, res);
        DisplayFaculty();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void studPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studPasswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studPasswdActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    if(StudId.getText().isEmpty()||StudName.getText().isEmpty()||StudDepCode.getText().isEmpty()||RstudPass.getPassword().toString().isEmpty())
    {
        JOptionPane.showMessageDialog(null,"Fill Empty Space");
    }
    else{
        if(RstudPass.getText().equals(studPasswd.getText()))
        {
             Session ss=crudhibernate.Dao.HibernateUtil.getSessionFactory().openSession();
           Transaction tx=ss.beginTransaction();
         try{ Student st=new Student();
            Departments dp=new Departments();
         dp.setDepartmentCode(StudDepCode.getText());
         st.setGender(StudGender.getSelectedItem().toString());
         st.setPassword(studPasswd.getText());
         st.setStudDepCode(dp);
         st.setStudentId(StudId.getText());
         st.setStudentNames(StudName.getText());
         ss.save(st);
         tx.commit();
         ss.close();
         JOptionPane.showMessageDialog(null,"Inserted Sucessfully");
         studtab.setSelectedIndex(3);
         }catch(Exception e)
         {
          JOptionPane.showMessageDialog(null, e);
         }
        }
    else{
            JOptionPane.showMessageDialog(null,"Password Does't match");
            }
    }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      if(LectureId.getText().isEmpty()||lecFpasswd.getText().isEmpty()||LecturePaswd.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(null,"Fill Empty Spaces");
      }
      else{
        CrudDao dao=new CrudDao();
     dao.UpdateLectureAtFirstLogIn(LectureId.getText(),lecFpasswd.getText(),Lecturerpaswd.getText());
      studtab.setSelectedIndex(8);
      }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void lecFpasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecFpasswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecFpasswdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(StudLogId.getText().isEmpty()||StudLogpasswd.getPassword().toString().isEmpty())
     {
         JOptionPane.showMessageDialog(null,"Fill Empty Space");
     }else{
         int Count=2;
          CrudDao dao=new CrudDao();
        List <Student>td=dao.verifyStudent(StudLogId.getText(),StudLogpasswd.getText());
           for(Student i:td)
       {
           JOptionPane.showMessageDialog(null,"LogIn Successfully");
           Count=1;
           StudentNames.setText(i.getStudentNames());
           StudentFaculty.setText(i.getStudDepCode().getDepartmentFacultyCode().getFacultyName());
           StudentDepartment.setText(i.getStudDepCode().getDepartmentName());
           studtab.setSelectedIndex(8);
       }
       if(Count==2)
       {
           JOptionPane.showMessageDialog(null,"Your Id and Password Doesn't match");
       }
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(teacherLogId.getText().isEmpty()||teacherLogPasswd.getPassword().toString().isEmpty())
{
    JOptionPane.showMessageDialog(null,"Fill Empty Spaces");
}
else{
    CrudDao dao=new CrudDao();
    int Count=0;
   List<Teachers>ls= dao.LogInLecture(teacherLogId.getText(), teacherLogPasswd.getText());
     for(Teachers i:ls)
       {
           JOptionPane.showMessageDialog(null,"LogIn Sucessfully");
           Count=1;
           Tecname.setText(i.getTeacherName());
        try {
                jLabel38.setText(i.getTeacherName());
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Crud","root","");
            PreparedStatement st=con.prepareStatement("select * from teachercourserelation where teacherId='"+teacherLogId.getText()+"'");
            ResultSet rs=st.executeQuery();
            while(rs.next())
            {
                Session ss=HibernateUtil.getSessionFactory().openSession();
                Query q=ss.createQuery("from Course where CourseCode=:c");
                q.setParameter("c",rs.getString("CourseCode"));
                List<Course>scs=q.list();
            
                DefaultTableModel md=(DefaultTableModel)lectureCourse.getModel();
                md.setRowCount(0);
                for(Course n:scs)
                {
                    String [] d={teacherLogId.getText(),n.getCourseName()};
                    md.addRow(d);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDHibernate.class.getName()).log(Level.SEVERE, null, ex);
        }
        studtab.setSelectedIndex(14);
       }
       if(Count==0)
       {
           JOptionPane.showMessageDialog(null,"Id and Password Doesnot match");
       }
}
    }//GEN-LAST:event_jButton2ActionPerformed
void DisplayFaculty()
{
   List<Faculties>f=dao.displayFaculty();
    DefaultTableModel md=(DefaultTableModel)factab.getModel();
    md.setRowCount(0);
    for(Faculties i:f)
    {
        String[] data={i.getFacultyCode(),i.getFacultyName()};
        md.addRow(data);
    }  
}
    private void factabAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_factabAncestorAdded
    DisplayFaculty();
    }//GEN-LAST:event_factabAncestorAdded

    private void factabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_factabMouseClicked
DefaultTableModel m=(DefaultTableModel)factab.getModel();
        FacultyName.setText(m.getValueAt(factab.getSelectedRow(), 1).toString());
       FacultyCode.setText(m.getValueAt(factab.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_factabMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       Faculties fc=new Faculties();
       fc.setFacultyCode(FacultyCode.getText());
       fc.setFacultyName(FacultyName.getText());
        String result=dao.updateFaculty(fc);
        JOptionPane.showMessageDialog(null, result);
        DisplayFaculty();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       Departments dp=new Departments();
       Faculties fc=new Faculties();
       fc.setFacultyCode(DepartmentFacultyCode.getText());
       dp.setDepartmentCode(Depaertmentcode.getText());
       dp.setDepartmentName(DepartmentName.getText());
       dp.setDepartmentFacultyCode(fc);
       String result=dao.AddDepartment(dp);
       DisplayDepartments();
        JOptionPane.showMessageDialog(null, result);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
Departments dp=new Departments();
       Faculties fc=new Faculties();
       fc.setFacultyCode(DepartmentFacultyCode.getText());
       dp.setDepartmentCode(Depaertmentcode.getText());
       dp.setDepartmentName(DepartmentName.getText());
       dp.setDepartmentFacultyCode(fc);
       String result=dao.UpdateDepartment(dp);
        JOptionPane.showMessageDialog(null, result);
        DisplayDepartments();
    }//GEN-LAST:event_jButton11ActionPerformed
void DisplayDepartments()
{
    List<Departments>dp=dao.DisplayDepartment();
    DefaultTableModel md=(DefaultTableModel)DepartmentTab.getModel();
    md.setRowCount(0);
    for(Departments i:dp)
    {
        String[] data={i.getDepartmentCode(),i.getDepartmentName(),i.getDepartmentFacultyCode().getFacultyName()};
      md.addRow(data);
    }
}
    private void DepartmentTabAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_DepartmentTabAncestorAdded
    DisplayDepartments();
    }//GEN-LAST:event_DepartmentTabAncestorAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Course cs=new Course();
cs.setCourseName(CourseAnme.getText());
cs.setCourseCode(CourseCode.getText());
cs.setCredit(Integer.parseInt(CourseCredit.getText()));
String result=dao.AddCourse(cs);
JOptionPane.showMessageDialog(null, result);
displayCourses();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Course cs=new Course();
cs.setCourseName(CourseAnme.getText());
cs.setCourseCode(CourseCode.getText());
cs.setCredit(Integer.parseInt(CourseCredit.getText()));
String result=dao.UpdateCourse(cs);
JOptionPane.showMessageDialog(null, result);
displayCourses();
    }//GEN-LAST:event_jButton5ActionPerformed
void displayCourses()
{
     DefaultTableModel md=(DefaultTableModel)Coursetab.getModel();
        md.setRowCount(0);
        DefaultTableModel pd=(DefaultTableModel)DisplayedCourses.getModel();
        pd.setRowCount(0);
        List<Course>ls=dao.DisplayCourse();
  for(Course i:ls)
  {
      String[] data={i.getCourseCode(),i.getCourseName(),i.getCredit()+""};
      md.addRow(data);
      pd.addRow(data);
      
  }
}
    private void CoursetabAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CoursetabAncestorAdded
       displayCourses();
    }//GEN-LAST:event_CoursetabAncestorAdded
String CourseCodes="";
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
      if(CourseCodes.equals(""))
      {
          JOptionPane.showMessageDialog(null,"Select A Course U do wanna ");
      }
      else{
          try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Crud","root","");
            PreparedStatement st=con.prepareStatement("insert into studentcourserelation values(?,?)");
            st.setString(1, CourseCodes);
            st.setString(2, StudLogId.getText());
           int n= st.executeUpdate();
           if(n>0)
           {
               JOptionPane.showMessageDialog(null,"Saved Sucessfully");
           }
           PreparedStatement sr=con.prepareStatement("select * from studentcourserelation where StudentId='"+StudLogId.getText()+"'");
              ResultSet rs=sr.executeQuery();
              DefaultTableModel md=(DefaultTableModel)ChoisentCourses.getModel();
              md.setRowCount(0);
              while(rs.next())
              {Session ss=HibernateUtil.getSessionFactory().openSession();
                  Query q=ss.createQuery("from Course where CourseCode=:c");
                  q.setParameter("c", rs.getString("CourseCode"));
                  Query q1=ss.createQuery("from Course where CourseCode=:c");
                  q.setParameter("c", rs.getString("CourseCode"));
                  List<Course>cs=q.list();
                  for(Course i:cs)
                  {
                      
                       String[] data={i.getCourseCode(),i.getCourseName(),StudLogId.getText()};
                        md.addRow(data);
                  }
              }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
      }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void DisplayedCoursesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_DisplayedCoursesAncestorAdded
      displayCourses();
    }//GEN-LAST:event_DisplayedCoursesAncestorAdded

    private void DisplayedCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayedCoursesMouseClicked
   DefaultTableModel md=(DefaultTableModel)DisplayedCourses.getModel();
        CourseCodes=DisplayedCourses.getValueAt(DisplayedCourses.getSelectedRow(), 0).toString();
        
    }//GEN-LAST:event_DisplayedCoursesMouseClicked

    private void TpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TpasswordActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction ts=ss.beginTransaction();
        Teachers t=new Teachers();
        t.setTeacherId(jFormattedTextField1.getText());
        Departments d=new Departments();
        d.setDepartmentCode(TDepaCode.getText());
        t.setGender(Tgender.getSelectedItem().toString());
        t.setPasswd(Tpassword.getText());
        t.setTeacherName(Tname.getText());
        //t.setDepartment(d);
        ss.save(t);
        studtab.setSelectedIndex(4);
        ts.commit();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
      try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Crud","root","");
            PreparedStatement st=con.prepareStatement("insert into teachercourserelation values(?,?)");
            st.setString(1, LecId.getText());
            st.setString(2, CoursesCodes.getText());
            int n=st.executeUpdate();
            if(n>0)
            {
                JOptionPane.showMessageDialog(null, "Added Sucessfully");
            }
      }catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, "Check Course Code Or Teacher Id");
      }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
       List<Student>st=dao.DisplayAllStudents();
       DefaultTableModel md=(DefaultTableModel)jTable1.getModel();
       md.setRowCount(0);
       for(Student i:st)
       {
           String[] data={i.getStudentId(),i.getStudentNames(),i.getGender(),i.getStudDepCode().getDepartmentName()};
           md.addRow(data);
       }
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jPanel33AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel33AncestorAdded
     
    }//GEN-LAST:event_jPanel33AncestorAdded

    private void jTable2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable2AncestorAdded
        List<Teachers>st=dao.DisplayAllTeacher();
       DefaultTableModel md=(DefaultTableModel)jTable2.getModel();
       md.setRowCount(0);
       for(Teachers i:st)
       {  
           String[] data={i.getTeacherId(),i.getTeacherName(),i.getGender(),i.getCourses().get(0).getCourseName()};
           md.addRow(data);
       }
    }//GEN-LAST:event_jTable2AncestorAdded

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
studtab.setSelectedIndex(1);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
    studtab.setSelectedIndex(9);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel57MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUDHibernate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDHibernate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDHibernate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDHibernate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDHibernate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ChoisentCourses;
    private javax.swing.JTextField CourseAnme;
    private javax.swing.JTextField CourseCode;
    private javax.swing.JTextField CourseCredit;
    private javax.swing.JTextField CoursesCodes;
    private javax.swing.JTable Coursetab;
    private javax.swing.JFormattedTextField Depaertmentcode;
    private javax.swing.JFormattedTextField DepartmentFacultyCode;
    private javax.swing.JTextField DepartmentName;
    private javax.swing.JTable DepartmentTab;
    private javax.swing.JTable DisplayedCourses;
    private javax.swing.JFormattedTextField FacultyCode;
    private javax.swing.JTextField FacultyName;
    private javax.swing.JTextField LecId;
    private javax.swing.JFormattedTextField LectureId;
    private javax.swing.JFormattedTextField LectureId1;
    private javax.swing.JTextField LecturePaswd;
    private javax.swing.JTextField Lecturerpaswd;
    private javax.swing.JPasswordField RstudPass;
    private javax.swing.JPasswordField RstudPass1;
    private javax.swing.JFormattedTextField StudDepCode;
    private javax.swing.JComboBox<String> StudGender;
    private javax.swing.JFormattedTextField StudId;
    private javax.swing.JTextField StudLogId;
    private javax.swing.JPasswordField StudLogpasswd;
    private javax.swing.JTextField StudName;
    private javax.swing.JLabel StudentDepartment;
    private javax.swing.JLabel StudentFaculty;
    private javax.swing.JLabel StudentNames;
    private javax.swing.JTextField TDepaCode;
    private javax.swing.JLabel Tecname;
    private javax.swing.JComboBox<String> Tgender;
    private javax.swing.JTextField Tname;
    private javax.swing.JPasswordField Tpassword;
    private javax.swing.JTable factab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField lecFpasswd;
    private javax.swing.JTable lectureCourse;
    private javax.swing.JPasswordField studPass2;
    private javax.swing.JPasswordField studPass3;
    private javax.swing.JPasswordField studPasswd;
    private javax.swing.JTabbedPane studtab;
    private javax.swing.JFormattedTextField teacherLogId;
    private javax.swing.JPasswordField teacherLogPasswd;
    // End of variables declaration//GEN-END:variables
}
