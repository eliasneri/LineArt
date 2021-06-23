package lineart.com.LineArt.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lineart.com.LineArt.DTO.clientDTO;
import lineart.com.LineArt.entities.client;
import lineart.com.LineArt.repositories.clientRepository;
import lineart.com.LineArt.services.exceptions.ResourceNotFoundException;

@Service
public class clientService {

	@Autowired
	private clientRepository repositorio;
	
	
	@Transactional(readOnly = true)
	public List<clientDTO> findAll(){
		List<client> list = repositorio.findAll();
		return list.stream().map(x -> new clientDTO(x)).collect(Collectors.toList());
		
		
	}


	public clientDTO findById(Long id) {
		Optional<client> obj = repositorio.findById(id);
		client entity = obj.orElseThrow(() -> new ResourceNotFoundException("ID Não Encontrado")); 
		return new clientDTO(entity); 
	}
	
	
}
