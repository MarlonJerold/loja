package com.loja.loja.adm;

import com.loja.loja.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public Admin save(Admin admin) {
        return personRepository.save(admin);
    }
}
