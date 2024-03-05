package chapter06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Video42 {
	public static void main(String[] args) {
		System.out.println("Run video 42 !!!");
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("test01@g.com");
		System.out.println("Input String matches regex - " + matcher.matches());
	}
}
