package com.microsg2.microsg2client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.microsg2.microsg2client.model.Article;
import com.microsg2.microsg2client.model.YAuthor;
import com.microsg2.microsg2client.model.YCategory;
import com.microsg2.microsg2client.model.YComment;
import com.microsg2.microsg2client.repository.ArticleProxy;
import com.microsg2.microsg2client.repository.CategoryProxy;
import com.microsg2.microsg2client.repository.AuthorProxy;
import com.microsg2.microsg2client.repository.CommentProxy;

@Controller
public class WebClientController {

	@Autowired
	private CategoryProxy categoryProxy;
		
	@Autowired
	private AuthorProxy authorProxy;
		
	@Autowired
	private ArticleProxy articleProxy;

	@Autowired
	private CommentProxy commentProxy;
		
	@GetMapping(value = {"/", "/{id}"})
	public String getHomePage(
			@PathVariable(name = "id", required = false) Integer id, 
			Model model) {		
		Iterable<YAuthor> authors = authorProxy.getAuthors();
		//model.addAttribute("users", users);	
		Iterable<YCategory> categories = categoryProxy.getCategories();
		//model.addAttribute("users", users);	
		Iterable<YComment> comments = commentProxy.getComments();
		//model.addAttribute("users", users);	
		Iterable<Article> article = articleProxy.getArticles();
		//model.addAttribute("product", product);
		return "homePage";
	}
		
	@GetMapping("/createAuthor")
	public String createAuthor(Model model) {
		YAuthor author = new YAuthor();
		model.addAttribute("author", author);
		return "formCreateAuthor";
	}
		
	@GetMapping("/updateAuthor/{id}")
	public String updateAuthor(@PathVariable int id, Model model) {
		YAuthor author = authorProxy.getAuthor(id);
		model.addAttribute("author", author);
		return "formUpdateAuthor";
	}	
		
	@PostMapping("/saveAuthor")
	public ModelAndView saveAuthor(@ModelAttribute YAuthor author) {
		if(author.getId() == null) {
			authorProxy.createAuthor(author);
		} else {
			authorProxy.updateAuthor(author);
		}
		return new ModelAndView("redirect:/");
	}

	@GetMapping("/deleteAuthor/{id}")
	public ModelAndView deleteAuthor(@PathVariable int id) {
		authorProxy.deleteAuthor(id);
		return new ModelAndView("redirect:/");	
	}
	
	@GetMapping("/createCategory")
	public String createCategory(Model model) {
		YCategory category = new YCategory();
		model.addAttribute("category", category);
		return "formCreateCategory";
	}
		
	@GetMapping("/updateCategory/{id}")
	public String updateCategory(@PathVariable int id, Model model) {
		YCategory category = categoryProxy.getCategory(id);
		model.addAttribute("category", category);
		return "formUpdateCategory";
	}	
		
	@PostMapping("/saveCategory")
	public ModelAndView saveCategory(@ModelAttribute YCategory category) {
		if(category.getId() == null) {
			categoryProxy.createCategory(category);
		} else {
			categoryProxy.updateCategory(category);
		}
		return new ModelAndView("redirect:/");
	}

	@GetMapping("/deleteCategory/{id}")
	public ModelAndView deleteCategory(@PathVariable int id) {
		categoryProxy.deleteCategory(id);
		return new ModelAndView("redirect:/");
	}
}