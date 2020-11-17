package ch0802.utils;

import java.util.regex.Pattern;

public class CheckUtil {
	/**
	 * 判断是否字符
	 * @param str
	 * @return
	 */
	public static boolean check_str(String str) {
        if(str==null) return false;
        return str.matches("[a-zA-Z]+");

	}
	
	public static boolean check_num(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
	    return pattern.matcher(str).matches();  

	}
	
	/**
	 * 判断是否字符或者数字
	 * @param str
	 * @return
	 */
	public  static boolean isLetterDigit(String str) {
        String regex = "^[a-z0-9A-Z]+$";
        return str.matches(regex);
	}

}
