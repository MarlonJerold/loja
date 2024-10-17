package com.loja.loja.sec;

import com.loja.loja.person.Person;
import com.loja.loja.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Person> person = personRepository.findByEmail(email);
        if (person.isEmpty()) {
            throw new UsernameNotFoundException("Usuário não encontrado com email: " + email);
        }

        return new User(
                person.get().getEmail(),
                person.get().getPassword(),
                new ArrayList<>()
        );
    }
}
