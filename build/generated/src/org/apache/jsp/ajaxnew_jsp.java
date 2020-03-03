package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public final class ajaxnew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("          function selectcity(x,y)\n");
      out.write("          {\n");
      out.write("              alert(x);\n");
      out.write("              var t=new XMLHttpRequest();\n");
      out.write("              t.open(\"GET\",\"User?id=\"+x,true);\n");
      out.write("              t.send();\n");
      out.write("             // alert(x);\n");
      out.write("              t.onreadystatechange=function()\n");
      out.write("              {\n");
      out.write("                  if(this.readyState==4 && this.status==400)\n");
      out.write("                  {\n");
      out.write("                        y.innerHtML=this.responseText;\n");
      out.write("                  }\n");
      out.write("              };\n");
      out.write("          }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Example of Ajax</h1>\n");
      out.write("       \n");
      out.write("        <form action=\"User\" class=\"form\">\n");
      out.write("             <table class=\"table bg-light\"> \n");
      out.write("                     <tr>     \n");
      out.write("                         <td>Enter State </td>\n");
      out.write("                         <td>\n");
      out.write("                             <select class=\"form-control\" onchange=\"selectcity(this.value,city_id)\"></br>\n");
      out.write("                              \n");
      out.write("                         <option>select state</option>\n");
      out.write("                         ");

                             PreparedStatement smt;
                             Class.forName("com.mysql.jdbc.Driver");
                             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gisttraining", "root", "123456");
                             String sql="select *from states";
                             smt=con.prepareStatement(sql);
                             ResultSet rs=smt.executeQuery();
                             while(rs.next())
                             {
                             
      out.write("\n");
      out.write("                             <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                             ");
}
      out.write("\n");
      out.write("                             </select>\n");
      out.write("                     </td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td>Select City</td>\n");
      out.write("                         <td>\n");
      out.write("                             <select id=\"city_id\" class=\"form-control\">\n");
      out.write("                                 <option>Select City</option>\n");
      out.write("                             </select>\n");
      out.write("                         </td>\n");
      out.write("                     </tr>\n");
      out.write("                 </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
