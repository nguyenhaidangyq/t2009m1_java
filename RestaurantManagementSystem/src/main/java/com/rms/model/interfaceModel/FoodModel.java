package com.rms.model.interfaceModel;

import com.rms.entity.Food;

import java.util.List;

public interface FoodModel {
    boolean create(Food obj);
    boolean update(int id, Food obj);
    boolean delete(int id);
    Food findById(int id);
    Food findByCode(String slug);
    List<Food> findAll();
}
