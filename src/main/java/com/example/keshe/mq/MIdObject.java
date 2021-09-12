package com.example.keshe.mq;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class MIdObject {
   private String str;
   private List<Position> list;
}
