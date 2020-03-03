<%-- 
    Document   : ajaxnew
    Created on : 22 Feb, 2020, 6:58:15 PM
    Author     : shobh
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
          function selectcity(x,y)
          {
                ajax = new XMLHttpRequest();
              ajax.open("GET","User?states_id="+x,true);
              ajax.send();
             // alert(x);
              ajax.onreadystatechange=function(){
                  if(this.readyState==4 && this.status==200)
                  {
                        y.innerHTML = this.responseText;
                  }
              };
              
          }
        </script>
    </head>
    <body>
        <h1>Example of Ajax</h1>
       
        <form action="User" class="form">
             <table class="table bg-light"> 
                     <tr>     
                         <td>Enter State </td>
                         <td>
                             <select class="form-control" onchange="selectcity(this.value,city_id)"></br>
                              
                         <option>select state</option>
                         <%
                             PreparedStatement smt;
                             Class.forName("com.mysql.jdbc.Driver");
                             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gisttraining", "root", "123456");
                             String sql="select *from states";
                             smt=con.prepareStatement(sql);
                             ResultSet rs=smt.executeQuery();
                             while(rs.next())
                             {
                             %>
                             <option value="<%=rs.getString(1)%>"><%=rs.getString(2)%></option>
                             <%}%>
                             </select>
                     </td>
                     </tr>
                     <tr>
                         <td>Select City</td>
                         <td>
                             <select id="city_id" class="form-control">
                                 <option>Select City</option>
                             </select>
                         </td>
                     </tr>
                 </table>
        </form>
    </body>
</html>
