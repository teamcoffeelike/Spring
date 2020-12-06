package com.hanul.coffeelike.caramelweb;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

@Controller
public class RecipeController {
	private final Gson GSON = new GsonBuilder().create();
	
	@ResponseBody
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public String onException(MissingServletRequestParameterException ex) {
		JsonObject o = new JsonObject();
		o.addProperty("success", "false");
		o.addProperty("error", "bad_parameter");
		
		return GSON.toJson(o);
	}
	
	//������ ����Ʈ
	@ResponseBody
	@RequestMapping("/recipeList")
	public String recipeList(
			HttpSession session,
			//[category : ( "hot_coffee" | "ice_coffee" | "tea" | "ade" | "smoothie" | "etc" )]
			@RequestParam int author
	) {
		JsonObject o = new JsonObject();
		o.addProperty("success", "true");
		o.addProperty("userId", 1231231323);
		
		return GSON.toJson(o);
	}
	
	//������
	@ResponseBody
	@RequestMapping("/recipe")
	public String recipe(
			HttpSession session,
			@RequestParam int id
	) {
		JsonObject o = new JsonObject();
		o.addProperty("success", "true");
		o.addProperty("userId", 1231231323);
		
		return GSON.toJson(o);
	}
	
	//������ ����
	@ResponseBody
	@RequestMapping("/recipeSteps")
	public String recipeSteps(
			HttpSession session,
			@RequestParam int id
	) {
		JsonObject o = new JsonObject();
		o.addProperty("success", "true");
		o.addProperty("userId", 1231231323);
		
		return GSON.toJson(o);
	}
	
	//������ �ۼ�
	@ResponseBody
	@RequestMapping("/writeRecipe")
	public String writeRecipe(
			HttpSession session,
			@RequestParam String text,
			@RequestParam File titleImage
			//ī�װ���
	) {
		JsonObject o = new JsonObject();
		o.addProperty("success", "true");
		o.addProperty("userId", 1231231323);
		
		return GSON.toJson(o);
	}
	
	//������ ����
	@ResponseBody
	@RequestMapping("/editRecipe")
	public String editRecipe(
			HttpSession session,
			@RequestParam int recipe,
			@RequestParam String text,
			@RequestParam File titleImage
			//ī�װ���
	) {
		JsonObject o = new JsonObject();
		o.addProperty("success", "true");
		o.addProperty("userId", 1231231323);
		
		return GSON.toJson(o);
	}
	
	//������ ����
	@ResponseBody
	@RequestMapping("/deleteRecipe")
	public String deleteRecipe(
			HttpSession session,
			@RequestParam int recipe
	) {
		JsonObject o = new JsonObject();
		o.addProperty("success", "true");
		o.addProperty("userId", 1231231323);
		
		return GSON.toJson(o);
	}
	
	//������ ��
	@ResponseBody
	@RequestMapping("/rateRecipe")
	public String rateRecipe(
			HttpSession session,
			@RequestParam int recipe, 
			@RequestParam int rating//?
	) {
		JsonObject o = new JsonObject();
		o.addProperty("success", "true");
		o.addProperty("userId", 1231231323);
		
		return GSON.toJson(o);
	}
	
	
	
}