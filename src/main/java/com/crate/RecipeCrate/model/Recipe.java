package com.crate.RecipeCrate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Recipe {
	@Id  
	@Column 
	private int recipeId;
	@Column  
	private int suggestedServings;
	@Column  
	private boolean isVeg;
	@Column  
	private String dishName;
	@Column
	private String instructions;
	@Column
	private String creationTime;
	
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public int getSuggestedServings() {
		return suggestedServings;
	}
	public void setSuggestedServings(int suggestedServings) {
		this.suggestedServings = suggestedServings;
	}
	public boolean getIsVeg() {
		return isVeg;
	}
	public void setIsVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
    
	
}
