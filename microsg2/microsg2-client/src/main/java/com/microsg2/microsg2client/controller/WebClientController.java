package com.microsg2.microsg2client.controller;

import java.security.Principal;

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
	private ArticleProxy articleProxy;

	@Autowired
	private CommentProxy commentProxy;

	@Autowired
	private AuthorProxy authorProxy;

	@Autowired
	private CategoryProxy categoryProxy;


	@GetMapping(value = {"/"})
	public String getHomePage(Model model) {
		Iterable<YCategory> categories = categoryProxy.getCategories();
		model.addAttribute("categories", categories);
		Iterable<Article> articles = articleProxy.last(10);
	 	model.addAttribute("articles", articles);
		return "index";
	}

	@GetMapping(value = {"/logout"})
	public void logout() {
	}

	@GetMapping(value = {"/login"})
	public String login(Model model) {
		return "login";
	}
	
	//Test de récuperation suite à connexion.
	 @GetMapping("/loginTest")
	 public String currentUserName(Principal principal) {
		 return "loginTest";
	 }

	// ARTICLE
		@GetMapping("/article/{id}")
		public String displayArticle(@PathVariable int id, Model model, Principal principal) {
		  Article article = articleProxy.getArticle(id);
		  model.addAttribute("article", article);
		  if (principal != null) {
			  YComment comment = new YComment();
			  comment.setAuthor_id(authorProxy.getIdByUsername(principal.getName()));
			  comment.setArticle_id(id);
			  model.addAttribute("comment", comment);
		  }
		  return "displayArticle";
		}
		 @GetMapping("/createArticle")
		 public String createArticle(Model model, Principal principal) {
		 	Article article = new Article();
		 	article.setAuthor_id(authorProxy.getIdByUsername(principal.getName()));
		 	model.addAttribute("article", article);
			Iterable<YCategory> categories = categoryProxy.getCategories();
			model.addAttribute("categories", categories);
			
		 	return "formCreateArticle";
		 }
		 @PostMapping("/saveArticle")
		 public ModelAndView saveArticle(@ModelAttribute Article article) {
			if(article.getId() == null) {
		 		articleProxy.createArticle(article);
		 	} else {
		 		articleProxy.updateArticle(article);
		 	}
			return new ModelAndView("redirect:/");
		 }
		 
		 @GetMapping("/updateArticle/{id}")
		 public String updateArticle(@PathVariable int id, Model model) {
		 	Article article = articleProxy.getArticle(id);
		 	model.addAttribute("article", article);
		 	return "formUpdateArticle";
		 }
		// @GetMapping("/deleteArticle/{id}")
		// public ModelAndView deleteArticle(@PathVariable int id) {
		// 	articleProxy.deleteArticle(id);
		// 	return new ModelAndView("redirect:/");
		// }


	// COMMMENT
		// @GetMapping("/deleteComment/{id}")
		// public ModelAndView deleteComment(@PathVariable int id) {
		// 	commentProxy.deleteComment(id);
		// 	return "displayArticle";
		// }
		 @PostMapping("/saveComment")
		 public ModelAndView saveComment(@ModelAttribute YComment comment) {
		 	if(comment.getId() == null) {
		 		commentProxy.createComment(comment);
		 	}
		 	return new ModelAndView("redirect:/article/" + comment.getArticle_id());
		 }


	// AUTHOR
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


	//CATEGORY
		 @GetMapping("/category/{id}")
		 public String displayCategory(@PathVariable int id, Model model) {
		 	YCategory category = categoryProxy.getCategory(id);
		 	model.addAttribute("category", category);
			Iterable<Article> articles = articleProxy.getCategory(id);
		 	model.addAttribute("articles", articles);
		 	return "displayCategory";
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
		// @GetMapping("/deleteCategory/{id}")
		// public ModelAndView deleteCategory(@PathVariable int id) {
		// 	categoryProxy.deleteCategory(id);
		// 	return new ModelAndView("redirect:/");
		// }
}