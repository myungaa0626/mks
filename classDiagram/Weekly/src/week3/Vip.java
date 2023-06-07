package week3;

import java.util.*;
public class Vip extends Customer {
	private int memberNum;

	public Vip(int cutomerNum, int memberNum, String name, String address, String phone) {
		super(cutomerNum, name, address, phone);
		this.memberNum = memberNum;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public String vipInfo() {
		return String.format("%-10d| %-8d| %-12s| %-20s| %s", num, memberNum, name, phone, address);
	}
	
}
