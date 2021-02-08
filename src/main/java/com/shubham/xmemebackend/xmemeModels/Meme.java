package com.shubham.xmemebackend.xmemeModels;

public class Meme {

	private int id;
	private String name;
	private String url;
	private String caption;
	
	public Meme(String name, String url, String caption) {
		super();
		this.name = name;
		this.url = url;
		this.caption = caption;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
}
