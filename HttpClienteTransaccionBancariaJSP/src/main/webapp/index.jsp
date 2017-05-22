<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">

<body>
    <form action="proceso" method="get">
    Numero de Cuenta1:
    <input type="text" name="cuenta1">
    <br/>
    Numero de Cuenta2:
    <input type="text" name="cuenta2">
    <br/>
    Monto:
    <input type="text" name="monto">
 
    <br/>
    
    <p><input type="submit" value="REALIZAR TRANSACCION"></p>
</form>

</html>