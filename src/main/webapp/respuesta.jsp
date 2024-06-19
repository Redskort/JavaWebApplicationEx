<!DOCTYPE html>
<head>
   <title>Respuesta JSP</title>
</head>
<body>
  <%
        String nombre = request.getParameter("nombre");
  		String mail = request.getParameter("mail");
  %>
   <h1>Bienvenido: &#160 <% out.print(nombre); %></h1>
   <br>
   <p> Te enviaremos toda la informacion a: &#160 <% out.print(mail); %></p>

</body>
</html>