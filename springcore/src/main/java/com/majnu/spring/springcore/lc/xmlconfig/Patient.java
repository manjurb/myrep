package com.majnu.spring.springcore.lc.xmlconfig;

public class Patient {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "Patient [id=" + id + "]";
}

public void hi()
{
	System.out.println("Inside Hi");
}
public void bye()
{
	System.out.println("Inside bye");
}
}
