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
<s:form action="regAction" method="post">
<s:textfield name="userid" label="UserId"/>
<s:password name="password" label="password"/>
<s:textarea name="address" label="Address" cols="20" rows="3" wrap="true"></s:textarea>
<s:checkbox name="recieveUpdates" fieldValue="Active"  label="Check to Recieve Updated"></s:checkbox>
<s:select list="{'Programmer','Tester','Manager'}" name="designation" label="Designation"></s:select>
<s:select list="countryList" headerValue="Select Country" headerKey="-1" name="country" label="Country" ></s:select>  
 <s:checkboxlist list="{'Sports','Reading','Travel'}" name="hobbies" label="Hobbies"></s:checkboxlist> 
 <s:radio list="#{'Y':'Yes','N':'No' }" name="accept" label="Accept the GuideLine"></s:radio>
<s:radio list="languageList" name="language" label="Language" listKey="code" listValue="name"></s:radio>
<s:submit></s:submit>
</s:form>
</body>
</html>