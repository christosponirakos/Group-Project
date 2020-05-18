package org.afdemp.wellness.services;

import org.afdemp.wellness.controllers.dto.UserRegistrationDto;
import org.afdemp.wellness.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

//import net.javaguides.springboot.springsecurity.model.User;
//import net.javaguides.springboot.springsecurity.web.dto.UserRegistrationDto;
//import org.afdemp.leisurehotel4animals.entities.User;
public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
