
package WebApp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class AjaxServlet extends HttpServlet {

     
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        //show the table of number 
        
        String friends[] ={"amit","suresh","mukesh","ganesh","mohan","sohan","ramakant","anit",
            "babita","monika"};
        
        
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String op=request.getParameter("op");
        if(op!=null && op.equalsIgnoreCase("table")){
        int n =Integer.parseInt(request.getParameter("n"));
        for(int i=1;i<=10;i++)
            out.println("<br/>" + (n*i));    
        }
    
    if (op!=null && op.equalsIgnoreCase("sqr") ){
         int n =Integer.parseInt(request.getParameter("n"));
         out.println(n*n);
    }
    if (op!=null && op.equalsIgnoreCase("search")){
        String name = request.getParameter("name");
        for (String s : friends)
            if (s.contains(name))
                out.println("<option value=\""+ s +"\"></option>");
    }

        }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
}
