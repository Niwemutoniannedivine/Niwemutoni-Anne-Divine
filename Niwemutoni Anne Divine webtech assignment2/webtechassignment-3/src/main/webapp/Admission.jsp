<!DOCTYPE html>
<html>
<head>
    <title>Student Admission</title>
</head>
<body>
<h2>Student Admission</h2>
<form action="AdmissionServlet" method="post" enctype="multipart/form-data">
    First Name: <input type="text" name="firstName" required><br>
    Last Name: <input type="text" name="lastName" required><br>
    Passport Picture: <input type="file" name="passportPicture" accept=".jpg, .png" required><br>
    Diploma Certificate: <input type="file" name="diplomaCertificate" accept=".pdf" required><br>
    <input type="submit" value="Submit Admission">
</form>
</body>
</html>