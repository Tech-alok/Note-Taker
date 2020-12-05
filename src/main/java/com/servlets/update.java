package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entities.Factoryconnection;
import com.Entities.Note;


public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public update() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			
			String title=request.getParameter("titile");
			String content=request.getParameter("content");
			
			int noteid=Integer.parseInt(request.getParameter("noteId").trim());
			Session s=Factoryconnection.getFactory().openSession();
			Transaction tx=s.beginTransaction();
			
			Note note=(Note)s.get(Note.class,noteid);
			
			note.setTitile(title);
			note.setContent(content);
			
			tx.commit();
			s.close();
			
			response.sendRedirect("allnotes.jsp");
			
			
			
			
			
			
			

		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
