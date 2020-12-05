package com.Entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name="notes")
public class Note {
	@Id
	private int id;
	private String titile;
	@Column(length=2000)
	private String content;
	private Date Dateinfo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDateinfo() {
		return Dateinfo;
	}
	public void setDateinfo(Date dateinfo) {
		Dateinfo = dateinfo;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Note(String titile, String content, Date dateinfo) {
		super();
		this.id = new Random().nextInt();
		this.titile = titile;
		this.content = content;
		Dateinfo = dateinfo;
	}
	

}
