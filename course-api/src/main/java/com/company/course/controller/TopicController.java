package com.company.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.course.model.Topic;
import com.company.course.service.TopicService;

@RestController
public class TopicController {
	
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{ID}")
	public Topic getTopic(@PathVariable("ID") int id)
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/topics")
	public String addTopic(@RequestBody Topic topic)
	{
		return topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/topics/{ID}")
	public String updateTopic(@RequestBody Topic topic,@PathVariable("ID") int id)
	{
		return topicService.updateTopic(topic,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}")
	public String deleteTopic(@PathVariable int id)
	{
		return topicService.deleteTopic(id);
	}

}
