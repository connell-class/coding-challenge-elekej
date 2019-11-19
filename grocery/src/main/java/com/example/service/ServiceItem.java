package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.RepoItems;
import com.grocery.items.Items;

@Service
	public class ServiceItem {
		
		@Autowired
		private RepoItems repoI;

		public Items addItems(Items inT) {
		
			return repoI.save(inT);
		}

		public List<Items> getItems() {
			List<Items> items = (List<Items>) repoI.findAll();
			return items;
		}
		
		

	}



