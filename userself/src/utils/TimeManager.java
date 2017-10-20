package utils;

public class TimeManager {

	public static String timeManager(String str){
		String newStr = str.substring(5, str.length()-5);
		return newStr;
	}
	public static String timeyyyyMMdd(String str){
		String newStr = str.substring(0, str.length()-11);
		return newStr;
	}
}
