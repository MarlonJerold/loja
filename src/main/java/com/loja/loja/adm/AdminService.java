package com.loja.loja.adm;

import com.loja.loja.person.Person;
import com.loja.loja.repository.GenericRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class AdminService {

    private final GenericRepository<Person, UUID> personGenericRepository;

    public AdminService(GenericRepository<Person, UUID> personGenericRepository) {
        this.personGenericRepository = personGenericRepository;
    }

    @Transactional
    public Admin save(Admin admin) {
        return personGenericRepository.save(admin);
    }
}
