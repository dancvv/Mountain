package com.mountain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mountain.entity.Location;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.util.ArrayList;
import java.util.Map;


public interface LocationService extends IService<Location> {
    // 固定VRP算法
    Map<Object, ArrayList<Integer>> planCompute(Long[][] distanceMatrix, Integer vehicleNumber, Integer depot);
    // 动态VRP算法
    Map<Object, ArrayList<Integer>> movePassengerPlan(Long[][] tempDistanceMatrix, Integer vehicleNumber , int[] startPosition, int[] depot);
    // 动态保存用户位置
    Boolean dynamicLocationSave(Map<String, GeoJsonPoint> locationMap,Map<String,GeoJsonPoint> uavLocation);
    void dynamicRoutes();


}
