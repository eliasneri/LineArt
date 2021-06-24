package lineart.com.LineArt.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import lineart.com.LineArt.DTO.clientDTO;
import lineart.com.LineArt.services.clientService;

@RestController
@RequestMapping(value = "/clientes")
public class clientResources {
	
	@Autowired
	private clientService servico;
	
	@GetMapping
	public ResponseEntity<List<clientDTO>> findAll(){
		List<clientDTO> list = servico.findAll();
		return ResponseEntity.ok().body(list);
	}
		
	@GetMapping(value = "/{id}")
	public ResponseEntity<clientDTO> findById(@PathVariable Long id){
		clientDTO dto = servico.findById(id); 
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<clientDTO> insert (@RequestBody clientDTO dto){
		dto = servico.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
}
