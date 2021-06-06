package com.crate.RecipeCrate.service;


import java.util.ArrayList;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crate.RecipeCrate.model.*;
import com.crate.RecipeCrate.repository.RecipeRepository;

//defining the business logic  
@Service  
public class RecipeService {

	@Autowired  
	RecipeRepository recipeRepository;  
	
	//getting all recipes by using the method findaAll() of CrudRepository  
	public List<Recipe> getAllRecipes()   
	{  
	List<Recipe> recipe = new ArrayList<Recipe>();  
	recipeRepository.findAll().forEach(recipe1 -> recipe.add(recipe1));  
	return recipe;  
	}  
	
	//getting a specific recipe by using the method findById() of CrudRepository  
	public Recipe getRecipeById(int id)   
	{  
	return recipeRepository.findById(id).get();  
	}  
	
	
	//saving a specific recipe by using the method save() of CrudRepository  
	public void saveOrUpdate(Recipe recipe)   
	{  
		recipeRepository.save(recipe);  
	}
	
	//deleting a specific recipe by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		recipeRepository.deleteById(id);  
	}
	
	//updating a recipe  
	public void update(Recipe recipe, int bookid)   
	{  
		recipeRepository.save(recipe);  
	}  
	
}
