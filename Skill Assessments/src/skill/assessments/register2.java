/*     */ package skill.assessments;
import java.awt.EventQueue;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
import javax.swing.LayoutStyle;
/*     */ import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class register2 extends JFrame {
/*     */   static PreparedStatement stulog;
/*     */   private JButton jButton1;
/*     */   
/*     */   public static boolean isTruePassword(String password) {
/*  17 */     if (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[a-zA-Z0-9]{6,20}$")) {
/*  18 */       return true;
/*     */     }
/*  20 */     return false;
/*     */   }
/*     */   private JLabel jLabel1; private JLabel jLabel2; private JLabel jLabel3; private JPanel jPanel1;
/*     */   private JTextField jTextField1;
/*     */   private JTextField jTextField2;
/*     */   private JTextField jTextField3;
/*     */   
/*     */   public register2() {
/*  28 */     initComponents();
/*  29 */     setLocationRelativeTo(null);
/*  30 */     setDefaultCloseOperation(2);
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
/*     */   private void initComponents() {
/*  42 */     this.jPanel1 = new JPanel();
/*  43 */     this.jLabel1 = new JLabel();
/*  44 */     this.jLabel2 = new JLabel();
/*  45 */     this.jLabel3 = new JLabel();
/*  46 */     this.jTextField1 = new JTextField();
/*  47 */     this.jTextField2 = new JTextField();
/*  48 */     this.jTextField3 = new JTextField();
/*  49 */     this.jButton1 = new JButton();
/*     */     
/*  51 */     setDefaultCloseOperation(3);
/*     */     
/*  53 */     this.jLabel1.setText("姓名");
/*     */     
/*  55 */     this.jLabel2.setText("用户名");
/*     */     
/*  57 */     this.jLabel3.setText("密码");
/*     */     
/*  59 */     this.jTextField1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  61 */             register2.this.jTextField1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  65 */     this.jButton1.setText("提交");
/*  66 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  68 */             register2.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  72 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  73 */     this.jPanel1.setLayout(jPanel1Layout);
/*  74 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  75 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  76 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  77 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  78 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  79 */               .addGap(52, 52, 52)
/*  80 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  81 */                 .addComponent(this.jLabel1)
/*  82 */                 .addComponent(this.jLabel2)
/*  83 */                 .addComponent(this.jLabel3))
/*  84 */               .addGap(75, 75, 75)
/*  85 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  86 */                 .addComponent(this.jTextField3, -1, 152, 32767)
/*  87 */                 .addComponent(this.jTextField2)
/*  88 */                 .addComponent(this.jTextField1)))
/*  89 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  90 */               .addGap(222, 222, 222)
/*  91 */               .addComponent(this.jButton1)))
/*  92 */           .addContainerGap(177, 32767)));
/*     */     
/*  94 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/*  95 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  96 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  97 */           .addGap(44, 44, 44)
/*  98 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  99 */             .addComponent(this.jLabel1)
/* 100 */             .addComponent(this.jTextField1, -2, -1, -2))
/* 101 */           .addGap(36, 36, 36)
/* 102 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 103 */             .addComponent(this.jLabel2)
/* 104 */             .addComponent(this.jTextField2, -2, -1, -2))
/* 105 */           .addGap(36, 36, 36)
/* 106 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 107 */             .addComponent(this.jLabel3)
/* 108 */             .addComponent(this.jTextField3, -2, -1, -2))
/* 109 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 77, 32767)
/* 110 */           .addComponent(this.jButton1)
/* 111 */           .addGap(37, 37, 37)));
/*     */ 
/*     */     
/* 114 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 115 */     getContentPane().setLayout(layout);
/* 116 */     layout.setHorizontalGroup(layout
/* 117 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 118 */         .addGroup(layout.createSequentialGroup()
/* 119 */           .addContainerGap()
/* 120 */           .addComponent(this.jPanel1, -1, -1, 32767)
/* 121 */           .addContainerGap()));
/*     */     
/* 123 */     layout.setVerticalGroup(layout
/* 124 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 125 */         .addGroup(layout.createSequentialGroup()
/* 126 */           .addContainerGap()
/* 127 */           .addComponent(this.jPanel1, -1, -1, 32767)
/* 128 */           .addContainerGap()));
/*     */ 
/*     */     
/* 131 */     pack();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/*     */     try {
/* 137 */       sumit_success ss = new sumit_success();
/* 138 */       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
/*     */ 
/*     */ 
/*     */       
/* 142 */       Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=stulog;user=sa;password=sa");
/*     */       
/* 144 */       String id = this.jTextField2.getText();
/* 145 */       String pas = this.jTextField3.getText();
/* 146 */       String name = this.jTextField1.getText();
/* 147 */       if (!isTruePassword(pas)) {
/* 148 */         notTrue nt = new notTrue();
/* 149 */         nt.setVisible(true);
/*     */         return;
/*     */       } 
/* 152 */       System.out.println("ssss");
/* 153 */       stulog = con.prepareStatement("insert into Stu (name,id,pas) values(?,?,?)");
/* 154 */       stulog.setString(1, name);
/* 155 */       stulog.setString(2, id);
/* 156 */       stulog.setString(3, pas);
/* 157 */       stulog.executeUpdate();
/* 158 */       ss.setVisible(true);
/* 159 */       setVisible(false);
/*     */     }
/* 161 */     catch (Exception exception) {}
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
/*     */   private void jTextField1ActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) throws UnsupportedLookAndFeelException {
/*     */     try {
/* 183 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 184 */         if ("Nimbus".equals(info.getName())) {
/* 185 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 189 */     } catch (ClassNotFoundException ex) {
/* 190 */       Logger.getLogger(register2.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 191 */     } catch (InstantiationException ex) {
/* 192 */       Logger.getLogger(register2.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 193 */     } catch (IllegalAccessException ex) {
/* 194 */       Logger.getLogger(register2.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 195 */     } catch (UnsupportedLookAndFeelException ex) {
/* 196 */       Logger.getLogger(register2.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 201 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 203 */             (new register2()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\register2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */