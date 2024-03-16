package com.ingress.bookstore.controller;

import com.ingress.bookstore.model.Customer;
import com.ingress.bookstore.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class LoginController {

  private  CustomerRepository customerRepository;

  private PasswordEncoder passwordEncoder;
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer){
        List<Customer> existingUsers = customerRepository.findCustomerByEmail(customer.getEmail());
        if (!existingUsers.isEmpty()) {
            return ResponseEntity.badRequest().body("Error: Email is already in use!");
        }
        customer.setPwd(passwordEncoder.encode(customer.getPwd()));
        customer.setRole(customer.getRole());
        customerRepository.save(customer);

        return ResponseEntity.ok("User registered successfully!");
    }

}
