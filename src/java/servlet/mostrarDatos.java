package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ConectorBD;
@WebServlet(name = "mostrarDatos", urlPatterns = {"/mostrarDatos"})
public class mostrarDatos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ConectorBD conector = new ConectorBD();
            Enumeration<String> array = request.getParameterNames();
            String [] alumno = new String[23];
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"vista/mainformulario1.css\">");
            out.println("<title>Registro IES-9024 Online</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"form_top\">");
            out.println("<h2>IES 9-024 - <span>INSCRIPCIÒN </span>- SISTEMAS <span>Finalizado</span></h2>");
            out.println("<body>");
            out.println("<img src=\"./img/LOGO_NUEVO.png\" >");
            
            for(int x=0;x<24;x++){
                alumno[x] =  request.getParameter(array.nextElement());                
            }
            out.println("<h2 style=\"color:brown\">Registro exitoso "+alumno[1]+ " "+alumno[0]+"</h2>");
            out.println("<h2 style=\"color:brown\">Dato n°8 "+alumno[8]+"</h2>");
            out.println("<h2 style=\"color:brown\">Dato n°9"+alumno[9]+"</h2>");
            out.println("<h2 style=\"color:brown\">Dato n°10 "+alumno[10]+"</h2>");
            out.println("<h2 style=\"color:brown\">Dato n°22 "+alumno[22]+"</h2>");
  
            conector.insertar(alumno[0],alumno[1],alumno[2],alumno[3],alumno[4],alumno[5],alumno[6],alumno[7],alumno[8],alumno[9],alumno[10],alumno[11],alumno[12],alumno[13],alumno[14],alumno[15],alumno[16],alumno[17],alumno[18],alumno[19],alumno[20],alumno[21],alumno[22],alumno[23]);
            out.println("<h2 style=\"color:brown\">Obrasocial: "+alumno[10]+"</h2>");
            out.println("<img src='https://media.tenor.com/images/be2fb8bdbd649cf6d57844340167cbdb/tenor.gif'>");
            
            out.println("</body>");
            out.println("</html>");
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
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
