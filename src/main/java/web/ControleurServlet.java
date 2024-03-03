package web;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import job.IjobCatalogue;
import job.JobImpl;
import job.Piece;

@WebServlet (name="cs",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet  {
	  private static final long serialVersionUID = 1L;
private IjobCatalogue job;
@Override
public void init() throws ServletException {
job=new JobImpl();
}
@Override
protected void doPost(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
	String mc=request.getParameter("motCle");
	PieceModele mod = new PieceModele();
	mod.setMotCle(mc);
	List<Piece> piecs = job.getPiecesParMotCle(mc);
	mod.setPieces(piecs);
	request.setAttribute("modele", mod);
	request.getRequestDispatcher("PiecesView.jsp").forward(request,response);
	}
	}