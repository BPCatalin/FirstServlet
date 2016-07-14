<html>
<body>
<h3>Task added successful!!!</h3>
<h2>Task <%= (String)request.getAttribute("Name") %> added successful</h2>
  <form action="Welcome" method="POST">
  <input type="submit" value="Add new task">
  </form>
</body>
</html>
