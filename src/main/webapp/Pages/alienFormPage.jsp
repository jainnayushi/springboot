<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>

<html>
<head><title>Learn Springboot</title></head>
<body>
  <!-- <form action="addAlien"> -->
  <form action="addAlienToDB">
    <label for="aid">Enter id</label><br>
    <input type="text" name="aid"><br>

    <label for="aname">Enter name</label><br>
    <input type="text" name="aname"><br>

    <label for="lang">Enter language</label><br>
    <input type="text" name="lang"><br><br>

    <input type="submit">
  </form>

  <h1> Fetch data </h1>

  <form action="fetchData">
      <label for="aid">Enter id</label><br>
      <input type="text" name="aid"><br>

      <input type="submit" value="Search">
    </form>
</body>
</html>