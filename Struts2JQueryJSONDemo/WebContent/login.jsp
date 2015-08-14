<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<!-- <script>
$(document).ready(function(){
	$("p").click(function(){
	$(this).hide(2000);
	});
});

</script> -->
<script>
function makeAjaxCall(){
	var uid = $("#userid").val();
	var password = $("#password").val();
	var json = {"userid":uid,"password":password};
	$.ajax({
		url:"loginAC"+"?jsonString="+JSON.stringify(json),
		type:"POST",
		dataType:"json",
		success:function(response){
			$("#loginDiv").hide(2000);
			$("h1").html(response.message);
		},
		error:function(pr,textStatus){
			alert("Error "+textStatus);
		}
		});
}

</script>
</head>
<body>
<div class="container">
<h1></h1>
<div class="row">
<div class="col-sm-4">
<div id ="loginDiv">
<%-- <s:form  method="post"> --%>
<div class="form-group">
<label for="userid">Userid</label>
<s:textfield id="userid" cssClass="form-control" />
</div>
<div class="form-group">
<label for="password">Password</label>
<s:password id="password" cssClass="form-control" />
</div>
<div class="form-group">
<s:submit type="button" cssClass="btn btn-primary" label="Login" onclick="makeAjaxCall();return false;"></s:submit>
</div>
<%-- </s:form> --%>
</div>


<!-- <p>Hello</p>
<p>Bye</p> -->
</div>
</div>
</div>
</body>
</html>