package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
public class SampleHotel {
	private Chef chef;
	
	public void SampleHote(Chef chef) {
		
		this.chef = chef;
	}
}
