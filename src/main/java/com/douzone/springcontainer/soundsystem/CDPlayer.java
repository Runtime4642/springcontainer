package com.douzone.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CDPlayer {
	
	//와이어링1
	//@Autowired
	private CompactDisc cd;
	
	//와이어링2
	//@Autowired
	private CDPlayer(CompactDisc cd) {
		this.cd=cd;
	}
	
	public CDPlayer() {
		
	}
	
	//와이어링3
	//@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.cd=cd;
	}

	//와이어링4 아무이름이나 해도 되는거임
	@Autowired
	public void asdsadsadqwe(CompactDisc cd) {
		this.cd=cd;
	}
	
	public void play() {
		cd.play();
	}
}
