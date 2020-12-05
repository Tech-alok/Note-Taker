<!doctype html>
<%@page import="org.hibernate.Session"%>
<%@page import="com.Entities.*"%>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <%@include file="all_js_css.jsp"%>
    <!-- <title>Note take: Home page</title> -->
    
  </head>
  <body>
  
  <div class="container">
  <%@include file="Napbar.jsp" %>
  <br>
    <h1>Edit your note</h1>
    <br>
    <%
    
    int noteId=Integer.parseInt(request.getParameter("note_id").trim());
    Session s=Factoryconnection.getFactory().openSession();
    
    Note note=(Note)s.get(Note.class, noteId);
    %>
    <form action="update" method="post">
    
    <input value="<%= note.getId() %>" name="noteId"/>
    
  <div class="form-group">
    <label for="exampleInputEmail1">Note title</label>
    <input name="title" required type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter here" value="<%=note.getTitile() %>">
    
  </div>
  <div class="form-group">
    <label for="content">Note Content </label>
    <textarea name="content" required id="content"
    placeholder="Enter your content here"
    class="form-control"
    style="height:230px;"><%= note.getContent() %>
    </textarea>
    
  </div>
  <div class="container text-center">
  <button type="submit" class="btn btn-success">Save note</button>
  </div>
</form>
</div>
    
  </body>
</html>