package mum.cs475;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Abeje
 */
public class checkName extends HttpServlet {
    @Override
    //This doGet simply forwards the request to the doPost. It is intended
    //only for expansion purposes, when other pages link to this servlet
    //in the future.
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("about to call post from get");
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("Inside do post");
        RequestDispatcher rd = request.getRequestDispatcher("ValidateUsrName.jsp");
        HttpSession session = request.getSession();
        String userName = (String)request.getParameter("usr");
        String pswd = (String)request.getParameter("pswd");
        int age = 0;
        try{
            age = Integer.parseInt(request.getParameter("age"));
        }catch(NumberFormatException ex){
            request.setAttribute("ageError","Age field must be a number !");
            rd.forward(request,response);
                    
        }
        
        if (age < 4 || age > 100) {
            request.setAttribute("ageError", "Required field: Age. Must be between 4 and 100(inclusive).");
            rd.forward(request, response);
            return;
        }
        if(userName.equals(""))
        {
             request.setAttribute("usrError", "Required field: User name. ");
             rd.forward(request, response);
            return;
        }
        if(!pswd.equals("apple"))
        {
            request.setAttribute("pswdError", "Password does not much.");
            request.setAttribute("attempts","")
             rd.forward(request, response);
            return;
            
        }
        rd = request.getRequestDispatcher("WelcomeUser.jsp"); 
        session.setAttribute("usr", userName);
        rd.forward(request, response);
       

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
