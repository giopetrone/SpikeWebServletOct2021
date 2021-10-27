package com.example.spikewebservletoct2021;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletController", value = "/ServletController")
public class ServletController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); // per essere robusti rispetto a caratteri speciali (', etc)
        ServletContext ctx = getServletContext();
        String action = request.getParameter("action");
        RequestDispatcher rd = ctx.getRequestDispatcher("/index.jsp");
        if (action!=null) {
            if (action.equals("home"))
                rd = ctx.getRequestDispatcher("/home.html");
            else if (action.equals("pageA")) {
                String m = "messaggio da visualizzare";
                request.setAttribute("msg", m);
                rd = ctx.getRequestDispatcher("/A.jsp");
            }
            else if (action.equals("pageB"))
                rd = ctx.getRequestDispatcher("/B.html");
        }
        rd.forward(request, response);
    }
}
