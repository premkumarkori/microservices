package com.premkumar.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {


    private final FraudCheckHistoryRepository repository;

    public boolean isFraudlentCustomer(Integer customerId) {
        repository.save(FraudCheckHistory
                .builder()
                .customerId(customerId)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build()
        );
        return false;
    }
}
