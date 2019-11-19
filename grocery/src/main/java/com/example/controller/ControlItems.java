package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repo.RepoItems;
import com.grocery.items.Items;

@RestController
@RequestMapping("/items")
public class ControlItems {
	
	
	private RepoItems repoI;
	
	public ControlItems(RepoItems repoI) {
		this.repoI =repoI;
	}
	
	@GetMapping("/getAll")
	public List<Items> all() {
		return (List<Items>) repoI.findAll();
	}
	
	
}
	
