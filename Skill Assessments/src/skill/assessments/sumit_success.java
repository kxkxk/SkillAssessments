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
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class sumit_success extends JFrame {
/*     */   private JButton jButton1;
/*     */   
/*     */   public sumit_success() {
/*  20 */     initComponents();
/*  21 */     setLocationRelativeTo(null);
/*  22 */     setDefaultCloseOperation(2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/*  34 */     this.jButton1 = new JButton();
/*  35 */     this.jLabel1 = new JLabel();
/*     */     
/*  37 */     setDefaultCloseOperation(3);
/*     */     
/*  39 */     this.jButton1.setText("OK");
/*  40 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  42 */             sumit_success.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  46 */     this.jLabel1.setFont(new Font("宋体", 0, 24));
/*  47 */     this.jLabel1.setText("submit success!");
/*     */     
/*  49 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  50 */     getContentPane().setLayout(layout);
/*  51 */     layout.setHorizontalGroup(layout
/*  52 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  53 */         .addGroup(layout.createSequentialGroup()
/*  54 */           .addGap(125, 125, 125)
/*  55 */           .addComponent(this.jButton1, -2, 77, -2)
/*  56 */           .addContainerGap(-1, 32767))
/*  57 */         .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/*  58 */           .addContainerGap(66, 32767)
/*  59 */           .addComponent(this.jLabel1, -2, 222, -2)
/*  60 */           .addGap(55, 55, 55)));
/*     */     
/*  62 */     layout.setVerticalGroup(layout
/*  63 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  64 */         .addGroup(layout.createSequentialGroup()
/*  65 */           .addContainerGap(75, 32767)
/*  66 */           .addComponent(this.jLabel1, -2, 70, -2)
/*  67 */           .addGap(52, 52, 52)
/*  68 */           .addComponent(this.jButton1)
/*  69 */           .addGap(52, 52, 52)));
/*     */ 
/*     */     
/*  72 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/*  76 */     setVisible(false);
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
/*  90 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/*  91 */         if ("Nimbus".equals(info.getName())) {
/*  92 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/*  96 */     } catch (ClassNotFoundException ex) {
/*  97 */       Logger.getLogger(sumit_success.class.getName()).log(Level.SEVERE, (String)null, ex);
/*  98 */     } catch (InstantiationException ex) {
/*  99 */       Logger.getLogger(sumit_success.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 100 */     } catch (IllegalAccessException ex) {
/* 101 */       Logger.getLogger(sumit_success.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 102 */     } catch (UnsupportedLookAndFeelException ex) {
/* 103 */       Logger.getLogger(sumit_success.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 108 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 110 */             (new sumit_success()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\sumit_success.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */