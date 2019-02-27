/**
 *
 */
package com.core;

/**
 * @author Satyanarayana.C
 *
 */
public class Student {

	private String name;
	private String className;
	private int rollNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", className=" + className + ", rollNumber=" + rollNumber + "]";
	}

}
