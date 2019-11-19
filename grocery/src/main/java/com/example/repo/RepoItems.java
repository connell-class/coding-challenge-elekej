package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.grocery.items.Items;

public interface RepoItems extends CrudRepository<Items, Integer>{
	
	List<Items> findById(int id);


}
