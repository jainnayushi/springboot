<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>

<html>
<head><title>Learn Springboot</title></head>
<body>
  <h1>Home Page</h1><br>
  <!--Show data from Client via Controller -->
  <!--Single obj-->
  <h2>Welcome ${obj.aid} ${obj.aname} ${obj.lang} </h2>
  <!--Different fields-->
  <h2>Hello ${alien_id} ${alien_name} ${alien_lang} </h2>

</body>
</html>