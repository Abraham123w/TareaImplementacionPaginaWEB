package com.example.implementacionpaguinaweb;

import data.AlumnoDAO;
import data.AsistenciaDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "ExtraerNombresServlet", urlPatterns = "/ExtraerNombresServlet")


public class ExtraerNombresServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String[] nombresAlumnos = request.getParameterValues("opciones");
        RequestDispatcher respuesta1 = request.getRequestDispatcher("/ListaGuardada.jsp");
        RequestDispatcher respuesta2 = request.getRequestDispatcher("/errorGuardarLista.jsp");
        // Realiza las operaciones necesarias con los nombres seleccionados
        if (nombresAlumnos != null) {
            AsistenciaDAO.guardarNombresEnArchivo(List.of(nombresAlumnos));

            respuesta1.forward(request, response);
        } else {
            respuesta2.forward(request, response);
        }

        // Redirecciona o envía la respuesta según lo necesario
        // ...
    }


    public static List<String> enviarListaNombres() throws IOException {


        List<String> nombres = new ArrayList<>();

      nombres=  AlumnoDAO.extraerNombresDesdeArchivo();
        return nombres;
    }

}
