<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Userid <s:property value="userid"/> <br>
Password <s:property value="password"/> <br>
Address <s:property value="address"/> <br>
RecieveUpdates <s:property value="recieveUpdates"/> <br>
Designation <s:property value="designation"/> <br>
Hobby <s:property value ="hobbies"/><br>
Accept <s:property value ="accept"/><br>
Country <s:property value ="country"/><br>
Language <s:property value ="language"/><br>
</body>
</html>