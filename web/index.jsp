<%--
  Created by IntelliJ IDEA.
  User: duanda
  Date: 11/20/15
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>Hello dude!</title>
  </head>
  <body>
    <h1>Staff Square</h1>
    <table>
	    <tr><td>Name:</td><td><input type="text" name="name"></td></tr>
	    <tr><td>Password:</td><td><input type="text" name="password"></td></tr>
    </table>
    <input type="submit" value="Login">

	<s:form action="employeeAction">
		<s:submit />
	</s:form>
  </body>
</html>
