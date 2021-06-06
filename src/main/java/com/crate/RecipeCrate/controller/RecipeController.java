package com.crate.RecipeCrate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.crate.RecipeCrate.model.*;
import com.crate.RecipeCrate.service.*;
//import com.crate.RecipeCrate.util.*;

//mark class as Controller  
@RestController  
public class RecipeController {

	//autowire the BooksService class  
	@Autowired  
	RecipeService recipeService;
	
	//creating a get mapping that retrieves all the recipes details from the database   
	@GetMapping("/recipe")
	private List<Recipe> getAllRecipes()   
	{  
		return recipeService.getAllRecipes();  
	}  
	
	//creating a get mapping that retrieves the detail of a specific recipe  
	@GetMapping("/recipe/{recipeId}")  
	private Recipe getRecipe(@PathVariable("recipeId") int recipeId)   
	{  
		return recipeService.getRecipeById(recipeId);  
	}  
	
	
	//creating a delete mapping that deletes a specified recipe  
	@DeleteMapping("/recipe/{recipeId}")  
	private void deleteRecipe(@PathVariable("recipeId") int recipeId)   
	{  
		recipeService.delete(recipeId);  
	}  
	
	//creating post mapping that post the recipe detail in the database  
	@PostMapping("/recipe")  
	private int saveRecipe(@RequestBody Recipe recipe)   
	{  
//		String creationTime= new TimeUtil().getTime();  
//		recipe.setCreationTime(creationTime);
		recipeService.saveOrUpdate(recipe);  
		return recipe.getRecipeId();  
	}  
	
	//creating put mapping that updates the recipe detail   
	@PutMapping("/recipe")  
	private Recipe update(@RequestBody Recipe recipe)   
	{  
		recipeService.saveOrUpdate(recipe);  
		return recipe;  
	}  
	
}
