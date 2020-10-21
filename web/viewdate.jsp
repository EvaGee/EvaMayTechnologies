<%-- 
    Document   : viewdate
    Created on : Jul 10, 2020, 11:40:21 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            
             String startDate=request.getParameter("startDate");
             String endDate=request.getParameter("endDate");
             String days=request.getParameter("days");
             
             
             
             %>
        <h1>Hello World!</h1>
        <input type="date" id="startDate" value="<%=startDate%>"  >
        <input  id="endDate" value="<%=endDate%>" >
        <input type="number" id="days" value="<%=days%>" >
        
       <!-- <img id="image1" src="images/logo.png"> -->
    </body>
    <script> 
        document.getElementById("startDate").addEventListener("change", function(){
            var startDate=document.getElementById("startDate").value;
            var days=document.getElementById("days").value;
            var date1=new Date(startDate);

var diff=days*(1000*3600*24);
var diff2=date1.getTime()+diff;
var date2=new Date(diff2);
document.getElementById("endDate").value= date2;

document.write("date1:" +date1+ "date2:" +startDate+ "Days:" +days); 
        });
</script>
<script>
    document.getElementById("image1").src="images/office.jpg";
</script>
</html>
