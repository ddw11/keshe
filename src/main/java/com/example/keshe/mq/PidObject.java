package com.example.keshe.mq;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PidObject {

    private String p;

    private String i;

    private String d;
}
