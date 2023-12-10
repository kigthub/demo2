package org.example.web;

import lombok.SneakyThrows;
import org.example.pojo.Road;
import org.example.service.RoadService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
    private final RoadService service = new RoadService();


    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        Integer id = Integer.valueOf(request.getParameter("id"));
        Integer money = Integer.valueOf(request.getParameter("money"));
        Integer roadHaul = Integer.valueOf(request.getParameter("roadHaul"));

        Road road = new Road();
        road.setId(id);
        road.setMoney(money);
        road.setRoadHaul(roadHaul);

        service.update(road);

        request.getRequestDispatcher("/selectAllServlet").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}