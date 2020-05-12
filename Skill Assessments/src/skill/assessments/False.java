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
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class False
/*     */   extends JFrame {
/*     */   public False() {
/*  20 */     initComponents();
/*  21 */     setLocationRelativeTo(null);
/*  22 */     setTitle("出错！");
/*  23 */     setDefaultCloseOperation(2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private JButton jButton1;
/*     */ 
/*     */   
/*     */   private JLabel jLabel1;
/*     */ 
/*     */   
/*     */   private void initComponents() {
/*  35 */     this.jLabel1 = new JLabel();
/*  36 */     this.jButton1 = new JButton();
/*     */     
/*  38 */     setDefaultCloseOperation(3);
/*     */     
/*  40 */     this.jLabel1.setFont(new Font("宋体", 0, 36));
/*  41 */     this.jLabel1.setText("用户名或密码错误");
/*     */     
/*  43 */     this.jButton1.setFont(new Font("宋体", 0, 30));
/*  44 */     this.jButton1.setText("OK");
/*  45 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  47 */             False.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  51 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  52 */     getContentPane().setLayout(layout);
/*  53 */     layout.setHorizontalGroup(layout
/*  54 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  55 */         .addGroup(layout.createSequentialGroup()
/*  56 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  57 */             .addGroup(layout.createSequentialGroup()
/*  58 */               .addGap(54, 54, 54)
/*  59 */               .addComponent(this.jLabel1))
/*  60 */             .addGroup(layout.createSequentialGroup()
/*  61 */               .addGap(166, 166, 166)
/*  62 */               .addComponent(this.jButton1, -2, 140, -2)))
/*  63 */           .addContainerGap(63, 32767)));
/*     */     
/*  65 */     layout.setVerticalGroup(layout
/*  66 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  67 */         .addGroup(layout.createSequentialGroup()
/*  68 */           .addGap(123, 123, 123)
/*  69 */           .addComponent(this.jLabel1)
/*  70 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 100, 32767)
/*  71 */           .addComponent(this.jButton1)
/*  72 */           .addGap(43, 43, 43)));
/*     */ 
/*     */     
/*  75 */     pack();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/*  80 */     setVisible(false);
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
/*  94 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/*  95 */         if ("Nimbus".equals(info.getName())) {
/*  96 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 100 */     } catch (ClassNotFoundException ex) {
/* 101 */       Logger.getLogger(False.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 102 */     } catch (InstantiationException ex) {
/* 103 */       Logger.getLogger(False.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 104 */     } catch (IllegalAccessException ex) {
/* 105 */       Logger.getLogger(False.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 106 */     } catch (UnsupportedLookAndFeelException ex) {
/* 107 */       Logger.getLogger(False.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 112 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 114 */             (new False()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\False.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */