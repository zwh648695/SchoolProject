package com;

public class School {

	private String name;
	private int chi;
	private int eng;
	private int math;
	private int sum;
	
	public School(String name, int chi, int eng, int math) {
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		this.math = math;
		sum = chi + eng + math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChi() {
		return chi;
	}

	public void setChi(int chi) {
		this.chi = chi;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}
	
	String show()
	{
		return "姓名："+getName()+
				"\n國文："+getChi()+
				"\n英文："+getEng()+
				"\n數學："+getMath()+
				"\n總分："+getSum();
	}
	
	String Success()
	{
		return this.show()+"\n成績達標，恭喜錄取";
	}
	
	String sumError()
	{
		return this.show()+"\n總分未達200，不予錄取";
	}
	
	String engError()
	{
		return this.show()+"\n英文未達75，不予錄取";
	}
	
}
