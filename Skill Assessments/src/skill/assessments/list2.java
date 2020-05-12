/*    */ package skill.assessments;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.Statement;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JScrollPane;
/*    */ import javax.swing.JTable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class list2
/*    */   extends JFrame
/*    */ {
/*    */   static Connection con;
/*    */   static Statement sql;
/*    */   static ResultSet res;
/*    */   
/*    */   public static void main(String[] args) {
/* 39 */     list2 c = new list2();
/*    */     
/* 41 */     list2 frame = new list2();
/* 42 */     frame.setVisible(true);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public list2() {
/* 50 */     setDefaultCloseOperation(2);
/* 51 */     setTitle("题目列表");
/* 52 */     setBounds(100, 100, 800, 600);
/*    */     //此处可能存在问题
/* 54 */     String[] CN = { "ID", "问题", "A", "B", "C", "D", "正确答案" };
/* 55 */     int i = 0;
/*    */ 
/*    */     
/*    */     try {
/* 59 */       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
/*    */       
/* 61 */       con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=stulog;user=sa;password=sa");
/*    */       
/* 63 */       sql = con.createStatement();
/* 64 */       ResultSet sa = sql.executeQuery("select max(Qid) from QnA");
/* 65 */       sa.next();
/* 66 */       int hh = sa.getInt(1);
/* 67 */       sa.close();
/* 68 */       res = sql.executeQuery("select * from QnA");
/*    */ 
/*    */       
/* 71 */       String[][] TV = new String[hh][7];
/* 72 */       while (res.next()) {
/* 73 */         String aa = res.getString(1);
/* 74 */         String bb = res.getString(2);
/* 75 */         String cc = res.getString(3);
/* 76 */         String dd = res.getString(4);
/* 77 */         String ee = res.getString(5);
/* 78 */         String ff = res.getString(6);
/* 79 */         String gg = res.getString(7);
/* 80 */         System.out.println(aa);
/* 81 */         TV[i][0] = aa;
/* 82 */         TV[i][1] = bb;
/* 83 */         TV[i][2] = cc;
/* 84 */         TV[i][3] = dd;
/* 85 */         TV[i][4] = ee;
/* 86 */         TV[i][5] = ff;
/* 87 */         TV[i][6] = gg;
/*    */         
/* 89 */         i++;
/*    */       } 
/* 91 */       JTable table = new JTable((Object[][])TV, (Object[])CN);
/* 92 */       JScrollPane scrollPane = new JScrollPane(table);
/* 93 */       getContentPane().add(scrollPane, "Center");
/*    */     } catch (Exception e) {
/* 95 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\list2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */