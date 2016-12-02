
import java.sql.Date;
import java.sql.*;
import java.util.*;

public class DAO {

    private Connection connection = null;
	
    public DAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(
                            "jdbc:mysql://localhost/meus_dados", "root", "19962000");
        } catch (SQLException | ClassNotFoundException e) {e.printStackTrace();}
    }
    
    public void adicionaPessoa(Usuario usuario) {
        try {
            String sql = "INSERT INTO Pessoa (nome, moeda) values(?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,usuario.getNome());
            stmt.setInt(2,usuario.getMoeda());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {e.printStackTrace();}
    }
    
    public void adicionaJogada(Usuario usuario) {
        try {
            String sql = "INSERT INTO Jogadas (nome, horario) values(?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,usuario.getNome());
            stmt.setDate(2, new Date(usuario.getDataJogada().getTimeInMillis()));
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {e.printStackTrace();}
    }
    
    public List<Usuario> getLista() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {	
            PreparedStatement stmt = connection.
					prepareStatement("SELECT * FROM Jogadas");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getLong("id"));
                usuario.setNome(rs.getString("nome"));
                Calendar data = Calendar.getInstance();
                Date dataJogada = rs.getDate("horario");
                if(dataJogada!=null) {		
                    data.setTime(dataJogada);
                    usuario.setDataJogada(data);
                }
                usuarios.add(usuario);
            }
            rs.close();
            stmt.close();
        } catch(SQLException e) {System.out.println(e);}
        return usuarios;
    }
}
