package yixintest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class MyFirstServlet extends HttpServlet{
   @Override
public void service(ServletRequest req, ServletResponse res)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	   res.setContentType("text/html");
	   res.setCharacterEncoding("utf-8");
	   PrintWriter writer=null;
	   try{
	   writer=res.getWriter();
	   writer.write("Hello World!");
	   }catch(IOException e){
		   e.printStackTrace();
	   }
}
}