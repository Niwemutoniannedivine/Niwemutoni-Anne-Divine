<!DOCTYPE html>
<html>
<head>
    <title>Number Converter and Student Admission</title>
</head>
<body>
<h1>Number Converter</h1>
<form action="NumberConverterServlet" method="GET">
    <label>Enter a number: <input type="text" name="number"></label>
    <input type="submit" value="Convert">
</form>

<h1>Student Admission</h1>
<form action="AdmissionServlet" method="POST">
    <label>Username: <input type="text" name="username"></label><br>
    <label>Password: <input type="password" name="password"></label><br>
    <label>Student Name: <input type="text" name="studentName"></label><br>
    <label>Course: <input type="text" name="course"></label><br>
    <input type="submit" value="Preview Admission">
</form>

</body>
</html>
