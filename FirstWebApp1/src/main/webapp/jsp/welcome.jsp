<html>
<body>
<h3>Login successful!!!</h3>
<h2>Hello  <%= (String)request.getAttribute("username") %></h2>
  <form action="Welcome" method="POST">
  <input type="submit" value="Add new task">
  </form>
</body>
</html>
