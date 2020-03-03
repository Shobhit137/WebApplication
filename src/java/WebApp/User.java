package WebApp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class User extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
      
        String state_id =request.getParameter("states_id");
        
        Connection con = null;
           
        PreparedStatement smt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gisttraining", "root", "123456");
            String sql = "select * from city where states_id=?";
            smt = con.prepareStatement(sql);
            smt.setString(1, state_id);
           
            ResultSet rs = smt.executeQuery();
             System.out.print("x");
            String option="<option>Select City</option>";
            while(rs.next()) {
               //out.println("hello world");
           option=option+"<option value="+rs.getString(1)+">"+rs.getString(2)+"</option>"; 
            //out.print("<option value="+rs.getString("name")+">"+rs.getString("states_id")+"</option>");
             
            } 
            out.println(option);
            
        } catch (Exception e) {
            System.out.println("Error : + " + e.getMessage());

        }
    }

    //response.sendRedirect("register.jsp");




    
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    

}
