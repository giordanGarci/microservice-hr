package com.giordan.hrworker.services;

import com.giordan.hrworker.entities.Worker;
import com.giordan.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> findAll(){
        return workerRepository.findAll();
    }

    public Worker findById(Long id){
        Optional<Worker> worker = workerRepository.findById(id);
        return worker.get();
    }
}
