/*     */ package skill.assessments;
/*     */ import java.awt.Font;
/*     */ import javax.swing.GroupLayout;
import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
/*     */ 
/*     */ public class FB extends JFrame {
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel11;
/*     */   
/*     */   public FB() {
/*  11 */     initComponents();
/*  12 */     setLocationRelativeTo(null);
/*  13 */     setTitle("结果");
/*     */   }
/*     */   private JLabel jLabel2; private JLabel jLabel3; private JLabel jLabel4; private JPanel jPanel1; private JLabel label1; private JLabel label2; private JLabel label3;
/*     */   private JLabel label4;
/*     */   
/*     */   private void initComponents() {
/*  19 */     this.jPanel1 = new JPanel();
/*  20 */     this.jLabel1 = new JLabel();
/*  21 */     this.jLabel2 = new JLabel();
/*  22 */     this.jLabel3 = new JLabel();
/*  23 */     this.jLabel4 = new JLabel();
/*  24 */     this.label1 = new JLabel();
/*  25 */     this.jLabel11 = new JLabel();
/*  26 */     this.label3 = new JLabel();
/*  27 */     this.label4 = new JLabel();
/*  28 */     this.label2 = new JLabel();
/*     */     
/*  30 */     setDefaultCloseOperation(3);
/*     */     
/*  32 */     this.jLabel1.setFont(new Font("宋体", 0, 36));
/*  33 */     this.jLabel1.setText("问题总数");
/*     */     
/*  35 */     this.jLabel2.setFont(new Font("宋体", 0, 36));
/*  36 */     this.jLabel2.setText("回答数");
/*     */     
/*  38 */     this.jLabel3.setFont(new Font("宋体", 0, 36));
/*  39 */     this.jLabel3.setText("正确数");
/*     */     
/*  41 */     this.jLabel4.setFont(new Font("宋体", 0, 36));
/*  42 */     this.jLabel4.setText("错误数");
/*     */     
/*  44 */     this.label1.setFont(new Font("宋体", 0, 36));
/*     */     
/*  46 */     this.jLabel11.setFont(new Font("宋体", 0, 36));
/*     */     
/*  48 */     this.label3.setFont(new Font("宋体", 0, 36));
/*     */     
/*  50 */     this.label4.setFont(new Font("宋体", 0, 36));
/*     */     
/*  52 */     this.label2.setFont(new Font("宋体", 0, 36));
/*     */     
/*  54 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  55 */     this.jPanel1.setLayout(jPanel1Layout);
/*  56 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  57 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  58 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  59 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  60 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  61 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  62 */                 .addComponent(this.jLabel1, -1, 250, 32767)
/*  63 */                 .addComponent(this.jLabel2, -1, -1, 32767)
/*  64 */                 .addComponent(this.jLabel4, -1, -1, 32767))
/*  65 */               .addGap(0, 0, 32767))
/*  66 */             .addComponent(this.jLabel3, GroupLayout.Alignment.TRAILING, -1, -1, 32767))
/*  67 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  68 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  69 */             .addComponent(this.jLabel11, GroupLayout.Alignment.TRAILING, -1, 70, 32767)
/*  70 */             .addComponent(this.label4, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
/*  71 */             .addComponent(this.label3, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
/*  72 */             .addComponent(this.label2, -1, -1, 32767)
/*  73 */             .addComponent(this.label1, GroupLayout.Alignment.TRAILING, -1, -1, 32767))
/*  74 */           .addContainerGap()));
/*     */     
/*  76 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/*  77 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  78 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  79 */           .addGap(14, 14, 14)
/*  80 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  81 */             .addComponent(this.jLabel1, -2, 65, -2)
/*  82 */             .addComponent(this.label1, -2, 65, -2))
/*  83 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  84 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  85 */             .addComponent(this.jLabel2, -2, 65, -2)
/*  86 */             .addComponent(this.label2, -2, 65, -2))
/*  87 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  88 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  89 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  90 */               .addComponent(this.jLabel3, -2, 65, -2)
/*  91 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  92 */               .addComponent(this.jLabel4, -2, 65, -2))
/*  93 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  94 */               .addComponent(this.label3, -2, 65, -2)
/*  95 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  96 */               .addComponent(this.label4, -2, 65, -2)))
/*  97 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  98 */           .addComponent(this.jLabel11, -2, 65, -2)
/*  99 */           .addContainerGap(-1, 32767)));
/*     */ 
/*     */     
/* 102 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 103 */     getContentPane().setLayout(layout);
/* 104 */     layout.setHorizontalGroup(layout
/* 105 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 106 */         .addGroup(layout.createSequentialGroup()
/* 107 */           .addContainerGap()
/* 108 */           .addComponent(this.jPanel1, -1, -1, 32767)
/* 109 */           .addContainerGap()));
/*     */     
/* 111 */     layout.setVerticalGroup(layout
/* 112 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 113 */         .addGroup(layout.createSequentialGroup()
/* 114 */           .addContainerGap()
/* 115 */           .addComponent(this.jPanel1, -2, 298, -2)
/* 116 */           .addContainerGap(-1, 32767)));
/*     */ 
/*     */     
/* 119 */     pack();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLabel1(String x) {
/* 141 */     this.label1.setText(x);
/*     */   }
/*     */   public void setLabel2(String x) {
/* 144 */     this.label2.setText(x);
/*     */   }
/*     */   public void setLabel3(String x) {
/* 147 */     this.label3.setText(x);
/*     */   }
/*     */   public void setLabel4(String x) {
/* 150 */     this.label4.setText(x);
/*     */   }
/*     */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\FB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */