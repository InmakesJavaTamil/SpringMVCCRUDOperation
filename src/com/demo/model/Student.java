package com.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Student")
public class Student implements Serializable 
{
	@Id
	@Column(name="studentid")
	@GenericGenerator(name="ref",strategy="increment")
	@GeneratedValue(generator="ref")
	private int sid;
	
	@Column(name="studentname")
	private String sname;
	
	@Column(name="age")
	private int sage;
	
	@Column(name="address")
	private String saddress;
	
	@Column(name="course")
	private String scourse;
	public Student() 
	{
		System.out.println("Student Object Created");
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	
}
