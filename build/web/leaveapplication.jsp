<%-- 
    Document   : newlogin
    Created on : Mar 2, 2020, 6:59:08 PM
    Author     : Eva
--%>

<%@page import="org.evamay.business.Staff"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
    <head>
	<title>EvaMay Technologies</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">	
	<link rel="icon" type="image/png" href="images/logo2.png"/>
	
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
        <script src="js/jquery-3.5.1.js"></script>
        <script src="js/jquery-ui.js"></script>

            <style>
.hide {
  display: none
}
</style>
    </head>

    <body>
        
	<div class="limiter">
            <div class="container-login100" style="background-image: url('images/office2.jpg');">
		<div class="wrap-login100">
                    <form class="login100-form validate-form" method="post" action="ApplyLeaveServlet" name="login_form" id="login_form">
			<span class="login100-form-logo">
                            <img src='images/logo2.png' alt='logo' width="200%" height="100%">
			</span>
                        <span class="login100-form-title p-b-34 p-t-27">
                            Leave application
			</span>
                        
                        <div class="login100-form">
                         <input type="hidden" name="staffId" id="staffId" value="${staff.staffId}">
                         <input type="hidden" name="status" id="status" value="pending">  
                         <input type="hidden" name="remainingDays" id="remainingDays" value="10">
                         <input type="hidden" name="gender" id="gender" value="${staff.gender}">
                        </div> 
                        <%
            Staff staff=(Staff)session.getAttribute("staff");
            String gender=staff.getGender();
            String gender1="Male";
            System.out.println(staff.getGender());
            System.out.println(gender);
            System.out.println(gender1);
            if(gender.equals(gender1)){
            %>
			<div class="login100-form">
                            <label for="leaveType">Leave Type:</label>
                            <select class="input100" id="leaveType" name="leaveType">
                                <option>Annual</option>
                                <option>Sick</option>
                                <option>Paternity</option>
                                <option>Others</option>
                            </select>
                        </div>
            <%
            }else{
              %> 
              <div class="login100-form">
                  
                            <label for="leaveType">Leave Type:</label>
                            <select class="input100" id="leaveType" name="leaveType">
                                <option>Annual</option>
                                <option>Sick</option>
                                <option>Maternity</option>
                                <option>Others</option>
                            </select>
                        </div>
               <%
            }
              %>  
                        <div class="login100-form">
                          <label for="days">No of days</label>
                          <input type="number" class="input100" name="days" id="days" max="21" min="0" required >
                        </div>
                       
                        
                        <div class="login100-form">
                          <label for="startDate">Start Date:</label>
                          <input type="date" class="input100" name="startDate" id="startDate" placeholder="Start Date" required>
                        </div> 
                        
                        <div class="login100-form">
                          <label for="endDate">End Date:</label>
                          <input class="input100" name="endDate" id="endDate" placeholder="End Date" readonly required>
                        </div>
                        <br>
                        <center>
                              <button type="submit" class="login100-form-btn">Apply</button>
                        </center>
                    </form>
                        <br>
                        <center>
                            <a href="home.jsp">
                                <button type="submit" class="login100-form-btn">Cancel Application</button>
                            </a>
                        </center>
                </div>
        
            </div>
        </div>
<!--Ensure startDate is not a weekend or a Holiday-->
<script>
      const picker=document.getElementById('startDate');
       picker.addEventListener('input', function(e){
           var hol=[new Date('06/01/2021 03:00:00').getTime(),
               new Date('01/01/2021 03:00:00').getTime(),
               new Date('05/01/2021 03:00:00').getTime(),
               new Date('10/10/2021 03:00:00').getTime(),
               new Date('12/12/2020 03:00:00').getTime(),
               new Date('10/20/2020 03:00:00').getTime(),
               new Date('12/25/2020 03:00:00').getTime(),
               new Date('12/26/2020 03:00:00').getTime()];
           var date=new Date(this.value).getTime();
           for(i=0; i<hol.length; i++){
                if(hol[i]===date){
                   e.preventDefault();
                   this.value='';
                alert('You can not start your Leave on a Holiday!!!');
            console.log(hol[i]);
            console.log(i);
            console.log(date);
               }
           }           
    
       })
||
       picker.addEventListener('input', function(e){
           var day=new Date(this.value).getUTCDay();
           if([6,0].includes(day)){                 //Day 0 represents Sunday && day 6 represents Saturday
               e.preventDefault();
               this.value='';
               alert('You can not start your Leave on a Weekend!!!');
           }       

       })
||
       picker.addEventListener('input', function(e){
           var date1=new Date(this.value).getTime();
           var date2=new Date().getTime();      //Today's date
           if(date1<date2){                 
               e.preventDefault();
               this.value='';
               alert('You cannot choose a past date!!!');
           }       

       });           
</script>



<!--<script>
Jquery disable dates on datePicker
    var hol=["2020-07-31", "2020-08-05"];
       $("#startDate").datepicker({
           beforeShowDay: function(date){
               var datestring=jQuery.datepicker.formatDate('yy-mm-dd', date);
               return[hol.indexOf(datestring)===-1];
           }
       });
    </script>--> 
    
 <!--Set Days for LeaveType, maternity is 90 days, paternity is 2weeks-->                             
<script>
            document.getElementById('leaveType').addEventListener("change", function() {
var leaveType1=document.getElementById('leaveType').value;
                if(leaveType1==="Maternity"){
                  var input=$('<input/>',{'type':'number','class':'input100','name':'days', 'id':'days',
                        'value':'60', 'readonly':''});
                  $(document.getElementById('days')).replaceWith(input);
                }
		else if(leaveType1==="Sick"){
			var input1=$('<input/>',{'type':'number','class':'input100','name':'days', 'id':'days',
                        'min':'1', 'required':''});
                  $(document.getElementById('days')).replaceWith(input1);
                  
                }
                else if(leaveType1==="Paternity"){
			var input2=$('<input/>',{'type':'number','class':'input100','name':'days', 'id':'days',
                        'value':'10', 'readonly':'' });
                  $(document.getElementById('days')).replaceWith(input2);
                }
                else if(leaveType1==="Annual"){
			var input3=$('<input/>',{'type':'number','class':'input100','name':'days', 'id':'days',
                         'min':'1', 'required':''});
                  $(document.getElementById('days')).replaceWith(input3);
                }
		else{
			var input4=$('<input/>',{'type':'number','class':'input100','name':'days', 'id':'days',
                        'min':'1', 'required':''});
                  $(document.getElementById('days')).replaceWith(input4);
		}
           });
		

</script>    
	
<!--calculate the end Date ensuring that all weekends and Holidays are excluded and that the end date itself is not on a  or a Holiday    --> 	
        <script>
function calcWorkingDays(date, days){
    var hol1=[['New Year',[1,1]], ['Christmas day', [12,25]], ['Madaraka Day', [6,1]], ['Jamhuri Day', [12,12]], ['Labour Day',[5,1]],['Twins Day',[7,27]], ['Mashujaa Day',[10,20]]];
    var hol2=['07/30/2020 03:00:00','08/06/2020 03:00:00'];
    var hol=['01/01/2021 03:00:00', '05/01/2021 03:00:00','06/01/2021 03:00:00','10/10/2021 03:00:00','12/12/2020 03:00:00','10/20/2020 03:00:00',
        '12/25/2020 03:00:00','12/26/2020 03:00:00'];
    var count=0;
    while(count < days){
        date.setDate(date.getDate()+1);
        date1=new Date(date).getUTCDay();
        //Day 0 represents Sunday && day 6 represents Saturday
        if(date1!==0 && date1!==6 && !isHoliday(date,hol)){
            count++;
        }
        function isHoliday(date,arr){
            var bln;
            date2=new Date(date).getTime();
            for(var i=0; i<arr.length; i++){  
                date3=new Date(hol[i]).getTime();
                if(date2===date3){
                    bln=true;
                    break;
                }  
                else{
                    bln=false;
                }
             
              console.log(date.toLocaleDateString('en-US'));
              console.log(date.toLocaleString());
              console.log(date.toISOString().split('T')[0]);
              console.log(hol[i]); 
              console.log(bln);
            }
            return bln;
    }
    }
    return date.toISOString().split('T')[0];
} 
document.getElementById("leaveType").addEventListener("change", function(){
        var startDate=document.getElementById("startDate").value;
        var days=document.getElementById("days").value;
    document.getElementById("endDate").value=(calcWorkingDays(new Date(startDate), days));
    })
||
document.getElementById("days").addEventListener("change", function(){
        var startDate=document.getElementById("startDate").value;
        var days=document.getElementById("days").value;
    document.getElementById("endDate").value=(calcWorkingDays(new Date(startDate), days));
    })
||
document.getElementById("startDate").addEventListener("change", function(){
        var startDate=document.getElementById("startDate").value;
        var days=document.getElementById("days").value;
    document.getElementById("endDate").value=(calcWorkingDays(new Date(startDate), days));
    });
            </script>
<!--            
 ||
date.setDate(date.getDate()+1);
        date1=new Date(date).getTime();
        var i=0;
        while(i<hol.length){ 
            if(hol[i]!==date1){
            console.log(hol[i]);
            console.log(i);
            console.log(date1);
            i++;
            }
            i=10;
         }
      count++; 
 
document.getElementById("days").addEventListener("change", function(){
    var startDate=document.getElementById("startDate").value;
    var days=document.getElementById("days").value;
    var date1=new Date(startDate);
var diff=days*(1000*3600*24);
var diff2=date1.getTime()+diff;
document.getElementById("endDate").value= new Date(diff2);
 })
 ||
 document.getElementById("leaveType").addEventListener("change", function(){
    var startDate=document.getElementById("startDate").value;
    var days=document.getElementById("days").value;
    var date1=new Date(startDate);
var diff=days*(1000*3600*24);
var diff2=date1.getTime()+diff;
document.getElementById("endDate").value= new Date(diff2);
 });
</script>
-->

	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  </body>
</html>
