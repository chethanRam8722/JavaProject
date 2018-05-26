package com.demo.FirstSpringBootProject.restAPI.topics;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TopicController {

	@Autowired
	private TopicsService topicService;
	@RequestMapping( method = RequestMethod.GET, value = "/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics()    ;
	}

	@RequestMapping (method = RequestMethod.POST, value = "/topic" )
	public void save(@RequestBody Topic topic) {
		topicService.add(topic);
	}
	@RequestMapping (method = RequestMethod.DELETE, value = "/topic{id}" )
	public void delete(@PathVariable("id") String topicId) {
		topicService.delete(topicId);
	}
	
	
	@RequestMapping (method = RequestMethod.PUT, value = "/topic{id}" )
	public void update(@PathVariable("id") String topicId , @RequestBody Topic topic) {
		topicService.update(topic, topicId);
	}
}
