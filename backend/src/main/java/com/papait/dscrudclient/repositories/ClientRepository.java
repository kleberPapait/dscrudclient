package com.papait.dscrudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.papait.dscrudclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
