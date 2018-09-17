package com.majnu.spring.springcore.reftypes;

public class Student 
{
	public Student(Scores scores) {
		super();
		this.scores = scores;
	}

	private Scores scores;

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [ds=" + scores.getDs() + " oops=" + scores.getOops() + "C= " + scores.getC() +"]";
	}
}
