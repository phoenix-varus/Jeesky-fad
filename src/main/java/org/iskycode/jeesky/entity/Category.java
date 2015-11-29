package org.iskycode.jeesky.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "cms_category")
public class Category {
	private String id;
	private String title;
	private String name;
	private String pid;
	private String value;

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
