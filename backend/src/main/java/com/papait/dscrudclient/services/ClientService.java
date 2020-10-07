package com.papait.dscrudclient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.papait.dscrudclient.dto.ClientDTO;
import com.papait.dscrudclient.entities.Client;
import com.papait.dscrudclient.repositories.ClientRepository;

@Service
public class ClientService {
    @Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
    public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Client> list = repository.findAll(pageRequest);
		
		return list.map( x-> new ClientDTO(x));
	}

}
