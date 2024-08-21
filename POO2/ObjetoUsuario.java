package POO2;

public class ObjetoUsuario {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario(); 
		
		usuario1.setId(7434);
		usuario1.setNome("Samuel");                           
		usuario1.setPassword(12390078);
		usuario1.setPermissao("Aceita");
		usuario1.setUsuario("Reaper");
		
		usuario2.setId(1234);
		usuario2.setNome("José");                           
		usuario2.setPassword(123456789);
		usuario2.setPermissao("Negada");
		usuario2.setUsuario("Raul");
		
		System.out.println("--------------- Usuário 1 ---------------");
		System.out.println(usuario1.getId());
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getPassword());
		System.out.println(usuario1.getPermissao());
		System.out.println(usuario1.getUsuario());
		
		System.out.println("--------------- Usuário 2 ---------------");
		System.out.println(usuario2.getId());
		System.out.println(usuario2.getNome());
		System.out.println(usuario2.getPassword());
		System.out.println(usuario2.getPermissao());
		System.out.println(usuario2.getUsuario());

	}

}
