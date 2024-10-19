package com.loja.loja.client;

import com.loja.loja.person.Person;
import com.loja.loja.repository.GenericRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClientService {

    private final GenericRepository<Person, UUID> personGenericRepository;

    public ClientService(GenericRepository<Person, UUID> personGenericRepository) {
        this.personGenericRepository = personGenericRepository;
    }

    public Client save(Client client) {
        return personGenericRepository.save(client);
    }
}
