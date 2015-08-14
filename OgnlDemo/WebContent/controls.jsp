<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
<s:if test="user.userName.equalsIgnoreCase('amit') && user.userid==1001">
Welcome <s:property value='user.userName'/>
</s:if>
<s:else>
Hello <s:property value='user.userName'/>

</s:else>

<br>
Looping
<br>
<table  class="table table-striped table-bordered table-responsive">

<tr><th>S.no</th><th>UserName</th><th>Userid</th></tr>
<s:iterator value="userList" var="userObject" status="x">
<%-- <s:if test="#x.odd==true">
<tr style="background-color: cyan;"> --%>
<td><s:property value="#x.count"/></td>
<td><s:property value="#userObject.userName"/></td> 
<td><s:property value="#userObject.userid"/></td>
</tr>
<%-- </s:if>
<s:else>
<tr style="background-color: yellow;">
<td><s:property value="#x.count"/></td>
<td><s:property value="#userObject.userName"/></td> 
<td><s:property value="#userObject.userid"/></td>
</tr>

</s:else>
 --%></s:iterator>
</table>
</body>
</html>