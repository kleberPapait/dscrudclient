package com.papait.dscrudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.papait.dscrudclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
