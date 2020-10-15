package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="college_table")
public class College {
	
	@Id
	@Column(name="clgid")
	private int clgid;
	
	@Column(name="clgname")
	private String clgname;
	
	@Column(name="clgloc")
	private String clgloc;
	
	@Column(name="clgphn")
	private int clgphn;

	public int getClgid() {
		return clgid;
	}

	public void setClgid(int clgid) {
		this.clgid = clgid;
	}

	public String getClgname() {
		return clgname;
	}

	public void setClgname(String clgname) {
		this.clgname = clgname;
	}

	public String getClgloc() {
		return clgloc;
	}

	public void setClgloc(String clgloc) {
		this.clgloc = clgloc;
	}

	public int getClgphn() {
		return clgphn;
	}

	public void setClgphn(int clgphn) {
		this.clgphn = clgphn;
	}

	@Override
	public String toString() {
		return "College [clgid=" + clgid + ", clgname=" + clgname + ", clgloc=" + clgloc + ", clgphn=" + clgphn + "]";
	}

	
}
