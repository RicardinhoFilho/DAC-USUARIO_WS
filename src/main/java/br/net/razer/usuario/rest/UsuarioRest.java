package br.net.razer.usuario.rest;
import br.net.razer.usuario.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@CrossOrigin
@RestController
public class UsuarioRest {
	
	public static List<Usuario> lista = new ArrayList<Usuario>();
	
	@GetMapping("/usuarios")
	public List<Usuario>obterTodosUsuarios(){
		return lista;
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuario obterUsuario(@PathVariable("id")int id){
		
		return  lista.stream().filter(usu->usu.getId()==id).findAny().orElse(null);
	}
	
	static {
		lista.add(new Usuario(1,"administrador","admin","admin","Admin"));
		lista.add(new Usuario(2,"gerente","gerente","gerente","Gerente"));
		lista.add(new Usuario(3,"funcionario","funcionario","funcionario","Funcionario"));
	}

}
