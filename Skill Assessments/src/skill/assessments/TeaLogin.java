/*     */ package skill.assessments;
import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.ResultSet;
import java.sql.Statement;
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
/*     */ public class TeaLogin extends JFrame {
/*     */   public TeaLogin() {
/*  22 */     initComponents();
/*  23 */     setLocationRelativeTo(null);
/*  24 */     setDefaultCloseOperation(2);
/*  25 */     setTitle("管理者登录");
/*  26 */     this.jPasswordField1.setText("");
/*  27 */     this.jPasswordField1.setEditable(true);
/*     */   }
/*     */   static Statement stulog;
/*     */   static ResultSet res;
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JPanel jPanel1;
/*     */   private JPasswordField jPasswordField1;
/*     */   private JTextField jTextField1;
/*     */   
/*     */   private void initComponents() {
/*  39 */     this.jPanel1 = new JPanel();
/*  40 */     this.jLabel1 = new JLabel();
/*  41 */     this.jLabel2 = new JLabel();
/*  42 */     this.jTextField1 = new JTextField();
/*  43 */     this.jButton1 = new JButton();
/*  44 */     this.jPasswordField1 = new JPasswordField();
/*     */     
/*  46 */     setDefaultCloseOperation(3);
/*     */     
/*  48 */     this.jLabel1.setFont(new Font("宋体", 0, 48));
/*  49 */     this.jLabel1.setText("用户名");
/*     */     
/*  51 */     this.jLabel2.setFont(new Font("宋体", 0, 48));
/*  52 */     this.jLabel2.setText("密码");
/*     */     
/*  54 */     this.jTextField1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  56 */             TeaLogin.this.jTextField1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  60 */     this.jButton1.setFont(new Font("宋体", 0, 48));
/*  61 */     this.jButton1.setText("登录");
/*  62 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  64 */             TeaLogin.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  68 */     this.jPasswordField1.setText("jPasswordField1");
/*  69 */     this.jPasswordField1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  71 */             TeaLogin.this.jPasswordField1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  75 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  76 */     this.jPanel1.setLayout(jPanel1Layout);
/*  77 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  78 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  79 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/*  80 */           .addGap(90, 90, 90)
/*  81 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  82 */             .addComponent(this.jLabel2, -2, 244, -2)
/*  83 */             .addComponent(this.jLabel1, -2, 244, -2))
/*  84 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 128, 32767)
/*  85 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  86 */             .addComponent(this.jPasswordField1, -1, 400, 32767)
/*  87 */             .addComponent(this.jTextField1))
/*  88 */           .addGap(206, 206, 206))
/*  89 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  90 */           .addGap(264, 264, 264)
/*  91 */           .addComponent(this.jButton1, -2, 246, -2)
/*  92 */           .addContainerGap(-1, 32767)));
/*     */     
/*  94 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/*  95 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  96 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  97 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  98 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  99 */               .addGap(97, 97, 97)
/* 100 */               .addComponent(this.jLabel1, -2, 103, -2))
/* 101 */             .addGroup(jPanel1Layout.createSequentialGroup()
/* 102 */               .addGap(126, 126, 126)
/* 103 */               .addComponent(this.jTextField1, -2, 61, -2)))
/* 104 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 105 */             .addGroup(jPanel1Layout.createSequentialGroup()
/* 106 */               .addGap(133, 133, 133)
/* 107 */               .addComponent(this.jLabel2, -2, 103, -2))
/* 108 */             .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 109 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 110 */               .addComponent(this.jPasswordField1, -2, 74, -2)))
/* 111 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 118, 32767)
/* 112 */           .addComponent(this.jButton1, -2, 99, -2)
/* 113 */           .addGap(124, 124, 124)));
/*     */ 
/*     */     
/* 116 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 117 */     getContentPane().setLayout(layout);
/* 118 */     layout.setHorizontalGroup(layout
/* 119 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 120 */         .addGroup(layout.createSequentialGroup()
/* 121 */           .addContainerGap()
/* 122 */           .addComponent(this.jPanel1, -1, -1, 32767)
/* 123 */           .addContainerGap()));
/*     */     
/* 125 */     layout.setVerticalGroup(layout
/* 126 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 127 */         .addGroup(layout.createSequentialGroup()
/* 128 */           .addContainerGap()
/* 129 */           .addComponent(this.jPanel1, -1, -1, 32767)
/* 130 */           .addContainerGap()));
/*     */ 
/*     */     
/* 133 */     pack();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jTextField1ActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 144 */     if (check(this.jTextField1.getText(), PAS())) {
/* 145 */       Admin ad = new Admin();
/* 146 */       ad.setVisible(true);
/* 147 */       dispose();
/*     */     } else {
/* 149 */       False fa = new False();
/*     */       
/* 151 */       fa.setVisible(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void jPasswordField1ActionPerformed(ActionEvent evt) {
/* 157 */     this.jPasswordField1.setEchoChar(' ');
/*     */   }
/*     */   private String PAS() {
/* 160 */     StringBuffer sb = new StringBuffer();
/* 161 */     char[] correctPassword = this.jPasswordField1.getPassword();
/* 162 */     sb.append(correctPassword);
/* 163 */     return sb.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean check(String ID, String Pas) {
/*     */     try {
/* 169 */       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
/*     */ 
/*     */ 
/*     */       
/* 173 */       Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=stulog;user=sa;password=sa");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 178 */       stulog = con.createStatement();
/* 179 */       res = stulog.executeQuery("select * from Tea");
/*     */       
/* 181 */       boolean book = false;
/*     */       
/* 183 */       while (res.next()) {
/*     */         
/* 185 */         String id2 = res.getString("name");
/* 186 */         String pas2 = res.getString("pas");
/* 187 */         if (ID.equals(id2) && Pas.equals(pas2)) {
/* 188 */           book = true;
/*     */         }
/*     */       } 
/*     */       
/* 192 */       if (book == true) return true; 
/* 193 */       return false;
/*     */     }
/* 195 */     catch (Exception e) {
/*     */       
/* 197 */       ConnectErrore c = new ConnectErrore();
/* 198 */       c.setVisible(true);
/*     */       
/* 200 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 212 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 213 */         if ("Nimbus".equals(info.getName())) {
/* 214 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 218 */     } catch (ClassNotFoundException ex) {
/* 219 */       Logger.getLogger(TeaLogin.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 220 */     } catch (InstantiationException ex) {
/* 221 */       Logger.getLogger(TeaLogin.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 222 */     } catch (IllegalAccessException ex) {
/* 223 */       Logger.getLogger(TeaLogin.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 224 */     } catch (UnsupportedLookAndFeelException ex) {
/* 225 */       Logger.getLogger(TeaLogin.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 233 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 235 */             (new TeaLogin()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\TeaLogin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */