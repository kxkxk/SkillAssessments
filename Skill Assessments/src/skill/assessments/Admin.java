/*     */ package skill.assessments;
/*     */ 
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class Admin
/*     */   extends JFrame {
/*     */   public Admin() {
/*  20 */     initComponents();
/*  21 */     setLocationRelativeTo(null);
/*  22 */     setTitle("管理");
/*     */   }
/*     */ 
/*     */   
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JPanel jPanel1;
/*     */   
/*     */   private void initComponents() {
/*  34 */     this.jPanel1 = new JPanel();
/*  35 */     this.jLabel1 = new JLabel();
/*  36 */     this.jLabel2 = new JLabel();
/*  37 */     this.jButton1 = new JButton();
/*  38 */     this.jButton2 = new JButton();
/*  39 */     this.jButton3 = new JButton();
/*     */     
/*  41 */     setDefaultCloseOperation(3);
/*     */     
/*  43 */     this.jLabel1.setFont(new Font("Agency FB", 0, 91));
/*  44 */     this.jLabel1.setText("欢迎");
/*     */     
/*  46 */     this.jLabel2.setFont(new Font("Agency FB", 0, 36));
/*  47 */     this.jLabel2.setText("选择你要进行的操作");
/*     */     
/*  49 */     this.jButton1.setText("编辑题目");
/*  50 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  52 */             Admin.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  56 */     this.jButton2.setText("查看题目");
/*  57 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  59 */             Admin.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  63 */     this.jButton3.setText("学生信息");
/*  64 */     this.jButton3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  66 */             Admin.this.jButton3ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  70 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  71 */     this.jPanel1.setLayout(jPanel1Layout);
/*  72 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  73 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  74 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  75 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  76 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  77 */               .addContainerGap()
/*  78 */               .addComponent(this.jLabel1))
/*  79 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  80 */               .addGap(95, 95, 95)
/*  81 */               .addComponent(this.jLabel2)))
/*  82 */           .addContainerGap(221, 32767))
/*  83 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/*  84 */           .addGap(0, 0, 32767)
/*  85 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  86 */             .addComponent(this.jButton3)
/*  87 */             .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  88 */               .addComponent(this.jButton2)
/*  89 */               .addComponent(this.jButton1)))
/*  90 */           .addGap(195, 195, 195)));
/*     */     
/*  92 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/*  93 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  94 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  95 */           .addGap(46, 46, 46)
/*  96 */           .addComponent(this.jLabel1)
/*  97 */           .addGap(18, 18, 18)
/*  98 */           .addComponent(this.jLabel2)
/*  99 */           .addGap(38, 38, 38)
/* 100 */           .addComponent(this.jButton1)
/* 101 */           .addGap(44, 44, 44)
/* 102 */           .addComponent(this.jButton2)
/* 103 */           .addGap(44, 44, 44)
/* 104 */           .addComponent(this.jButton3)
/* 105 */           .addContainerGap(48, 32767)));
/*     */ 
/*     */     
/* 108 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 109 */     getContentPane().setLayout(layout);
/* 110 */     layout.setHorizontalGroup(layout
/* 111 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 112 */         .addGroup(layout.createSequentialGroup()
/* 113 */           .addContainerGap()
/* 114 */           .addComponent(this.jPanel1, -1, -1, 32767)
/* 115 */           .addContainerGap()));
/*     */     
/* 117 */     layout.setVerticalGroup(layout
/* 118 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 119 */         .addGroup(layout.createSequentialGroup()
/* 120 */           .addContainerGap()
/* 121 */           .addComponent(this.jPanel1, -1, -1, 32767)
/* 122 */           .addContainerGap()));
/*     */ 
/*     */     
/* 125 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 129 */     list2 qu = new list2();
/* 130 */     qu.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 134 */     LIST1 qu = new LIST1();
/* 135 */     qu.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 139 */     QuestionEdit QE = new QuestionEdit();
/* 140 */     QE.setVisible(true);
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
/*     */   public static void main(String[] args) {
/*     */     try {
/* 153 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 154 */         if ("Nimbus".equals(info.getName())) {
/* 155 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 159 */     } catch (ClassNotFoundException ex) {
/* 160 */       Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 161 */     } catch (InstantiationException ex) {
/* 162 */       Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 163 */     } catch (IllegalAccessException ex) {
/* 164 */       Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 165 */     } catch (UnsupportedLookAndFeelException ex) {
/* 166 */       Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 174 */             (new Admin()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\Admin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */