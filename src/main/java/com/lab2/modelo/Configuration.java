package com.lab2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "configuration")
public class Configuration extends AuditModel {
	private static final long serialVersionUID = 1284395170500251836L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="configuration_id")
	
	private int id;
	@Column(name = "img1")
	private String img1;
	
	@Column(name = "txt1")
	private String txt1;
	
	@Column(name = "img2")
	private String img2;
	
	@Column(name = "txt2")
	private String txt2;
	
	@Column(name = "img3")
	private String img3;
	
	@Column(name = "txt3")
	private String txt3;

	@Column(name = "twitter")
	private String twitter;

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getTxt1() {
		return txt1;
	}

	public void setTxt1(String txt1) {
		this.txt1 = txt1;
	}

	public String getImg2() {
		return img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public String getTxt2() {
		return txt2;
	}

	public void setTxt2(String txt2) {
		this.txt2 = txt2;
	}

	public String getImg3() {
		return img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	public String getTxt3() {
		return txt3;
	}

	public void setTxt3(String txt3) {
		this.txt3 = txt3;
	}
	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public void setId( int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	
}
