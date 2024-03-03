package job;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class JobImpl implements IjobCatalogue {
@Override
public List<Piece> getPiecesParMotCle(String mc) {
 List<Piece> piecs= new ArrayList<Piece>();
 Connection conn=SingletonConnection.getConnection();
 try {
PreparedStatement ps= conn.prepareStatement("select * from PIECES where NOM_PIECE LIKE ?");
ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Piece p = new Piece();
p.setIdPiece(rs.getLong("ID_PIECE"));
p.setNomPiece(rs.getString("NOM_PIECE"));
p.setPrix(rs.getDouble("PRIX_PIECE"));
piecs.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return piecs;
}
@Override
public void addPiece(Piece p) {
// TODO Auto-generated method stub
}
}
