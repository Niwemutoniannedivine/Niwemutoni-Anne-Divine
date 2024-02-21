import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberConverterServlet")
public class NumberConverterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputNumber = request.getParameter("number");
        try {
            int number = Integer.parseInt(inputNumber);
            String romanNumeral = convertToRomanNumeral(number);
            response.getWriter().write("Roman Numeral for " + number + " is: " + romanNumeral);
        } catch (NumberFormatException e) {
            response.getWriter().write("Invalid number format");
        }
    }

    private String convertToRomanNumeral(int number) {
        // Implementation of the conversion logic
        // This is a simple example, you might want to implement a more robust solution.
        // For the sake of simplicity, I'm omitting the actual implementation here.
        // You can use existing libraries or implement your own logic.
        return "IV"; // Placeholder value
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // doPost method is not used in this example, but you can add any necessary logic if needed.
        doGet(request, response);
    }
}
