<%@ page import="com.example.implementacionpaguinaweb.ExtraerNombresServlet" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>LISTA DE ASISTENCIA</title>
    <link rel="stylesheet" type="text/css" href="estilos.css">
  r
</head>
<body>
<h1>LISTA DE ASISTENCA</h1>

<form action="ExtraerNombresServlet" method="post">
    <%-- Ejemplo de nombres de opciones --%>
    <%
        List<String> nombresOpciones = ExtraerNombresServlet.enviarListaNombres();
        for (String opcion : nombresOpciones) {
    %>
    <input type="checkbox" name="opciones" value="<%= opcion %>">
    <%= opcion %><br>
    <% } %>

    <input type="submit" value="Enviar">
</form>
</body>
</html>
