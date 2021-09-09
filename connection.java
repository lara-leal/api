import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
	private String url;
	private String usuario;
	private String senha;
	private Connection con;
	
	connection(){
		url = "jdbc:postgresql://localhost:5432/postgres";
		usuario = "postgres";
		senha ="A996739786";
		
		try {
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conexão realizada com sucesso!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public int executaSQL(String sql){
	try {
		Statement stm = con.createStatement();
		int res = stm.executeUpdate(sql);
		con.close();
		return res;
	} catch (Exception e) {
		e.printStackTrace();
		return 0;
   }
	}
}
