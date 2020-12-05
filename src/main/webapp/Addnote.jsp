<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
<div class="container">
    
    <%@include file="Napbar.jsp" %>
    
    <!--this is add form   -->
    <div class="container">
    <div class="container">
    <br>
    <h1>Please fill your note details</h1>
    <br>
    <form action="SaveNoteServlet" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Note title</label>
    <input name="titile" required type="text" class="form-control" id="titile" aria-describedby="emailHelp" placeholder="Enter here">
    
  </div>
  <div class="form-group">
    <label for="content">Note Content </label>
    <textarea name="content" required id="content"
    placeholder="Enter your content here"
    class="form-control"
    style="height:230px;">
    </textarea>
    
  </div>
  <div class="container text-center">
  <button type="submit" class="btn btn-primary">Add Notes</button>
  </div>
</form>
</div>
    </div>
    </div>
</body>
</html>