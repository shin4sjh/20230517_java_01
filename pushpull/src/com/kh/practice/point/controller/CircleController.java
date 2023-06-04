package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return "원 넓이 : " + x + "," + y + "," + radius + "/" + (double) (radius * (3.14 * 3.14));
	}

	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius); 
		return "원 둘레: " + x + "," + y + "," + radius + "/" + (double) (2 * 3.14 * radius);
	}
}
