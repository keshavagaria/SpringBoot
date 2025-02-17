package com.company.course.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.company.course.model.Topic;

@Service
public class TopicService {
	
	List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic(1, "Spring", "Spring Boot"),
			new Topic(2, "Java", "Java Servlet"),
			new Topic(3, "JavaScript", "Angular JS")));
	
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}


	public Topic getTopic(int id) {
		
		return topics.stream().filter(t->t.getId()==id).findFirst().get();
	}


	public String addTopic(Topic topic) {
			topics.add(topic);
		return "Topic Added";
	}


	public String updateTopic(Topic topic, int id) {
		
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId()==id)
			{
				topics.set(i, topic);
			}
		}
		return "Topic Updated";
	}


	public String deleteTopic(int id) {
		
		topics.removeIf(t->t.getId()==id);
		return "Topic Deleted";
	}
}
