package job;

import java.util.List;

public class TestJob {

	public static void main(String[] args) {
		JobImpl job= new JobImpl();
		List<Piece> piecs = job.getPiecesParMotCle("");
		for (Piece p : piecs)
		System.out.println(p.getNomPiece());
		}
}
