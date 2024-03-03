package job;

import java.util.List;

public interface IjobCatalogue {

	public List<Piece> getPiecesParMotCle(String mc);
	public void addPiece(Piece p);
}
