package com.farrasabiyyu12.resepfood2fork.Main.model;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class ResponseRecipe{

	@SerializedName("recipes")
	private List<RecipesItem> recipes;

	@SerializedName("count")
	private int count;

	public void setRecipes(List<RecipesItem> recipes){
		this.recipes = recipes;
	}

	public List<RecipesItem> getRecipes(){
		return recipes;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	@Override
 	public String toString(){
		return 
			"ResponseRecipe{" + 
			"recipes = '" + recipes + '\'' + 
			",count = '" + count + '\'' + 
			"}";
		}
}