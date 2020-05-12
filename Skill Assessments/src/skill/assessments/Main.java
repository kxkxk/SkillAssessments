/*     */ package skill.assessments;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class Main extends JFrame {
/*     */   public Main() {
/*  21 */     initComponents();
/*  22 */     setLocationRelativeTo(null);
/*  23 */     setTitle("思政答题软件");
/*     */   }
/*     */ 
/*     */   
/*     */   private JButton jButton1;
/*     */   
/*     */   private JButton jButton2;
/*     */   
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JPanel jPanel1;
/*     */   
/*     */   private void initComponents() {
/*  36 */     this.jPanel1 = new JPanel();
/*  37 */     this.jLabel1 = new JLabel();
/*  38 */     this.jLabel2 = new JLabel();
/*  39 */     this.jButton1 = new JButton();
/*  40 */     this.jButton2 = new JButton();
/*     */     
/*  42 */     setDefaultCloseOperation(3);
/*  43 */     addWindowListener(new WindowAdapter() {
/*     */           public void windowClosing(WindowEvent evt) {
/*  45 */             Main.this.formWindowClosing(evt);
/*     */           }
/*     */         });
/*     */     
/*  49 */     this.jLabel1.setFont(new Font("Agency FB", 0, 100));
/*  50 */     this.jLabel1.setText("欢迎!");
/*     */     
/*  52 */     this.jLabel2.setFont(new Font("Agency FB", 0, 24));
/*  53 */     this.jLabel2.setText("请选择你要进行的操作");
/*     */     
/*  55 */     this.jButton1.setText("管理");
/*  56 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  58 */             Main.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  62 */     this.jButton2.setText("答题");
/*  63 */     this.jButton2.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/*  65 */             Main.this.jButton2MouseClicked(evt);
/*     */           }
/*     */         });
/*  68 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  70 */             Main.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  74 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  75 */     this.jPanel1.setLayout(jPanel1Layout);
/*  76 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  77 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  78 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  79 */           .addGap(21, 21, 21)
/*  80 */           .addComponent(this.jLabel1, -2, 472, -2)
/*  81 */           .addGap(0, 0, 32767))
/*  82 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/*  83 */           .addContainerGap(85, 32767)
/*  84 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  85 */             .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/*  86 */               .addComponent(this.jLabel2, -2, 458, -2)
/*  87 */               .addGap(77, 77, 77))
/*  88 */             .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/*  89 */               .addComponent(this.jButton1, -2, 240, -2)
/*  90 */               .addGap(51, 51, 51)
/*  91 */               .addComponent(this.jButton2, -2, 120, -2)
/*  92 */               .addGap(107, 107, 107)))));
/*     */     
/*  94 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/*  95 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  96 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  97 */           .addGap(35, 35, 35)
/*  98 */           .addComponent(this.jLabel1, -2, 125, -2)
/*  99 */           .addGap(44, 44, 44)
/* 100 */           .addComponent(this.jLabel2, -2, 31, -2)
/* 101 */           .addGap(63, 63, 63)
/* 102 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 103 */             .addComponent(this.jButton1, -2, 82, -2)
/* 104 */             .addComponent(this.jButton2, -2, 82, -2))
/* 105 */           .addContainerGap(80, 32767)));
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
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 130 */     TeaLogin tea = new TeaLogin();
/* 131 */     tea.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton2MouseClicked(MouseEvent evt) {
/* 144 */     StuLogin stu = new StuLogin();
/*     */     
/* 146 */     stu.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void formWindowClosing(WindowEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 164 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 165 */         if ("Nimbus".equals(info.getName())) {
/* 166 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 170 */     } catch (ClassNotFoundException ex) {
/* 171 */       Logger.getLogger(Main.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 172 */     } catch (InstantiationException ex) {
/* 173 */       Logger.getLogger(Main.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 174 */     } catch (IllegalAccessException ex) {
/* 175 */       Logger.getLogger(Main.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 176 */     } catch (UnsupportedLookAndFeelException ex) {
/* 177 */       Logger.getLogger(Main.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 182 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 184 */             (new Main()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */