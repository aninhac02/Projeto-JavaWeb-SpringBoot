package com.project.myfirstproject.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.myfirstproject.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Eletronics"));
		list.add(new Category(2L, "Books"));
		return ResponseEntity.ok().body(list);
	}

   @GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category cat = new Category(1L, "Eletronics");
		return ResponseEntity.ok().body(cat);
	} 
}