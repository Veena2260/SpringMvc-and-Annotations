<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
p{color:yellow}
h2{color:blue}
</style>
</head>
<body>
<%=pageContext.getAttribute("General Info",PageContext.APPLICATION_SCOPE) %>
<%	//java code

	String userName=request.getParameter("userName");
	//request implicit object
	String password=request.getParameter("pwd");
	String driverName=application.getInitParameter("driverName");
	System.out.println("Loading driver:  "+ driverName);
	int hitCount=0;
	if(application.getAttribute("hitCount")!=null){
	
	hitCount=(Integer)application.getAttribute("hitCount");
	}
	out.println("you r visitor" + hitCount);
			//out.println("Hello "+userName);
	
%>

<!-- for styles -->
<p> Jsp Expressions: <%=userName %> </p>
<%-- <h2> Hi <%=userName %>,you are visiting <% hiCount %>times.</h2> --%>
<h2>Scriplet: <%out.println(userName); %></h2>

<form action="logout.jsp">
<input type="submit" value="LogOut"/>
</form>
</body>
</html>