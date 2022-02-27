package tn.pidev.spring.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.pidev.spring.entities.Employee;
import tn.pidev.spring.entities.Like;
import tn.pidev.spring.entities.Post;
import tn.pidev.spring.repositories.EmployeeRepository;
import tn.pidev.spring.repositories.LikeRepositoy;
import tn.pidev.spring.repositories.PostRepository;

@Service
public class PostService implements IPostService {
	@Autowired
	PostRepository pr;
	@Autowired
	EmployeeRepository er;
	@Autowired
	LikeRepositoy lr;
	@Override
	public void addPost(Long idEmployee, Post post) {
		Employee employee=er.findById(idEmployee).get();
		post.setEmployee(employee);
		post.setDatePost(new Date());
		pr.save(post);
		
	}
	@Override
	public List<Post> selectPost() {
		return (List<Post>)pr.findAll();
	}
	@Override
	public void deletePost(Long id,Long idEmployee) {
		Post p=pr.findById(id).get();
		if(p.getEmployee()==er.findById(idEmployee).get()){
			pr.deleteById(id);
		}
	}
	@Override
	public void editPost(Post post) {
		pr.save(post);
	}
	@Override
	public List<Post> getMayPosts(Long idEmployee) {
		
		return er.findById(idEmployee).get().getPosts();
	}
	@Override
	public void addLike(Long idEmployee, Long idPost) {
		Like like=new Like();
		like.setPost(pr.findById(idPost).get());
		like.setEmployee(er.findById(idEmployee).get());
		lr.save(like);
	}
	
}