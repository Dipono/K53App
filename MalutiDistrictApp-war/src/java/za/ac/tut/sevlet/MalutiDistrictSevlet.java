//Group 30
//216755634
//218426263

package za.ac.tut.sevlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.question.Answer;
import za.ac.tut.question.PossibleAnswer;
import za.ac.tut.question.Question;
import za.ac.tut.session.QuestionBean;

/**
 *
 * @author LEBUTE
 */
@WebServlet(name = "MalutiDistrictSevlet", urlPatterns = {"/MalutiDistrictSevlet"})
public class MalutiDistrictSevlet extends HttpServlet {

    @EJB
    QuestionBean questionBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String decision = request.getParameter("choose");
        String theQuestion, signGroup, correctAnswer, possibleAnswer2, possibleAnswer1, possibleAnswer3, possibleAnswer4;
        theQuestion = request.getParameter("question");
        signGroup = request.getParameter("signGroup");
        correctAnswer = request.getParameter("correctAnswer");
        possibleAnswer2 = request.getParameter("possibleAnswer2");
        possibleAnswer3 = request.getParameter("possibleAnswer3");
        possibleAnswer4 = request.getParameter("possibleAnswer4");
        possibleAnswer1 = request.getParameter("possibleAnswer1");
        
        Question question = new Question();
        question.setQuestionID(0);
        
        //PossibleAnswer possibleAnswer = new PossibleAnswer(0, question.getQuestionID(), possibleAnswer1);
        //Answer answer = new Answer(0, question.getQuestionID(), correctAnswer);
        /*try (PrintWriter out = response.getWriter()) {
            out.print(question.getQuestionID()+"<br>");
            out.println(theQuestion+" "+ signGroup+" "+ correctAnswer+" "+ possibleAnswer2+" "+ possibleAnswer1+" "+ possibleAnswer3+" "+ possibleAnswer4);
        }*/
        //question.setQuestion(theQuestion, signGroup, 1, false, possibleAnswer, answer);
//Question question = new PossibleAnswer(0, 0, possibleAnswer1, possibleAnswer2, possibleAnswer3, possibleAnswer4);

        if (decision.equals("insert")) {
            questionBean.insert(question);
            request.getRequestDispatcher("index.html").forward(request, response);
        } else if(decision.equals("view")) {
            //request.getRequestDispatcher("view.jsp").forward(request, response);
        }
        /*try (PrintWriter out = response.getWriter()) {
            out.print(poss+"<br>");
            out.println(theQuestion+" "+ signGroup+" "+ correctAnswer+" "+ possibleAnswer2+" "+ possibleAnswer1+" "+ possibleAnswer3+" "+ possibleAnswer4);
        }*/
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
