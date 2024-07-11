package myCalcPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyCalcServlet
 */
@WebServlet("/MyCalcServlet")
public class MyCalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String[] jokes= {
				"Why did the Java developer teach his young kids about single quotes?Because they build character",
			    "Why do Java developers wear glasses? Because they don't C#!",
		        "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
		        "Why don't programmers like nature? It has too many bugs.",
		        "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
		        "Why did the two Java methods get a divorce?Because they had constant arguments."
		        };
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyCalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
String button = request.getParameter("bt");
int a = Integer.parseInt(num1);
int b = Integer.parseInt(num2);
int c ;
if(button.equals("1"))
c=a+b;
 else if(button.equals("2")) c=a-b;

	 else if (button.equals("3"))	c=a/b;

		 else  c=a*b;
		

//response.getWriter().append("Ans"+c);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	 int index = (int) (Math.random()*jokes.length);
	String joke = jokes[index];



response.sendRedirect("Calc.jsp?c="+c+"&joke="+joke);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
