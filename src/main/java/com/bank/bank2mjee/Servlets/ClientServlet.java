package com.bank.bank2mjee.Servlets;

import com.bank.bank2mjee.Dao.ClientDao;
import com.bank.bank2mjee.Dao.Impl.ClientDaoImpl;
import com.bank.bank2mjee.Entities.Client;
import com.bank.bank2mjee.Services.ClientService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

@WebServlet(name = "ClientServlet", urlPatterns = {"/clients","/clientAdd", "/clientDelete"})
public class ClientServlet extends HttpServlet {
    ClientDao clientDao = new ClientDaoImpl();
    ClientService clientService = new ClientService(clientDao);
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getRequestURI()) {
            case "/clients":
                break;
            case "/clientAdd":
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getRequestURI()) {
            case "/clientAdd":
                addClient(request, response);
                break;
        }
    }
    protected void addClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        LocalDate birthDate = LocalDate.parse(request.getParameter("birthDate"));
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        Client client = new Client(firstName, lastName, birthDate, mobile, code, address);
        Optional<Client> optionalClient = clientService.addClient(client);
        String message = null;
        if (optionalClient.isPresent()) {
            message = "Client Inserted Successfuly";
        } else {
            message = "Client Not Inserted";
        }
        request.setAttribute("message", message);
//        getClients(request, response);
    }
}