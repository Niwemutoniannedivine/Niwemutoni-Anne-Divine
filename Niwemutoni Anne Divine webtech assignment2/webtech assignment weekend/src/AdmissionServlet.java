import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdmissionServlet")
public class AdmissionServlet extends HttpServlet {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (authenticate(username, password)) {
            String studentName = request.getParameter("studentName");
            String course = request.getParameter("course");

            response.getWriter().write("Admission Preview:\nStudent Name: " + studentName + "\nCourse: " + course);
        } else {
            response.getWriter().write("Authentication failed. Please check your username and password.");
        }
    }

    private boolean authenticate(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}
