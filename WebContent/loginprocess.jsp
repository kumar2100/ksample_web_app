
<%@page import="bean.LoginDao"%>
<jsp:useBean id="obj" class="bean.LoginBean"/>

<jsp:setProperty property="*" name="obj"/>

<%
boolean status=LoginDao.validate(obj);
if(status){
out.println("<h3> You Are successfully logged in </h3>");

out.println("<br>");
out.println("<h4>Good Quotes</h4>");
out.println("<img src='./images/life_is.jpg' />");
out.println("<h4><a href='index.jsp'>Logout to Application</a></h4>");

session.setAttribute("session","TRUE");
}
else
{
out.print("Sorry, email or password error");
%>
<jsp:include page="index.jsp"></jsp:include>
<%
}
%>