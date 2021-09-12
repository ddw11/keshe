package com.example.keshe.Service;

import com.example.keshe.entity.CarData;


import java.util.List;

public interface CarDataService {
    List<CarData> listCarDataEntity();

    void deleteAll();
}
