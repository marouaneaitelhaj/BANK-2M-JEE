package com.bank.bank2mjee.Servlets;

import com.bank.bank2mjee.Dao.AgenceDao;
import com.bank.bank2mjee.Dao.ClientDao;
import com.bank.bank2mjee.Dao.DemandeDeCreditDao;
import com.bank.bank2mjee.Dao.Impl.AgenceDaoImpl;
import com.bank.bank2mjee.Dao.Impl.ClientDaoImpl;
import com.bank.bank2mjee.Dao.Impl.DemandeDeCreditDaoImpl;
import com.bank.bank2mjee.Entities.Agence;
import com.bank.bank2mjee.Entities.Client;
import com.bank.bank2mjee.Entities.DemandeDeCredit;
import com.bank.bank2mjee.Enums.CreditEtat;
import com.bank.bank2mjee.Services.SimulationService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = {"/credit/create", "/credit/update", "/credit/create/step2", "/credit/create/step3", "/credit/create/finish"})
public class CreditServlet extends HttpServlet {
    AgenceDao agenceDao = new AgenceDaoImpl();
    ClientDao clientDao = new ClientDaoImpl();
    DemandeDeCreditDao demandeDeCreditDao = new DemandeDeCreditDaoImpl();
    SimulationService simulationService = new SimulationService(clientDao, agenceDao, demandeDeCreditDao);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        switch (req.getRequestURI()) {
            case "/credit/create":
                this.create(req,resp);
                break;
            case "/credit/create/step2":
                this.step2(req, resp);
                break;
            case "/credit/create/step3":
                this.step3(req, resp);
                break;
            case "/credit/create/finish":
                this.addDemande(req, resp);
                break;
            case "/credit/update":
                break;
        }
    }

    private void addDemande(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        DemandeDeCredit credit = new DemandeDeCredit();
        credit.setCreditEtat(CreditEtat.EN_ATTENTE);
        credit.setDate(LocalDate.now());
        System.out.printf("******************" + session.getAttribute("duree"));
        credit.setDuree(Integer.parseInt(session.getAttribute("duree").toString()));
        credit.setMontant(Double.parseDouble(session.getAttribute("montant").toString()));
        credit.setClient(new Client(session.getAttribute("client").toString()));
        credit.setAgence(new Agence("QLKJSyids"));
        credit.setRemarques("lsdkjksljd qslkjdlkqjsd qsdlkqjsdkljqsd qsldkjqlksjd dqlksjdklqsd");
        Optional<DemandeDeCredit> demandeDeCredit = simulationService.addDemande(credit);
    }

    private void step3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("client", req.getParameter("client"));
        req.setAttribute("step", 3);
        Client client = new Client();
        try {
            client = simulationService.findOne(req.getParameter("client"));
        } catch (Exception e) {

        }
        System.out.printf(client.getFirstName());
        req.setAttribute("client", client);
        req.getRequestDispatcher("/Views/Credit/simulation.jsp").forward(req, resp);
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
        HttpSession session = req.getSession();
        String mensualite = (req.getParameter("mensualite") != null) ? req.getParameter("mensualite") : session.getAttribute("mensualite").toString();
        String project = (req.getParameter("project") != null) ? req.getParameter("project") : session.getAttribute("project").toString();
        String travail = (req.getParameter("travail") != null) ? req.getParameter("travail") : session.getAttribute("travail").toString();
        String montant = (req.getParameter("montant") != null) ? req.getParameter("montant") : session.getAttribute("montant").toString();
        String duree = (req.getParameter("duree") != null) ? req.getParameter("duree") : session.getAttribute("duree").toString();
        if (mensualite == null || mensualite.equals("0.00")) {
            resp.sendRedirect("/credit/create");
            return;
        }
        List<Client> clientList;
        if (req.getParameter("clientSearch") != null) {
            clientList = simulationService.findAllClientByText(req.getParameter("clientSearch"));
        } else {
            clientList = simulationService.findAllClient();
        }
        req.setAttribute("clients", clientList);
        req.setAttribute("step", 2);
        session.setAttribute("project", project);
        session.setAttribute("travail", travail);
        session.setAttribute("montant", montant);
        session.setAttribute("mensualite", mensualite);
        session.setAttribute("duree", duree);
        req.getRequestDispatcher("/Views/Credit/simulation.jsp").forward(req, resp);
    }

}
