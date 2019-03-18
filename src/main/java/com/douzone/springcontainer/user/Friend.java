package com.douzone.springcontainer.user;

public class Friend {
	
	private String name;
	private Long no;
	
	public Friend()
	{
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", no=" + no + "]";
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Friend(String name)
	{
		this.name=name;
	}
	
	public Friend(Long no,String name)
	{
		this.no=no;
		this.name=name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	

}
