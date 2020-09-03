package com.devsuperior.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.devsuperior.myfirstproject.entities.Category;

@Component //mecanismo de injeção de dependência do SpringBoot
public class CategoryRepository {
	
	private Map<Long, Category> map = new HashMap<>();

	public void save(Category obj) {
		map.put(obj.getId(), obj);
	}

	public Category findById(Long id) {
		return map.get(id);//retorna o objeto correspondente a chave que indicou
	}
	
	public List<Category> findAll() {
		return new ArrayList<Category>(map.values());
	}
}