package com.example.demo.entity;

public class Board {
  private String url;//網址
  private String nameCN;//中文
  private String nameEN;//英文
  private Boolean adultCheck;//驗證
public Board(String url, String nameCN, String nameEN, Boolean adultCheck) {
	this.url = url;
	this.nameCN = nameCN;
	this.nameEN = nameEN;
	this.adultCheck = adultCheck;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getNameCN() {
	return nameCN;
}
public void setNameCN(String nameCN) {
	this.nameCN = nameCN;
}
public String getNameEN() {
	return nameEN;
}
public void setNameEN(String nameEN) {
	this.nameEN = nameEN;
}
public Boolean getAdultCheck() {
	return adultCheck;
}
public void setAdultCheck(Boolean adultCheck) {
	this.adultCheck = adultCheck;
}
@Override
public String toString() {
	return "Borad [url=" + url + ", nameCN=" + nameCN + ", nameEN=" + nameEN + ", adultCheck=" + adultCheck + "]";
}
  
}
