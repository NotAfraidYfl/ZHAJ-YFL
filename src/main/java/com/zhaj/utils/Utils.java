package com.zhaj.utils;

import java.util.UUID;

public class Utils {
	/**
	 * ��װJDK�Դ���UUID, ͨ��Random��������, �м���-�ָ�.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
	}

	/**
	 * ��װһ������0����1�������
	 */
	public static int oneOrZero() {
		int rd = Math.random() > 0.5 ? 1 : 0;
		return rd;
	}

}
