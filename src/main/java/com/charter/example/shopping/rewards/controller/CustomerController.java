package com.charter.example.shopping.rewards.controller;

import com.charter.example.shopping.rewards.model.Customer;
import com.charter.example.shopping.rewards.model.Transaction;
import com.charter.example.shopping.rewards.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
@PostMapping("/add")
public Customer addCustomerDetails(@RequestBody Customer customer){
    return customerService.addCustomerDetails(customer);
}

public Transaction addTransactionDetails(@RequestBody Transaction transaction){
    return customerService.addCustomerTransaction(transaction);
}

public Optional<Customer> getCustomerDetailsById(@PathVariable Long id){

}
}
