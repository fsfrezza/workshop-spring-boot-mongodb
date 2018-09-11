package br.com.viavarejo.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.viavarejo.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")

public class UserResource {
	@RequestMapping(method=RequestMethod.GET)
	
	public ResponseEntity<List<User>> findAll(){
		User usuario1 = new User("1", "Usuário1", "usuario1@spring.com");
		User usuario2 = new User("2", "Usuário2", "usuario2@spring.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(usuario1, usuario2));
		return ResponseEntity.ok().body(list);
	}

}
