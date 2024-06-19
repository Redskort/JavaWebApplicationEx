<!DOCTYPE html>
<html>
<head>
    <title>Formulario JSP</title>
</head>
<body>
   <h1 style='margin-left:35px; color:green;'>Indicanos tus datos</h1>
   <form action="/myServlet2" method="GET">
     <ul style='list-style:none'>
        <li>
          <label for='name'>Nombre:</label><br>
          <input type='text' id='name' name='nombre' autocomplete='off'>
        </li><br><br>
        <li>
          <label for='mail'>Email:</label><br>
          <input type='text' id='mail' name='mail' autocomplete='off'>
        </li>
     </ul><br><br>
     <button type='submit' style='color:red; width:80px; height:80px; border-radius:50%;'>Enviar</button>
   </form>
</body>
</html>