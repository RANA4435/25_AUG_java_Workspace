package com.cloning.deepcloning2;

public class Project implements Cloneable {
	String projectName;
	int projectDuration;
	Company company;
	public Project(String projectName, int projectDuration, Company company) {
		super();
		this.projectName = projectName;
		this.projectDuration = projectDuration;
		this.company = company;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Project project = (Project) super.clone();
		project.company =(Company) company.clone();
		return project;
	}

}
