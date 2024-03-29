package com.vanuchatserver.service;

import java.util.List;

import com.vanuchatserver.model.*;

public interface BlogPostService
{
	List<Blog> findAll();
	List<Blog> findLatest5();
	Blog findById(int id);
	void create(Blog post);
	void edit(Blog post);
	void deleteById(int id);
	void postComment(BlogComments comments);
	List<BlogComments> showcomment(int id);
}