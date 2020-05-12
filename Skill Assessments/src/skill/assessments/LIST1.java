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
/*    */ public class LIST1
/*    */   extends JFrame
/*    */ {
/*    */   static Connection con;
/*    */   static Statement sql;
/*    */   static ResultSet res;
/*    */   
/*    */   public static void main(String[] args) {
/* 39 */     LIST1 c = new LIST1();
/*    */     
/* 41 */     LIST1 frame = new LIST1();
/* 42 */     frame.setVisible(true);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public LIST1() {
/* 48 */     setLocationRelativeTo(null);
/*    */ 
/*    */     
/* 51 */     setDefaultCloseOperation(2);
/* 52 */     setTitle("学生列表");
/* 53 */     setBounds(100, 100, 800, 600);
/*    */     //此处可能存在问题
/* 55 */     String[] CN = { "姓名", "ID" };
/* 56 */     int i = 0;
/*    */ 
/*    */     
/*    */     try {
/* 60 */       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
/*    */       
/* 62 */       con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=stulog;user=sa;password=sa");
/*    */       
/* 64 */       sql = con.createStatement();
/* 65 */       ResultSet sa = sql.executeQuery("select max(NO) from Stu");
/* 66 */       sa.next();
/* 67 */       int cc = sa.getInt(1);
/* 68 */       sa.close();
/*    */       
/* 70 */       res = sql.executeQuery("select * from Stu");
/* 71 */       String[][] TV = new String[cc][2];
/* 72 */       while (res.next()) {
/* 73 */         String aa = res.getString(1);
/* 74 */         String bb = res.getString(2);
/* 75 */         TV[i][0] = aa;
/* 76 */         TV[i][1] = bb;
/* 77 */         i++;
/*    */       } 
/* 79 */       JTable table = new JTable((Object[][])TV, (Object[])CN);
/* 80 */       JScrollPane scrollPane = new JScrollPane(table);
/* 81 */       getContentPane().add(scrollPane, "Center");
/*    */     } catch (Exception e) {
/* 83 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\TF\Desktop\Skill_Assessments.jar!\skill\assessments\LIST1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */