package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.RepoItems;
import com.grocery.items.Items;

public class ServiceGrocery {
	
	@Service
	public class ServiceItem {
		
		@Autowired
		private RepoItems repoG;

		public Items addItems(Items inT) {
		
			return repoG.save(inT);
		}

		public List<Items> getGrocery() {
			List<Items> items = (List<Items>) repoG.findAll();
			return items;

		}
	}
}
