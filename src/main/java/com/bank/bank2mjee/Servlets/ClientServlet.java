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
import java.util.List;
import java.util.Optional;

@WebServlet(name = "ClientServlet", urlPatterns = {"/clients", "/client", "/clientAdd", "/clientDelete", "/clientUpdate"})
public class ClientServlet extends HttpServlet {
    ClientDao clientDao = new ClientDaoImpl();
    ClientService clientService = new ClientService(clientDao);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getRequestURI()) {
            case "/clients":
                getClients(request, response);
                break;
            case "/client":
                getClients(request, response);
                break;
            case "/client1":
                getClients(request, response);
                break;
            default:
                getClients(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getRequestURI()) {
            case "/client":
                getClient(request, response);
                break;
            case "/clientAdd":
                addClient(request, response);
                break;
            case "/clientDelete":
                deleteClient(request, response);
                break;
            case "/clientUpdate":
                updateClient(request, response);
                break;
            default:
                getClients(request, response);
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
        getClients(request, response);
    }

    protected void getClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        Optional<Client> optionalClient = clientService.getClient(code);
        if (optionalClient.isPresent())
            request.setAttribute("client", optionalClient.get());
        request.getRequestDispatcher("/Views/Client/client.jsp").forward(request, response);
    }

    protected void getClients(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Client> clients = clientService.getClients();
        request.setAttribute("clients", clients);
        request.getRequestDispatcher("/Views/Client/client.jsp").forward(request, response);
    }

    private void deleteClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        Integer res = clientService.deleteClient(code);
        String message = null;
        if (res != 0) {
            message = "Client Deleted Successfuly";
        } else {
            message = "Client Not Deleted";
        }
        request.setAttribute("message", message);
        getClients(request, response);
    }

    private void updateClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        LocalDate birthDate = LocalDate.parse(request.getParameter("birthDate"));
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        Client client = new Client(firstName, lastName, birthDate, mobile, code, address);
        Optional<Client> optionalClient = clientService.updateClient(client, code);
        String message = null;
        if (optionalClient.isPresent()) {
            message = "Client Updated Successfuly";
        } else {
            message = "Client Not Updated ";
        }
        request.setAttribute("message", message);
        getClients(request, response);
    }

}