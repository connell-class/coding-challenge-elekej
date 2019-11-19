package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.groceryInfoList.GroceryIL;
import com.example.repo.RepoGros;
import com.grocery.items.Items;



@RestController
@RequestMapping("/grocery")

		public class ControlGroceryIL {
			
			
			private RepoGros repoG;
			
			public ControlGroceryIL(RepoGros repoG) {
				this.repoG =repoG;
			}
			
			@GetMapping("/getAll")
			public List<GroceryIL> all() {
				return (List<GroceryIL>) repoG;
			}

	}

