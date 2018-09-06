package com.majnu.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile 
{
	@Value("JAVA DEVELOPER")
	private String title;
	
	@Value("CSS Corp")
	private String Company;
	
	@Override
	public String toString() {
		return "Profile [title=" + title + ", Company=" + Company + "]";
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
