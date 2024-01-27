<html>
  <body>
    
    <%@ page import="java.util.Date" %> <!-- directivas -->

    <!-- Scriplets -->
    <% 
        // Objetos implícitos 
        // put -> PrintWriter (salida html que deseo escribir)
        // request -> HttpServletRequest (request)
        // response -> HttpServletResponse (response)
        // session -> HttpSession (session)
        // config -> configuración del servlet
        // page context -> contecto de memoria limitado a la página
        // page -> clase compilada 
        // exception -> excepción que se ha producido
        out.println(new Date());
        String nombreValue = "Alejandra";
        session.setAttribute("nombre", nombreValue);
    %>

    <br/>
    <!-- Expresiones -->
    <%= new Date() %>

  </body>
</html>
