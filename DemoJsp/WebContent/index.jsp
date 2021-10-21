<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>jsp demo</title>
</head>
<body>
<%!
int x=10;
Integer hitCount=null;
boolean authenticate(){
	System.out.println("Authenticating");
	return true;
}
public int divide(int a, int b){
	return a/b;
	
}

%>
<h1>welcome to demo</h1>
<%
	/* String flag=null;
	if(session) */
	pageContext.setAttribute("General Info","This is a Webpage to show about page context",PageContext.APPLICATION_SCOPE);
	String flag=null;
	if(session.getAttribute("isUserLoggedIn")!=null)
		flag=(String)session.getAttribute("isUserLoggedIn");
	if(flag!=null && flag.equals(true)) {
		hitCount=(Integer) application.getAttribute("hitCount");
		System.out.println("hitcount:" + hitcount);
	
	if(hitcount==null||hitcount==0)
		out.println("welcome to the world of jsp");
		hitcount=1;
	}
	else{
		hitcount++;
		out.println("welcome back to the world of jsp.You r visitor no." +hitcount);
	}
	
	application.setAttribute("hitcount",hitcount);
	}
	//out.println(authenticate());
	else {
		finally{
		System.out.println("Forwarding to login page");
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
	}
	
%>


</body>
</html>