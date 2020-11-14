package com.aniamadej;

import com.aniamadej.pictures.*;
import com.aniamadej.shapes.CircleShape;
import com.aniamadej.shapes.RectangleShape;
import com.aniamadej.shapes.TriangleShape;

public class Main {

    public static void main(String[] args) {
        Picture picture;

        picture = new BluePicture(new CircleShape());
		picture.draw();

		picture = new BluePicture(new RectangleShape());
		picture.draw();

		picture = new BluePicture(new TriangleShape());
		picture.draw();

		picture = new YellowPicture(new CircleShape());
		picture.draw();

		picture = new YellowPicture(new RectangleShape());
		picture.draw();

		picture = new YellowPicture(new TriangleShape());
		picture.draw();

		picture = new WhitePicture(new CircleShape());
		picture.draw();

		picture = new WhitePicture(new RectangleShape());
		picture.draw();

		picture = new WhitePicture(new TriangleShape());
		picture.draw();

		picture = new GreenPicture(new CircleShape());
		picture.draw();

		picture = new GreenPicture(new RectangleShape());
		picture.draw();

		picture = new GreenPicture(new TriangleShape());
		picture.draw();
    }
}
