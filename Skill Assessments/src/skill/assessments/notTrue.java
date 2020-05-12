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
/*     */ public class notTrue
/*     */   extends JFrame {
/*     */   public notTrue() {
/*  20 */     initComponents();
/*  21 */     setLocationRelativeTo(null);
/*  22 */     setDefaultCloseOperation(2);
/*     */   }
/*     */ 
/*     */   
/*     */   private JButton jButton1;
/*     */   
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   
/*     */   private void initComponents() {
/*  34 */     this.jLabel1 = new JLabel();
/*  35 */     this.jButton1 = new JButton();
/*  36 */     this.jLabel2 = new JLabel();
/*  37 */     this.jLabel3 = new JLabel();
/*  38 */     this.jLabel4 = new JLabel();
/*     */     
/*  40 */     setDefaultCloseOperation(3);
/*     */     
/*  42 */     this.jLabel1.setFont(new Font("宋体", 0, 14));
/*  43 */     this.jLabel1.setText("格式错误，你的密码必须符合以下格式");
/*     */     
/*  45 */     this.jButton1.setText("OK");
/*  46 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  48 */             notTrue.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  52 */     this.jLabel2.setFont(new Font("宋体", 0, 14));
/*  53 */     this.jLabel2.setText("超过六个字符");
/*     */     
/*  55 */     this.jLabel3.setFont(new Font("宋体", 0, 14));
/*  56 */     this.jLabel3.setText("数字");
/*     */     
/*  58 */     this.jLabel4.setFont(new Font("宋体", 0, 14));
/*  59 */     this.jLabel4.setText("大小写字母");
/*     */     
/*  61 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  62 */     getContentPane().setLayout(layout);
/*  63 */     layout.setHorizontalGroup(layout
/*  64 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  65 */         .addGroup(layout.createSequentialGroup()
/*  66 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  67 */             .addGroup(layout.createSequentialGroup()
/*  68 */               .addGap(61, 61, 61)
/*  69 */               .addComponent(this.jLabel1, -2, 273, -2))
/*  70 */             .addGroup(layout.createSequentialGroup()
/*  71 */               .addGap(73, 73, 73)
/*  72 */               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  73 */                 .addComponent(this.jLabel2, -2, 154, -2)
/*  74 */                 .addComponent(this.jButton1, -2, 77, -2)))
/*  75 */             .addGroup(layout.createSequentialGroup()
/*  76 */               .addGap(73, 73, 73)
/*  77 */               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  78 */                 .addComponent(this.jLabel3, -1, -1, 32767)
/*  79 */                 .addComponent(this.jLabel4, -1, -1, 32767))))
/*  80 */           .addContainerGap(66, 32767)));
/*     */     
/*  82 */     layout.setVerticalGroup(layout
/*  83 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  84 */         .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/*  85 */           .addGap(52, 52, 52)
/*  86 */           .addComponent(this.jLabel1, -2, 39, -2)
/*  87 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  88 */           .addComponent(this.jLabel2, -2, 33, -2)
/*  89 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  90 */           .addComponent(this.jLabel3, -2, 24, -2)
/*  91 */           .addGap(18, 18, 18)
/*  92 */           .addComponent(this.jLabel4)
/*  93 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, 32767)
/*  94 */           .addComponent(this.jButton1)
/*  95 */           .addGap(33, 33, 33)));
/*     */ 
/*     */     
/*  98 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 102 */     dispose();
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
/* 116 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 117 */         if ("Nimbus".equals(info.getName())) {
/* 118 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 122 */     } catch (ClassNotFoundException ex) {
/* 123 */       Logger.getLogger(notTrue.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 124 */     } catch (InstantiationException ex) {
/* 125 */       Logger.getLogger(notTrue.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 126 */     } catch (IllegalAccessException ex) {
/* 127 */       Logger.getLogger(notTrue.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 128 */     } catch (UnsupportedLookAndFeelException ex) {
/* 129 */       Logger.getLogger(notTrue.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 134 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 136 */             (new notTrue()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\notTrue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */