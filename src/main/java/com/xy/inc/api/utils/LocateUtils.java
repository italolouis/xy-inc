package com.xy.inc.api.utils;

public class LocateUtils {
	
	public static double calculaDistancia(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}

}
