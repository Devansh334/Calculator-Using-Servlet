

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DEVANSH GOYAL
 */
public class Cal extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        int no1 = Integer.parseInt(request.getParameter("a"));
        int no2 = Integer.parseInt(request.getParameter("b"));
       
        String operation = request.getParameter("oper");
        
        switch (operation) {
            case "+":
                {
                    int n=no1+no2;
                    out.println("SUM = "+n);
                    break;
                }
            case "-":
                {
                    int n=no1-no2;
                    out.println("DIFFERENCE = "+n);
                    break;
                }
            case "*":
                {
                    int n=no1*no2;
                    out.println("PRODUCT = "+n);
                    break;
                }
            case "/":
                {
                    int n=no1/no2;
                    out.println("QUOTIENT = "+n);
                    break;
                }
            case "%":
                {
                    int n=no1%no2;
                    out.println("REMINDER = "+n);
                    break;
                }
            default:
                break;
        }
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
