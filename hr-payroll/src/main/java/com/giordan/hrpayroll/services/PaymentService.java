package com.giordan.hrpayroll.services;

import com.giordan.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days){
        return new Payment("Bob", 200.0, days);
    }
}