<%@ page import="com.demo.utils.PropertyUtils" %>
<%
    String info = PropertyUtils.getProperty("mysql.host");
%>
<html>
<body>
<h2>Hello World!x three edition</h2>
<h3>
    <%=info%>
</h3>
</body>
</html>
