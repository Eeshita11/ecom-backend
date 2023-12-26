package com.example.service;

import java.util.List;

import com.example.model.Comment;

public interface CommentService 
{
	    Comment savecomment(Comment comment);

	    List<Comment> showallcomments();
}
