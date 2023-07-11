<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>

<html>
<head><title>Learn Springboot</title></head>
<body>
  <h1> Fetch data </h1>

  <form action="fetchDevDataById">
      <label for="devId">Enter Id</label><br>
      <input type="text" name="devId"><br>

      <input type="submit" value="Search by Id">
    </form>
    <br>
    <form action="fetchDevDataByDevIdGreaterThan">
      <label for="devId">Enter Id</label><br>
      <input type="text" name="devId"><br>

      <input type="submit" value="Search for Greater Than Id">
    </form>
    <br>
    <form action="fetchDevDataByTech">
      <label for="devTech">Enter Id</label><br>
      <input type="text" name="devTech"><br>

      <input type="submit" value="Search by Tech">
    </form>
    <br>
    <form action="fetchDevDataByQuery">
      <label for="devTech">Enter Id</label><br>
            <input type="text" name="devTech"><br>

            <input type="submit" value="Search by Tech - Sorted by Name">
    </form>
    <br>

</body>
</html>