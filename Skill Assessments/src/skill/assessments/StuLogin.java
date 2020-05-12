/*     */ package skill.assessments;
import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.Statement;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class StuLogin extends JFrame {
/*     */   static Statement stulog;
/*     */   
/*     */   public StuLogin() {
/*  25 */     initComponents();
/*  26 */     setLocationRelativeTo(null);
/*  27 */     setDefaultCloseOperation(2);
/*  28 */     setTitle("学生登录");
/*  29 */     this.jPasswordField1.setText("");
/*     */   }
/*     */   static ResultSet res;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JPanel jPanel1;
/*     */   private JPasswordField jPasswordField1;
/*     */   private JTextField jTextField3;
/*     */   
/*     */   private void initComponents() {
/*  41 */     this.jPanel1 = new JPanel();
/*  42 */     this.jLabel3 = new JLabel();
/*  43 */     this.jLabel4 = new JLabel();
/*  44 */     this.jTextField3 = new JTextField();
/*  45 */     this.jButton2 = new JButton();
/*  46 */     this.jButton1 = new JButton();
/*  47 */     this.jPasswordField1 = new JPasswordField();
/*     */     
/*  49 */     setDefaultCloseOperation(3);
/*     */     
/*  51 */     this.jLabel3.setFont(new Font("宋体", 0, 48));
/*  52 */     this.jLabel3.setText("用户名");
/*     */     
/*  54 */     this.jLabel4.setFont(new Font("宋体", 0, 48));
/*  55 */     this.jLabel4.setText("密码");
/*     */     
/*  57 */     this.jTextField3.setFont(new Font("宋体", 0, 36));
/*  58 */     this.jTextField3.setToolTipText("");
/*     */     
/*  60 */     this.jButton2.setFont(new Font("宋体", 0, 36));
/*  61 */     this.jButton2.setText("登录");
/*  62 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  64 */             StuLogin.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  68 */     this.jButton1.setFont(new Font("宋体", 0, 36));
/*  69 */     this.jButton1.setText("注册");
/*  70 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  72 */             StuLogin.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  76 */     this.jPasswordField1.setText("jPasswordField1");
/*     */     
/*  78 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  79 */     this.jPanel1.setLayout(jPanel1Layout);
/*  80 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  81 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  82 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/*  83 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  84 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  85 */               .addGap(99, 99, 99)
/*  86 */               .addComponent(this.jButton2, -2, 233, -2)
/*  87 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 220, 32767)
/*  88 */               .addComponent(this.jButton1, -2, 233, -2)
/*  89 */               .addGap(19, 19, 19))
/*  90 */             .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
/*  91 */               .addGap(79, 79, 79)
/*  92 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  93 */                 .addGroup(jPanel1Layout.createSequentialGroup()
/*  94 */                   .addComponent(this.jLabel3, -1, -1, 32767)
/*  95 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
/*  96 */                 .addGroup(jPanel1Layout.createSequentialGroup()
/*  97 */                   .addComponent(this.jLabel4, -2, 244, -2)
/*  98 */                   .addGap(81, 81, 81)))
/*  99 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 100 */                 .addComponent(this.jTextField3, -1, 400, 32767)
/* 101 */                 .addComponent(this.jPasswordField1))))
/* 102 */           .addGap(104, 104, 104)));
/*     */     
/* 104 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 105 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 106 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 107 */           .addGap(103, 103, 103)
/* 108 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 109 */             .addComponent(this.jTextField3, -2, 114, -2)
/* 110 */             .addComponent(this.jLabel3, -2, 103, -2))
/* 111 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 112 */             .addGroup(jPanel1Layout.createSequentialGroup()
/* 113 */               .addGap(17, 17, 17)
/* 114 */               .addComponent(this.jLabel4, -2, 103, -2))
/* 115 */             .addGroup(jPanel1Layout.createSequentialGroup()
/* 116 */               .addGap(36, 36, 36)
/* 117 */               .addComponent(this.jPasswordField1, -2, 110, -2)))
/* 118 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 119, 32767)
/* 119 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 120 */             .addComponent(this.jButton1, -2, 99, -2)
/* 121 */             .addComponent(this.jButton2, -2, 99, -2))
/* 122 */           .addGap(125, 125, 125)));
/*     */ 
/*     */     
/* 125 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 126 */     getContentPane().setLayout(layout);
/* 127 */     layout.setHorizontalGroup(layout
/* 128 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 129 */         .addGroup(layout.createSequentialGroup()
/* 130 */           .addContainerGap()
/* 131 */           .addComponent(this.jPanel1, -1, -1, 32767)
/* 132 */           .addContainerGap()));
/*     */     
/* 134 */     layout.setVerticalGroup(layout
/* 135 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 136 */         .addGroup(layout.createSequentialGroup()
/* 137 */           .addContainerGap()
/* 138 */           .addComponent(this.jPanel1, -1, -1, 32767)
/* 139 */           .addContainerGap()));
/*     */ 
/*     */     
/* 142 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 146 */     String a = this.jTextField3.getText();
/*     */     
/* 148 */     if (check(a, pass())) {
/*     */       
/* 150 */       Question qu = new Question();
/* 151 */       qu.setVisible(true);
/* 152 */       dispose();
/*     */     } else {
/* 154 */       False fa1 = new False();
/* 155 */       fa1.setVisible(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean check(String Name, String Pas) {
/*     */     try {
/* 162 */       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
/*     */ 
/*     */ 
/*     */       
/* 166 */       Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=stulog;user=sa;password=sa");
/* 167 */       System.out.print("succ1");
/*     */ 
/*     */       
/* 170 */       stulog = con.createStatement();
/* 171 */       res = stulog.executeQuery("select * from Stu");
/* 172 */       boolean book = false;
/* 173 */       while (res.next()) {
/* 174 */         String name = res.getString("name");
/* 175 */         String pas2 = res.getString("pas");
/* 176 */         System.out.println(name);
/* 177 */         System.out.println(pas2);
/* 178 */         if (Name.equals(name) && Pas.equals(pas2)) {
/* 179 */           book = true;
/*     */         }
/*     */       } 
/*     */       
/* 183 */       if (book == true) return true; 
/* 184 */       return false;
/*     */     }
/* 186 */     catch (Exception e) {
/*     */       
/* 188 */       e.printStackTrace();
/*     */       
/* 190 */       return false;
/*     */     } 
/*     */   } private String pass() {
/* 193 */     StringBuffer st = new StringBuffer();
/* 194 */     char[] correctPassword = this.jPasswordField1.getPassword();
/* 195 */     st.append(correctPassword);
/* 196 */     return st.toString();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 200 */     register2 reg = new register2();
/* 201 */     reg.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 215 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 216 */         if ("Nimbus".equals(info.getName())) {
/* 217 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 221 */     } catch (ClassNotFoundException ex) {
/* 222 */       Logger.getLogger(StuLogin.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 223 */     } catch (InstantiationException ex) {
/* 224 */       Logger.getLogger(StuLogin.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 225 */     } catch (IllegalAccessException ex) {
/* 226 */       Logger.getLogger(StuLogin.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 227 */     } catch (UnsupportedLookAndFeelException ex) {
/* 228 */       Logger.getLogger(StuLogin.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 240 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 242 */             (new StuLogin()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\StuLogin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */