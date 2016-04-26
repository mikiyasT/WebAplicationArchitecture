<%-- 
   
    Author     : 984615
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>USer Name validator</title>
    </head>
    <body>
        <form name='myform' method='post' action="checkName">
           
            <p>Your Age: <input type="text" name="age" value=${age}></p>
            <font style='color:red'><b>${ageError}</b></font>
           
            
             <p>Your userName: <input type="text" name="usr" value=${usr}>
                <font style='color:red'><b>${usrError}</b></font></p>
          
            
             <p>Your password: <input type="password" name="pswd" value=${pswd}>
                <font style='color:red'><b>${pswdError}</b></font></p>
                <font style='color:red'><b>${attempts}</b></font></p>
            
 
            <p>
                <input type='submit' name='btnNext' value='Next' />

            </p>

        </form>
    </body>
</html>
