<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>

<html>
<head><title>Learn Springboot</title></head>
<body>
  <h1>Home Page</h1><br>

  <h2>Fetched data by Id : ${dev.devId} - ${dev.devName} - ${dev.devTech} </h2>
  <h2>Fetched data for Greater Than Id : ${devList} </h2>
  <h2>Fetched data by Tech: ${dev_tech.devId} - ${dev_tech.devName} - ${dev_tech.devTech} </h2>
  <h2>Fetched data by Tech - Sorted by Name: ${dev_techSorted} </h2>

</body>
</html>