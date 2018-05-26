package com.demo.FirstSpringBootProject.restAPI.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {

//private TopicRepository topicRepository;

private ArrayList<Topic> topics = new ArrayList<Topic>();
	public void add(Topic topic) {
		topics.add(topic);
		
	}
	public List<Topic> getAllTopics() {
		return topics;
	}
	public void delete(String topicId) {
		for (Topic topic : topics) {
			if( topic.getTopicId().equals(topicId))
				topics.remove(topic);
		}
	}
	
	public void update( Topic updatetopic, String topicId ) {
		for (Topic topic : topics) {
			int index = topics.indexOf(topic);
			if( topicId.equals(topic.getTopicId())) {
				topics.remove(index);
			topics.add(updatetopic);
			}
		}
		
	}
}
