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

	/**
	 * ��������ֻ�����
	 */
	public static String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153,180,177"
			.split(",");

	public static String getTel() {
		int i = (int) (Math.random() * 20);
		int index1 = (int) (Math.random() * 9000) + 1000;
		int index2 = (int) (Math.random() * 9000) + 1000;
		String first = telFirst[i];
		String second = String.valueOf(index1);
		String thrid = String.valueOf(index2);
		return first + second + thrid;
	}

}
