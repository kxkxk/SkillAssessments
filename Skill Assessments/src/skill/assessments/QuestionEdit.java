/*     */ package skill.assessments;
import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextArea;
import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class QuestionEdit extends JFrame {
/*     */   private JTextArea a;
/*     */   private JTextField ans;
/*     */   private JTextArea b;
/*     */   private JTextArea c;
/*     */   
/*     */   public QuestionEdit() {
/*  23 */     initComponents();
/*  24 */     setLocationRelativeTo(null);
/*  25 */     setDefaultCloseOperation(2);
/*  26 */     setTitle("Question Edit");
/*     */   }
/*     */   private JTextArea d; private JButton jButton1; private JLabel jLabel1; private JLabel jLabel2; private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/*     */   private JScrollPane jScrollPane1;
/*     */   private JScrollPane jScrollPane2;
/*     */   private JScrollPane jScrollPane3;
/*     */   private JScrollPane jScrollPane4;
/*     */   private JScrollPane jScrollPane5;
/*     */   private JTextArea jTextArea1;
/*     */   
/*     */   private void initComponents() {
/*  38 */     this.jLabel1 = new JLabel();
/*  39 */     this.jLabel3 = new JLabel();
/*  40 */     this.jLabel2 = new JLabel();
/*  41 */     this.jLabel5 = new JLabel();
/*  42 */     this.jLabel4 = new JLabel();
/*  43 */     this.jLabel6 = new JLabel();
/*  44 */     this.ans = new JTextField();
/*  45 */     this.jScrollPane5 = new JScrollPane();
/*  46 */     this.d = new JTextArea();
/*  47 */     this.jScrollPane2 = new JScrollPane();
/*  48 */     this.c = new JTextArea();
/*  49 */     this.jScrollPane3 = new JScrollPane();
/*  50 */     this.b = new JTextArea();
/*  51 */     this.jScrollPane4 = new JScrollPane();
/*  52 */     this.a = new JTextArea();
/*  53 */     this.jScrollPane1 = new JScrollPane();
/*  54 */     this.jTextArea1 = new JTextArea();
/*  55 */     this.jButton1 = new JButton();
/*     */     
/*  57 */     setDefaultCloseOperation(3);
/*     */     
/*  59 */     this.jLabel1.setFont(new Font("宋体", 0, 24));
/*  60 */     this.jLabel1.setText("Question");
/*     */     
/*  62 */     this.jLabel3.setFont(new Font("宋体", 0, 24));
/*  63 */     this.jLabel3.setText("A");
/*     */     
/*  65 */     this.jLabel2.setFont(new Font("宋体", 0, 24));
/*  66 */     this.jLabel2.setText("B");
/*     */     
/*  68 */     this.jLabel5.setFont(new Font("宋体", 0, 24));
/*  69 */     this.jLabel5.setText("C");
/*     */     
/*  71 */     this.jLabel4.setFont(new Font("宋体", 0, 24));
/*  72 */     this.jLabel4.setText("D");
/*     */     
/*  74 */     this.jLabel6.setFont(new Font("宋体", 0, 24));
/*  75 */     this.jLabel6.setText("True Ans");
/*     */     
/*  77 */     this.ans.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  79 */             QuestionEdit.this.ansActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  83 */     this.d.setColumns(20);
/*  84 */     this.d.setRows(5);
/*  85 */     this.jScrollPane5.setViewportView(this.d);
/*     */     
/*  87 */     this.c.setColumns(20);
/*  88 */     this.c.setRows(5);
/*  89 */     this.jScrollPane2.setViewportView(this.c);
/*     */     
/*  91 */     this.b.setColumns(20);
/*  92 */     this.b.setRows(5);
/*  93 */     this.jScrollPane3.setViewportView(this.b);
/*     */     
/*  95 */     this.a.setColumns(20);
/*  96 */     this.a.setRows(5);
/*  97 */     this.jScrollPane4.setViewportView(this.a);
/*     */     
/*  99 */     this.jTextArea1.setColumns(20);
/* 100 */     this.jTextArea1.setRows(5);
/* 101 */     this.jScrollPane1.setViewportView(this.jTextArea1);
/*     */     
/* 103 */     this.jButton1.setFont(new Font("宋体", 0, 15));
/* 104 */     this.jButton1.setText("Submit");
/* 105 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 107 */             QuestionEdit.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 111 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 112 */     getContentPane().setLayout(layout);
/* 113 */     layout.setHorizontalGroup(layout
/* 114 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 115 */         .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/* 116 */           .addGap(44, 44, 44)
/* 117 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 118 */             .addComponent(this.jLabel5, -2, 139, -2)
/* 119 */             .addComponent(this.jLabel4, -2, 139, -2)
/* 120 */             .addComponent(this.jLabel2, -2, 139, -2)
/* 121 */             .addComponent(this.jLabel1, -2, 139, -2)
/* 122 */             .addComponent(this.jLabel3, -2, 139, -2)
/* 123 */             .addComponent(this.jLabel6, -2, 139, -2))
/* 124 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 59, 32767)
/* 125 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 126 */             .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 127 */               .addComponent(this.jScrollPane1, -2, 357, -2)
/* 128 */               .addComponent(this.jScrollPane2, -2, 357, -2)
/* 129 */               .addComponent(this.jScrollPane3, -2, 357, -2)
/* 130 */               .addComponent(this.jScrollPane4, -2, 357, -2)
/* 131 */               .addComponent(this.jScrollPane5, -2, 357, -2))
/* 132 */             .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/* 133 */               .addComponent(this.ans, -2, 109, -2)
/* 134 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 135 */               .addComponent(this.jButton1, -2, 118, -2)))
/* 136 */           .addGap(42, 42, 42)));
/*     */     
/* 138 */     layout.setVerticalGroup(layout
/* 139 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 140 */         .addGroup(layout.createSequentialGroup()
/* 141 */           .addGap(36, 36, 36)
/* 142 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 143 */             .addComponent(this.jScrollPane1, -2, 83, -2)
/* 144 */             .addGroup(layout.createSequentialGroup()
/* 145 */               .addGap(22, 22, 22)
/* 146 */               .addComponent(this.jLabel1, -2, 36, -2)))
/* 147 */           .addGap(37, 37, 37)
/* 148 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 149 */             .addComponent(this.jScrollPane4, -2, 46, -2)
/* 150 */             .addComponent(this.jLabel3, -2, 36, -2))
/* 151 */           .addGap(37, 37, 37)
/* 152 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 153 */             .addComponent(this.jScrollPane3, -2, 46, -2)
/* 154 */             .addComponent(this.jLabel2, -2, 36, -2))
/* 155 */           .addGap(12, 12, 12)
/* 156 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 157 */             .addGroup(layout.createSequentialGroup()
/* 158 */               .addGap(19, 19, 19)
/* 159 */               .addComponent(this.jScrollPane2, -2, 46, -2))
/* 160 */             .addComponent(this.jLabel5, -2, 36, -2))
/* 161 */           .addGap(27, 27, 27)
/* 162 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 163 */             .addComponent(this.jScrollPane5, -2, 46, -2)
/* 164 */             .addComponent(this.jLabel4, -2, 36, -2))
/* 165 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, 32767)
/* 166 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 167 */             .addComponent(this.jButton1, -2, 44, -2)
/* 168 */             .addComponent(this.jLabel6, -2, 36, -2)
/* 169 */             .addComponent(this.ans, -2, 44, -2))
/* 170 */           .addGap(34, 34, 34)));
/*     */ 
/*     */     
/* 173 */     pack();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void ansActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 182 */     sumit_success ss = new sumit_success();
/*     */     
/*     */     try {
/* 185 */       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
/*     */ 
/*     */ 
/*     */       
/* 189 */       Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=stulog;user=sa;password=sa");
/*     */       
/* 191 */       String Qus = this.jTextArea1.getText();
/* 192 */       String A = this.a.getText();
/* 193 */       String B = this.b.getText();
/* 194 */       String C = this.c.getText();
/* 195 */       String D = this.d.getText();
/* 196 */       String T = this.ans.getText();
/* 197 */       PreparedStatement Quslog = con.prepareStatement("insert into QnA (Qtext,A,B,C,D,T) values(?,?,?,?,?,?)");
/* 198 */       Quslog.setString(1, Qus);
/* 199 */       Quslog.setString(2, A);
/* 200 */       Quslog.setString(3, B);
/* 201 */       Quslog.setString(4, C);
/* 202 */       Quslog.setString(5, D);
/* 203 */       Quslog.setString(6, T);
/* 204 */       Quslog.executeUpdate();
/* 205 */       ss.setVisible(true);
/* 206 */       dispose();
/* 207 */     } catch (Exception exception) {}
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
/*     */   
/*     */   public static void main(String[] args) throws UnsupportedLookAndFeelException {
/*     */     try {
/* 222 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 223 */         if ("Nimbus".equals(info.getName())) {
/* 224 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 228 */     } catch (ClassNotFoundException ex) {
/* 229 */       Logger.getLogger(QuestionEdit.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 230 */     } catch (InstantiationException ex) {
/* 231 */       Logger.getLogger(QuestionEdit.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 232 */     } catch (IllegalAccessException ex) {
/* 233 */       Logger.getLogger(QuestionEdit.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 234 */     } catch (UnsupportedLookAndFeelException ex) {
/* 235 */       Logger.getLogger(QuestionEdit.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 240 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 242 */             (new QuestionEdit()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\QuestionEdit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */