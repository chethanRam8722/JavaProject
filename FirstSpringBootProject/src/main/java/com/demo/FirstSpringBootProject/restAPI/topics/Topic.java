package com.demo.FirstSpringBootProject.restAPI.topics;


public class Topic {
	
	private String topicId;
	private String name;
	private String discription;
	
	
	public Topic() {
		
	}
	public Topic(String topicId, String name, String discription) {
		super();
		this.topicId = topicId;
		this.name = name;
		this.discription = discription;
	}
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	

}
