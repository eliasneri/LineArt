package lineart.com.LineArt.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lineart.com.LineArt.entities.clients;
import lineart.com.LineArt.repositories.clientRepository;

@RestController
@RequestMapping(value = "/clientes")
public class clientsResource {
	
	@Autowired
	private clientRepository repositorio;
	
	@GetMapping
	@Transactional (readOnly = true)
	public List<clients> findAll(){
		return repositorio.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<clients> findById(@PathVariable Long id){
		return repositorio.findById(id);
	}

}
