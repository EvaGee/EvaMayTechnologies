<%-- 
    Document   : fetch
    Created on : Jul 16, 2020, 12:10:33 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%  
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "employee";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
try{
String staffId=request.getParameter("staffId");
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select FirstName from staff where StaffId='+staffId+'";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){
String firstName=resultSet.getString("firstName");
i++;
out.println(firstName);
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>



