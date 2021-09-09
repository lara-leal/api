public class Principal {

	public static void main(String[] args) {
		connection con = new connection();
		String sql = "INSERT INTO  Cliente (id, nome, e-mail) VALUES (default, 'Lara Leal', 'lara.o.leal@hotmail.com')";
		int res = con.executaSQL(sql);
		if (res > 0){
			System.out.println("Cadastrado com sucesso");
		}else{
			System.out.println("erro");
		}
	}

}
