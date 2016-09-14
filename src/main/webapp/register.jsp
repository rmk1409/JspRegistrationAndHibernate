<%@ page session="true" language="java" %>
<%@ page import="models.UserDao" %><%--
  Created by IntelliJ IDEA.
  User: r.pogorelov
  Date: 14.09.2016
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="obj" class="domain.User"/>
<jsp:setProperty name="obj" property="*"/>

<%
    int status = UserDao.add(obj);

    if (status > 0){
        out.print("You are registered successfully!");
    }
%>
