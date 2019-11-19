package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.groceryInfoList.GroceryIL;


public class RepoGros {
	

public interface RepoItems extends CrudRepository<GroceryIL, Integer>{
	
	List<GroceryIL> findById(int id);

	}
}
