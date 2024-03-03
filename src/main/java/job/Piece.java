package job;
import java.io.Serializable;
public class Piece implements Serializable{
private Long idPiece;
private String nomPiece;
private double prix_piece;
public Piece() {
super();
}
public Piece(String nomPiece, double prix_piece) {
super();
this.nomPiece = nomPiece;
this.prix_piece = prix_piece;
}
public Long getIdPiece() {
return idPiece;
}
public void setIdPiece(Long idPiece) {
this.idPiece = idPiece;
}
public String getNomPiece() {
return nomPiece;
}
public void setNomPiece(String nomPiece) {
this.nomPiece = nomPiece;
}
public double getPrix() {
return prix_piece;
}public void setPrix(double prix) {
	this.prix_piece = prix;
	}
	}