package com.example.keshe.mq;

import lombok.Data;
import org.hibernate.validator.constraints.CodePointLength;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Data
public class Position {
    private int x;
    private  int y;
}
