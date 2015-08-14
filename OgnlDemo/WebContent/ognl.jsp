<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
String Array 0 Value <s:property value="stringArray[0]"/> <br>
String Array  <s:property value="stringArray"/> <br>
String Array Length <s:property value="stringArray.length"/> <br>
ArrayList 0th <s:property value="names[0]"/> <br>
ArrayList All <s:property value="names"/> <br>
ArrayList Size <s:property value="names.size"/> <br>

Map Size <s:property value="tempMap.size"/> <br>
Delhi Temp <s:property value="tempMap['Delhi']"/> <br>

User Object <s:property value="user.userName"/> <br>
User List 1st Index Object <s:property value="userList[1].userName"/> <br>
Calling Method  <s:property value="sayHello()"/> <br>
Accessing the Session Object  <s:property value="#session.username"/> <br>
Another Way to Accessing the Session Object  <s:property value="#session['username']"/> <br>

</body>
</html>