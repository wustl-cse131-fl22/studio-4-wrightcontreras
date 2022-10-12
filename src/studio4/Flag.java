package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StdDraw.setPenColor(0, 200 , 255);
		StdDraw.rectangle(.5,.5, .3,.2);
		StdDraw.setPenColor(0, 200 , 255);
		StdDraw.filledRectangle(.5, .5, .3,.1);
		StdDraw.setPenColor(120, 10, 0);
		StdDraw.filledRectangle(.6, .6, .1,.1);
		double [] x = {.3,.2,.2};
		double [] y = {.3, .7, .4};
		StdDraw.filledPolygon (x, y);
		
	}
}