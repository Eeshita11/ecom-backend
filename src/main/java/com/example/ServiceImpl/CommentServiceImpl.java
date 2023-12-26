package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Comment;
import com.example.repository.CommentRepository;
import com.example.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService
{
	@Autowired
	private CommentRepository commentRepository;
   
	@Override
	public Comment savecomment(Comment comment) 
	{
		 return commentRepository.save(comment);
	}

	@Override
	public List<Comment> showallcomments() 
	{
		return commentRepository.findAll();
	}
	

}
