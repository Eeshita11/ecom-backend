package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Comment;
import com.example.service.CommentService;

@RestController
public class CommentController 
{
	  @Autowired
	   private CommentService commentService;

	   @PostMapping("/savecomments")
	    public ResponseEntity<Comment> savecomment(@RequestBody Comment comment)
	   {
	       return new ResponseEntity<Comment>(commentService.savecomment(comment),HttpStatus.CREATED);
	   }
	   @GetMapping(value="/getcomments")
	    public ResponseEntity<List<Comment>> showallcomments()
	   {
	      List<Comment> allcomments=commentService.showallcomments();
	      return new ResponseEntity<List<Comment>>(allcomments, HttpStatus.OK);
	   }

}
