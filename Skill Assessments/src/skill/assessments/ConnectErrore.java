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
/*     */ public class ConnectErrore
/*     */   extends JFrame {
/*     */   public ConnectErrore() {
/*  20 */     initComponents();
/*  21 */     setTitle("ERROR");
/*  22 */     setDefaultCloseOperation(2);
/*  23 */     setLocationRelativeTo(null);
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
/*  40 */     this.jLabel1.setFont(new Font("宋体", 0, 24));
/*  41 */     this.jLabel1.setText("连接出错，请重试");
/*     */     
/*  43 */     this.jButton1.setFont(new Font("宋体", 0, 18));
/*  44 */     this.jButton1.setText("OK");
/*  45 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  47 */             ConnectErrore.this.jButton1ActionPerformed(evt);
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
/*  58 */               .addGap(37, 37, 37)
/*  59 */               .addComponent(this.jLabel1))
/*  60 */             .addGroup(layout.createSequentialGroup()
/*  61 */               .addGap(176, 176, 176)
/*  62 */               .addComponent(this.jButton1, -2, 88, -2)))
/*  63 */           .addContainerGap(43, 32767)));
/*     */     
/*  65 */     layout.setVerticalGroup(layout
/*  66 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  67 */         .addGroup(layout.createSequentialGroup()
/*  68 */           .addGap(127, 127, 127)
/*  69 */           .addComponent(this.jLabel1)
/*  70 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 71, 32767)
/*  71 */           .addComponent(this.jButton1, -2, 41, -2)
/*  72 */           .addGap(46, 46, 46)));
/*     */ 
/*     */     
/*  75 */     pack();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/*  80 */     dispose();
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
/*  93 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/*  94 */         if ("Nimbus".equals(info.getName())) {
/*  95 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/*  99 */     } catch (ClassNotFoundException ex) {
/* 100 */       Logger.getLogger(ConnectErrore.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 101 */     } catch (InstantiationException ex) {
/* 102 */       Logger.getLogger(ConnectErrore.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 103 */     } catch (IllegalAccessException ex) {
/* 104 */       Logger.getLogger(ConnectErrore.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 105 */     } catch (UnsupportedLookAndFeelException ex) {
/* 106 */       Logger.getLogger(ConnectErrore.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 111 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 113 */             (new ConnectErrore()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\ConnectErrore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */