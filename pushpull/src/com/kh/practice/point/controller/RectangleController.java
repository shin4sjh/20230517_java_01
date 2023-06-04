package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		return "면적 : " + x + "," + y + "," + height + "," + width + "/" + (height * width);
	}

	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		return "둘레 : " + x + "," + y + "," + height + "," + width + "/" + (x * y);
	}

}