package com.example.demo.Model;

import org.springframework.data.repository.CrudRepository;

public interface InventoryRepo extends CrudRepository<Inventory, Integer> {
}
