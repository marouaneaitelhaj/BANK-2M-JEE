package com.bank.bank2mjee.Servlets;

import com.bank.bank2mjee.Dao.ClientDao;
import com.bank.bank2mjee.Dao.Impl.ClientDaoImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "ClientServlet", urlPatterns = {"/clients","/clientAdd", "/clientDelete"})
public class ClientServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getRequestURI()) {
            case "/client":
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}