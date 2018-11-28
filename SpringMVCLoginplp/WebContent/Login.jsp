<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

        <title>Login</title>
        <script type="text/javascript">
        
        function check() {
        	if(document.login.username.value=="")
        	{alert("Please fill Username !!"); return false;}
        	else if(document.login.password.value=="")
        	{alert("Please fill Password !!"); return false;}
        	else
        		return true;
			
		}
        
        </script>

    </head>

    <body>

        <form:form id="loginForm" name="login" method="post" action="welcome" modelAttribute="my" onsubmit="return check()">

 

            <form:label path="username">Enter your user-name</form:label>

            <form:input id="username" name="username" path="username" /><br>

            <form:label path="username">Please enter your password</form:label>

            <form:password id="password" name="password" path="password" pattern="[A-Za-z0-9@_#*]{8,20}" title="Password must contain 8 characters" /><br>

            <input type="submit" value="Login" />

        </form:form>

    </body>

</html>
