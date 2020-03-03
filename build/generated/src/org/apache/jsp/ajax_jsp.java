package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajax_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\"> \n");
      out.write("            function showTable(x,y){\n");
      out.write("                y.innerHTML=\"\";\n");
      out.write("                ajax = new XMLHttpRequest();\n");
      out.write("                ajax.open(\"GET\",\"AjaxServlet?op=table&n=\"+x, true);\n");
      out.write("                ajax.send();\n");
      out.write("                \n");
      out.write("                ajax.onreadystatechange = function(){\n");
      out.write("                  if(this.readyState ==4 && this.status==200){\n");
      out.write("                      y.innerHTML = this.responseText;\n");
      out.write("                  }  \n");
      out.write("                };\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("         function showSqr(x,y){\n");
      out.write("             y.innerHTML=\"\";\n");
      out.write("                ajax = new XMLHttpRequest();\n");
      out.write("                ajax.open(\"GET\",\"AjaxServlet?op=sqr&n=\"+x, true);\n");
      out.write("                ajax.send();\n");
      out.write("                \n");
      out.write("                ajax.onreadystatechange = function(){\n");
      out.write("                  if(this.readyState ==4 && this.status==200){\n");
      out.write("                      y.innerHTML = this.responseText;\n");
      out.write("                  }  \n");
      out.write("                };\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("         function loadNames(x,y){\n");
      out.write("             y.innerHTML=\"\";\n");
      out.write("              ajax = new XMLHttpRequest();\n");
      out.write("                ajax.open(\"GET\",\"AjaxServlet?op=search&name=\"+x, true);\n");
      out.write("                ajax.send();\n");
      out.write("                \n");
      out.write("                ajax.onreadystatechange = function(){\n");
      out.write("                  if(this.readyState ==4 && this.status==200){\n");
      out.write("                      y.innerHTML = this.responseText;\n");
      out.write("                  }  \n");
      out.write("                };\n");
      out.write("\n");
      out.write("         }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"AjaxServlet\">\n");
      out.write("            Enter a number to get Table: <input type=\"text\" name=\"n\" onblur=\"showTable(this.value,p1)\"/><br/>\n");
      out.write("            Enter a number to get square :<input type=\"text\" name=\"m\" onblur=\"showSqr(this.value,p1)\"/><br/>\n");
      out.write("            Enter Name to Search :<input type=\"text\" name=\"name\" list=\"list1\" autocomplete=\"off\" onkeyup=\"loadNames(this.value,list1);\"/>\n");
      out.write("            \n");
      out.write("            <p id=\"p1\"></p>\n");
      out.write("       \n");
      out.write("            <datalist id=\"list1\">\n");
      out.write("              \n");
      out.write("            </datalist>\n");
      out.write("       \n");
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
