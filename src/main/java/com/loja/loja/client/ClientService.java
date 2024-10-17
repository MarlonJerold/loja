package com.loja.loja.client;

import com.loja.loja.person.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final PersonRepository personRepository;

    public ClientService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Client save(Client client) {
        return personRepository.save(client);
    }
}
