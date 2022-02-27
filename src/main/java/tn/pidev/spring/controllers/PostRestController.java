package tn.pidev.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.pidev.spring.entities.Post;
import tn.pidev.spring.services.IPostService;

@RestController
public class PostRestController  {
	@Autowired
	IPostService ips;
	@PostMapping("addPost")
	public void addPost(@RequestParam("idEmployee") Long idEmployee, @RequestBody Post post){
		ips.addPost(idEmployee,post);	
	}
	@GetMapping("selectPost")
	public List<Post> selectPost(){
		return ips.selectPost();
	}
	@DeleteMapping("deletePost")
	public void deletePost(@RequestParam("idPost") Long idPost,@RequestParam("idEmployee") Long idEmployee){
		ips.deletePost(idPost,idEmployee);
	}
	@PutMapping("editPost")
	public void editPost(@RequestBody Post post){
		ips.editPost(post);	
	}
	
	@GetMapping("getMyPosts")
	public List<Post> getMyPosts(@RequestParam("idEmployee") Long idEmployee){
		return ips.getMayPosts(idEmployee);
	}
	
	@PostMapping("addLike")
	public void addLike(@RequestParam("idEmployee") Long idEmployee,@RequestParam("idPost")Long idPost){
		ips.addLike(idEmployee, idPost);
	}
	
}