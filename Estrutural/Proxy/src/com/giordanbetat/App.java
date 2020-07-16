package com.giordanbetat;

import com.giordanbetat.proxy.Image;
import com.giordanbetat.proxy.ProxyImage;

public class App {

	public static void main(String[] args) {
		Image image1 = new ProxyImage("photo_jpg");
		
		Image image2 = new ProxyImage("photo_pgn");
		
		image1.displayImage();		
		image2.displayImage();
		
		image1.displayImage();
		image2.displayImage();
	}
	
}
