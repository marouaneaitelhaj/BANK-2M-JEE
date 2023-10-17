package com.bank.bank2mjee.Servlets;

import com.bank.bank2mjee.Dao.AgenceDao;
import com.bank.bank2mjee.Dao.ClientDao;
import com.bank.bank2mjee.Dao.Impl.AgenceDaoImpl;
import com.bank.bank2mjee.Dao.Impl.ClientDaoImpl;
import com.bank.bank2mjee.Services.SimulationService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/credit/create", "/credit/update", "/credit/create/step2"})
public class CreditServlet extends HttpServlet {
    //AgenceDao agenceDao = new AgenceDaoImpl();
    //ClientDao clientDao = new ClientDaoImpl();
    //SimulationService simulationService = new  SimulationService(clientDao);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        switch (req.getRequestURI()) {
            case "/credit/create":
                this.create(req,resp);
                break;
            case "/credit/update":
                break;
            case "/credit/create/step2":
                this.step2(req, resp);
                break;
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
    private void create(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("step", 1);
        req.getRequestDispatcher("/Views/Credit/simulation.jsp").forward(req,resp);
    }

    private void step2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setAttribute("agences", simulationService.findAllAgence());
        //req.setAttribute("clients", simulationService.findAllClient());
        req.setAttribute("step", 2);
        req.setAttribute("project", req.getParameter("project"));
        req.setAttribute("travail", req.getParameter("travail"));
        req.setAttribute("montant", req.getParameter("montant"));
        String mensualite = req.getParameter("mensualite");
        if (mensualite.equals("0.00")) {
            req.getRequestDispatcher("/Views/Credit/simulation.jsp").forward(req,resp);
        }
        req.setAttribute("mensualite", req.getParameter("mensualite"));
        req.setAttribute("duree", req.getParameter("duree"));
        req.getRequestDispatcher("/Views/Credit/simulation.jsp").forward(req, resp);
    }

}
