package tn.pidev.spring.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.pidev.spring.entities.Comment;
import tn.pidev.spring.entities.Employee;
import tn.pidev.spring.entities.Likee;
import tn.pidev.spring.entities.Post;
import tn.pidev.spring.repositories.CommentRepository;
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
	@Autowired
	CommentRepository cr;
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
	public void addLikeDislike(Long idEmployee, Long idPost) {
		
		Likee like=lr.findByIdEmployeeIdPost(er.findById(idEmployee).orElse(new Employee()), pr.findById(idPost).orElse(new Post())).orElse(new Likee())    ;
		if(like.getId()==null){
			like.setPost(pr.findById(idPost).get());
			like.setEmployee(er.findById(idEmployee).get());
			like.setDateLike(new Date());
			lr.save(like);
		}
		else{
			lr.delete(like);
		}
	}
	@Override
	public int likeNumberByPost(Long idPost) {
		Post post=pr.findById(idPost).orElse(new Post());
		if(post.getIdPost()==null){
			return -1;
		}
		return lr.likeNumberByPost(post);
	}
	@Override
	public Post postMaxLike() {
		List<Post> allPosts=(List<Post>)pr.findAll();
		int nbrLike=0;
		Post post=new Post();
		if(!allPosts.isEmpty()){
			for(Post p:allPosts){
				if(p.getLikes().size()>nbrLike){
					nbrLike=p.getLikes().size();
					post=p;
				}
			}
		}
		return post;
	}
	@Override
	public List<Post> trierPostByDate() {
		List<Post> allPosts=(List<Post>)pr.findAll();
		if(!allPosts.isEmpty()){
			allPosts.sort((p1,p2) -> -(p1.getDatePost().compareTo(p2.getDatePost())));
		}
		return allPosts;
	}
	@Override
	public List<Post> trierPostByNbrLike() {
		List<Post> allPosts=(List<Post>)pr.findAll();
		if(!allPosts.isEmpty()){
			allPosts.sort((p1,p2) -> -(p1.getLikes().size()-p2.getLikes().size()));
		}
		return allPosts;
	}
	@Override
	public Comment addComment(Long idEmployee, Long idPost,Comment comment) {
		comment.setEmployee(er.findById(idEmployee).get());
		comment.setPost(pr.findById(idPost).get());
		comment.setDatePost(new Date());
		return cr.save(comment);
	}
	@Override
	public Comment deleteComment(Long idComment, Long idEmployee) {
		Comment comm=cr.findById(idComment).orElse(new Comment());
		Employee employee=er.findById(idEmployee).orElse(new Employee());
		if(comm.getEmployee()==employee){
			cr.delete(comm);
		}
		return comm;
	}
	@Override
	public Comment updateComment(Long idComment, Long idEmployee, Comment comment) {
		Comment commTest=cr.findById(idComment).orElse(new Comment());
		Employee employee=er.findById(idEmployee).orElse(new Employee());
		if(commTest.getEmployee()==employee){
			comment.setIdComment(commTest.getIdComment());
			comment.setDatePost(commTest.getDatePost());
			comment.setEmployee(commTest.getEmployee());
			comment.setPost(commTest.getPost());
		}
		return cr.save(comment);
	}
	
	
	
	
	
	
	
}