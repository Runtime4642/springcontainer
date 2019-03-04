package com.douzone.springcontainer;

import java.util.List;

public class User {
	
	private String name="안대혁";
	private Long no;
	private Friend friend;
	private List<String> friends;
	
	@Override
	public String toString() {
		return "User [name=" + name + ", no=" + no + ", friend=" + friend + ", friends=" + friends + "]";
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public User(String name)
	{
		this.name=name;
	}
	
	public User(Long no,String name)
	{
		this.no=no;
		this.name=name;
	}
	
	public User()
	{
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	


	

}
