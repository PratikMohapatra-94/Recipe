package com.crate.RecipeCrate.repository;

import org.springframework.data.repository.CrudRepository;  
import com.crate.RecipeCrate.model.*;
//repository that extends CrudRepository
public interface RecipeRepository extends CrudRepository<Recipe, Integer>
{
	
}
