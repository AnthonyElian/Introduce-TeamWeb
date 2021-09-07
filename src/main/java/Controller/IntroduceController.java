package Controller;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Introduce", value = "/hellp")

public class IntroduceController {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/index.jsp");
        try {
            RequetsDispatcherObj.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
