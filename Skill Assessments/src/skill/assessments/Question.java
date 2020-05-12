/*     */ package skill.assessments;
import java.awt.EventQueue;
import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class Question extends JFrame {
/*   8 */   static int num = 0;
/*   9 */   static ArrayList<AQuestion> quenstions = new ArrayList<>();
/*  10 */   static ArrayList<String> answers = new ArrayList<>(); private JButton jButton1; private JButton jButton2; private JButton jButton3; private JButton jButton4; private JButton jButton5; private JButton jButton6; private JButton jButton7; private JLabel jLabel1; private JLabel jLabel2; private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel5; private JLabel jLabel6; private JPanel jPanel1; private JScrollPane jScrollPane1; private JTextArea jTextArea1; private JLabel myAnswer;
/*     */   private JLabel myanswer;
/*     */   
/*     */   public Question() {
/*     */     try {
/*  15 */       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
/*  16 */       Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=stulog;user=sa;password=sa");
/*     */       
/*  18 */       Statement statement = con.createStatement();
/*  19 */       ResultSet rs = statement.executeQuery("select * from QnA");
/*  20 */       while (rs.next()) {
/*     */         
/*  22 */         AQuestion question = new AQuestion(rs.getString(1).trim(), rs.getString(2).trim(), rs.getString(3).trim(), rs.getString(4).trim(), rs.getString(5).trim(), rs.getString(6).trim(), rs.getString(7).trim());
/*  23 */         quenstions.add(question);
/*  24 */         answers.add("");
/*     */       } 
/*     */       
/*  27 */       statement.close();
/*  28 */       con.close();
/*  29 */     } catch (Exception e) {
/*  30 */       e.printStackTrace();
/*     */     } 
/*  32 */     initComponents();
/*  33 */     setTitle("Question");
/*  34 */     setLocationRelativeTo(null);
/*  35 */     showquestion();
/*     */   }
/*     */   private void showquestion() {
/*  38 */     this.myAnswer.setText(answers.get(num));
/*  39 */     this.jButton1.setText(((AQuestion)quenstions.get(num)).A);
/*  40 */     this.jButton2.setText(((AQuestion)quenstions.get(num)).B);
/*  41 */     this.jButton3.setText(((AQuestion)quenstions.get(num)).C);
/*  42 */     this.jButton4.setText(((AQuestion)quenstions.get(num)).D);
/*  43 */     this.jTextArea1.setText(((AQuestion)quenstions.get(num)).text);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/*  54 */     this.jPanel1 = new JPanel();
/*  55 */     this.jLabel1 = new JLabel();
/*  56 */     this.jScrollPane1 = new JScrollPane();
/*  57 */     this.jTextArea1 = new JTextArea();
/*  58 */     this.jButton1 = new JButton();
/*  59 */     this.jButton2 = new JButton();
/*  60 */     this.jButton3 = new JButton();
/*  61 */     this.jButton4 = new JButton();
/*  62 */     this.jLabel2 = new JLabel();
/*  63 */     this.jLabel3 = new JLabel();
/*  64 */     this.jLabel4 = new JLabel();
/*  65 */     this.jLabel5 = new JLabel();
/*  66 */     this.jButton5 = new JButton();
/*  67 */     this.jLabel6 = new JLabel();
/*  68 */     this.jButton7 = new JButton();
/*  69 */     this.jButton6 = new JButton();
/*  70 */     this.myanswer = new JLabel();
/*  71 */     this.myAnswer = new JLabel();
/*     */     
/*  73 */     setDefaultCloseOperation(3);
/*     */     
/*  75 */     this.jTextArea1.setColumns(20);
/*  76 */     this.jTextArea1.setRows(5);
/*  77 */     this.jScrollPane1.setViewportView(this.jTextArea1);
/*     */     
/*  79 */     this.jButton1.setText("jButton1");
/*  80 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  82 */             Question.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  86 */     this.jButton2.setText("jButton2");
/*  87 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  89 */             Question.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  93 */     this.jButton3.setText("jButton3");
/*  94 */     this.jButton3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  96 */             Question.this.jButton3ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 100 */     this.jButton4.setText("jButton4");
/* 101 */     this.jButton4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 103 */             Question.this.jButton4ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 107 */     this.jLabel2.setText("B");
/*     */     
/* 109 */     this.jLabel3.setText("A");
/*     */     
/* 111 */     this.jLabel4.setText("D");
/*     */     
/* 113 */     this.jLabel5.setText("C");
/*     */     
/* 115 */     this.jButton5.setText("End Quiz");
/* 116 */     this.jButton5.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 118 */             Question.this.jButton5ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 122 */     this.jLabel6.setFont(new Font("宋体", 0, 18));
/* 123 */     this.jLabel6.setText("Ques:");
/*     */     
/* 125 */     this.jButton7.setText("Pre");
/* 126 */     this.jButton7.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 128 */             Question.this.jButton7ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 132 */     this.jButton6.setText("Next");
/* 133 */     this.jButton6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 135 */             Question.this.jButton6ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 139 */     this.myanswer.setFont(new Font("宋体", 0, 18));
/* 140 */     this.myanswer.setText("My Ans:");
/*     */     
/* 142 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 143 */     this.jPanel1.setLayout(jPanel1Layout);
/* 144 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 145 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 146 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 147 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 148 */             .addComponent(this.jLabel1)
/* 149 */             .addComponent(this.jLabel6, -2, 45, -2)
/* 150 */             .addComponent(this.myanswer))
/* 151 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 152 */             .addGroup(jPanel1Layout.createSequentialGroup()
/* 153 */               .addGap(9, 9, 9)
/* 154 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 155 */                 .addGroup(jPanel1Layout.createSequentialGroup()
/* 156 */                   .addComponent(this.jLabel3)
/* 157 */                   .addGap(25, 25, 25)
/* 158 */                   .addComponent(this.jButton1, -1, -1, 32767))
/* 159 */                 .addGroup(jPanel1Layout.createSequentialGroup()
/* 160 */                   .addComponent(this.jLabel5)
/* 161 */                   .addGap(25, 25, 25)
/* 162 */                   .addComponent(this.jButton3, -2, 150, -2))
/* 163 */                 .addComponent(this.jButton5))
/* 164 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 165 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 166 */                 .addGroup(jPanel1Layout.createSequentialGroup()
/* 167 */                   .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 168 */                     .addComponent(this.jLabel2)
/* 169 */                     .addComponent(this.jLabel4))
/* 170 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 171 */                   .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 172 */                     .addComponent(this.jButton2, -1, 150, 32767)
/* 173 */                     .addComponent(this.jButton4, -1, -1, 32767))
/* 174 */                   .addGap(39, 39, 39))
/* 175 */                 .addGroup(jPanel1Layout.createSequentialGroup()
/* 176 */                   .addComponent(this.jButton7)
/* 177 */                   .addGap(18, 18, 18)
/* 178 */                   .addComponent(this.jButton6)
/* 179 */                   .addGap(30, 30, 30))))
/* 180 */             .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 181 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, 32767)
/* 182 */               .addComponent(this.myAnswer, -2, 76, -2)
/* 183 */               .addGap(445, 445, 445))))
/* 184 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 185 */           .addContainerGap(-1, 32767)
/* 186 */           .addComponent(this.jScrollPane1, -2, 531, -2)));
/*     */     
/* 188 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 189 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 190 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 191 */           .addGap(35, 35, 35)
/* 192 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 193 */             .addGroup(jPanel1Layout.createSequentialGroup()
/* 194 */               .addComponent(this.jLabel1)
/* 195 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 196 */               .addComponent(this.jLabel6, -2, 27, -2))
/* 197 */             .addComponent(this.jScrollPane1, -2, -1, -2))
/* 198 */           .addGap(13, 13, 13)
/* 199 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 200 */             .addComponent(this.myanswer, -2, 24, -2)
/* 201 */             .addComponent(this.myAnswer, -2, 29, -2))
/* 202 */           .addGap(72, 72, 72)
/* 203 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 204 */             .addComponent(this.jButton1)
/* 205 */             .addComponent(this.jButton2)
/* 206 */             .addComponent(this.jLabel2)
/* 207 */             .addComponent(this.jLabel3))
/* 208 */           .addGap(41, 41, 41)
/* 209 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 210 */             .addComponent(this.jButton3)
/* 211 */             .addComponent(this.jButton4)
/* 212 */             .addComponent(this.jLabel4)
/* 213 */             .addComponent(this.jLabel5))
/* 214 */           .addGap(46, 46, 46)
/* 215 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 216 */             .addComponent(this.jButton5)
/* 217 */             .addComponent(this.jButton7)
/* 218 */             .addComponent(this.jButton6))
/* 219 */           .addContainerGap(-1, 32767)));
/*     */ 
/*     */     
/* 222 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 223 */     getContentPane().setLayout(layout);
/* 224 */     layout.setHorizontalGroup(layout
/* 225 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 226 */         .addGroup(layout.createSequentialGroup()
/* 227 */           .addContainerGap()
/* 228 */           .addComponent(this.jPanel1, -1, -1, 32767)
/* 229 */           .addContainerGap()));
/*     */     
/* 231 */     layout.setVerticalGroup(layout
/* 232 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 233 */         .addGroup(layout.createSequentialGroup()
/* 234 */           .addContainerGap()
/* 235 */           .addComponent(this.jPanel1, -1, -1, 32767)
/* 236 */           .addGap(93, 93, 93)));
/*     */ 
/*     */     
/* 239 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 243 */     if (num < quenstions.size() - 1) {
/* 244 */       num++;
/* 245 */       showquestion();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 251 */     answers.set(num, "B");
/* 252 */     this.myAnswer.setText("B");
/*     */   }
/*     */   
/*     */   private void jButton7ActionPerformed(ActionEvent evt) {
/* 256 */     if (num > 0) {
/* 257 */       num--;
/* 258 */       showquestion();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 264 */     answers.set(num, "A");
/* 265 */     this.myAnswer.setText("A");
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 269 */     answers.set(num, "C");
/* 270 */     this.myAnswer.setText("C");
/*     */   }
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 274 */     answers.set(num, "D");
/* 275 */     this.myAnswer.setText("D");
/*     */   }
/*     */   
/*     */   private void jButton5ActionPerformed(ActionEvent evt) {
/* 279 */     for (String answer : answers) {
/* 280 */       System.out.println("tttttttttttttttt" + answer);
/*     */     }
/* 282 */     int correct = 0;
/* 283 */     int done = 0;
/* 284 */     for (int i = 0; i < answers.size(); i++) {
/* 285 */       System.out.println("sssssssssssssss" + (String)answers.get(i));
/* 286 */       if (!((String)answers.get(i)).equals("")) done++; 
/* 287 */       if (((String)answers.get(i)).equals(((AQuestion)quenstions.get(i)).T)) {
/* 288 */         correct++;
/*     */       }
/*     */     } 
/*     */     
/* 292 */     dispose();
/* 293 */     FB fb = new FB();
/* 294 */     fb.setVisible(true);
/* 295 */     fb.setLabel1("" + quenstions.size());
/* 296 */     fb.setLabel2("" + done);
/* 297 */     fb.setLabel3("" + correct);
/* 298 */     fb.setLabel4("" + (done - correct));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void main(String[] args) throws UnsupportedLookAndFeelException {
/*     */     try {
/* 304 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 305 */         if ("Nimbus".equals(info.getName())) {
/* 306 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 310 */     } catch (ClassNotFoundException ex) {
/* 311 */       Logger.getLogger(Question.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 312 */     } catch (InstantiationException ex) {
/* 313 */       Logger.getLogger(Question.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 314 */     } catch (IllegalAccessException ex) {
/* 315 */       Logger.getLogger(Question.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 316 */     } catch (UnsupportedLookAndFeelException ex) {
/* 317 */       Logger.getLogger(Question.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 322 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 324 */             (new Question()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\Question.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */