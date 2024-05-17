package com.driver;

public class Group {
	private String name;
	private int numberOfParticipants;

	public Group() {

	}

	public Group(String name, int numberOfParticipants) {
		super();
		this.name = name;
		this.numberOfParticipants = numberOfParticipants;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfParticipants() {
		return numberOfParticipants;
	}

	public void setNumberOfParticipants(int numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
	}

	@Override
	public String toString() {
		return "Group [name=" + name + ", numberOfParticipants=" + numberOfParticipants + "]";
	}

}