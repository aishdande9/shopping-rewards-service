package com.charter.example.shopping.rewards.service;

import com.charter.example.shopping.rewards.model.Customer;
import com.charter.example.shopping.rewards.model.Transaction;
import com.charter.example.shopping.rewards.repository.CustomerRepository;
import com.charter.example.shopping.rewards.repository.RewardPointsRepository;
import com.charter.example.shopping.rewards.repository.TransactionRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private RewardPointsRepository rewardPointsRepository;
    @Autowired
    private TransactionRepository transactionRepository;


    public int calculateCustomerReward(int amount){
        int points = 0;
        if(amount>100){

            points += (amount-100)*2;
        }
       else if(amount>50){
            points += amount*1;

        }

       return points;
    }

    public Customer addCustomerDetails(Customer customer){
        return customerRepository.save(customer);
    }

    public Transaction addCustomerTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }
    public Optional<Customer> getCustomerById(long id){
   return customerRepository.findById(id);
    }
}
