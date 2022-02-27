package tn.pidev.spring.services;

import java.util.List;

import tn.pidev.spring.entities.Like;
import tn.pidev.spring.entities.Post;

public interface IPostService {
	void addPost(Long idEmployee, Post post);
	List<Post> selectPost();
	void deletePost(Long id,Long idEmployee);
	void editPost(Post post);
	List<Post> getMayPosts(Long idEmployee);
	void addLike(Long idEmployee, Long idPost);
}