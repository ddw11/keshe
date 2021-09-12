package com.example.keshe.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.keshe.entity.CarData;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;




@Repository
public interface CarDataMapper extends BaseMapper<CarData> {
    @Update("truncate table car_data")
    void deleteAll();
}
