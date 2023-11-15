package com.giordan.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public record Payment(String name, Double dailyIncome, Integer days) {

    public double getTotal(){
        return days * dailyIncome;
    }


}
