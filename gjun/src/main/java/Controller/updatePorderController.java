package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porder.implPorder;
import Model.porder;

public class updatePorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public updatePorderController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1.request-->id-->改-->desk,A,B,C
		 * 2.update(p);
		 * 3.回update.jsp
		 */
		request.setCharacterEncoding("BIG5");
		
		int ID = Integer.parseInt(request.getParameter("id"));
		porder p = new implPorder().queryPorder(ID);
		
		p.setDesk(request.getParameter("desk"));
		p.setA(Integer.parseInt(request.getParameter("A")));
		p.setB(Integer.parseInt(request.getParameter("B")));
		p.setC(Integer.parseInt(request.getParameter("C")));
		
		p.getSum();
		
		new implPorder().update(p);
		
		response.sendRedirect("porder/update.jsp");
		
		
	}

}
