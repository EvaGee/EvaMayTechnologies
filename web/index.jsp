<%-- 
    Document   : index
    Created on : Jul 16, 2020, 12:09:34 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<div style="margin: auto;width:30%;padding-top:50px">
<form id="form1" name="form1" method="post">
<div class="form-group">
<input type="text" class="form-control" placeholder= 'Search by staffId...' id="staffId"><br>
<p align="center"><button type="submit" class="btn btn-primary btn-default" id="search">Submit</button></p><br>
<label for="firstName">Display First name of employee:</label>
<input type="text" class="form-control" placeholder= 'First name' id="firstName"><br><br>
</div>
</form>
</div>
<script>
$("#search").click(function() {
var staffId= $('#staffId').val();
firstName.value = firstName;
$.ajax({
url: "fetch.jsp",
type: 'POST',
data: {staffId: staffId},
success: function(data) {
$('#firstName').val(data);
alert(data);
var firstName = data;
}
});
});
</script>
</body>
</html>
