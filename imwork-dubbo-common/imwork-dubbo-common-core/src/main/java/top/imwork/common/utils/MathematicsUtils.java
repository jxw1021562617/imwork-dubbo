package top.imwork.common.utils;

import java.math.BigDecimal;

public class MathematicsUtils {
	/**
	 * 将double数据保留任意位数
	 * @param digit
	 * @param number
	 * @return
	 */
	public static double getDecimalsDigit(int digit,double number){
		BigDecimal b = new BigDecimal(number); 
		return b.setScale(digit,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
