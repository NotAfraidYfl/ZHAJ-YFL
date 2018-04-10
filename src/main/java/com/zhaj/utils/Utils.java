package com.zhaj.utils;

import java.util.UUID;

public class Utils {
	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
	}

	/**
	 * 封装一个生成0或者1的随机数
	 */
	public static int oneOrZero() {
		int rd = Math.random() > 0.5 ? 1 : 0;
		return rd;
	}

}
