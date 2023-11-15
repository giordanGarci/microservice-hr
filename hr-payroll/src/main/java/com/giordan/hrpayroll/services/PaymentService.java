package com.giordan.hrpayroll.services;

import com.giordan.hrpayroll.entities.Payment;
import com.giordan.hrpayroll.entities.Worker;
import com.giordan.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;
    public Payment getPayment(Long workerId, int days){

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.name(), worker.dailyIncome(), days);
    }
}
