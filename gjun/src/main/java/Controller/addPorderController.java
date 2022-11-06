package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.porder.implPorder;
import Model.porder;

public class addPorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public addPorderController() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1.取-->session-->porder
		 * 2.add訂單
		 * 3.切換到finish
		 */
    	HttpSession session= request.getSession();
    	porder p = (porder)session.getAttribute("P");
    	new implPorder().add(p);
    	
    	response.sendRedirect("porder/finish.jsp");
	}

}
