package org.jvmstudy.ch4;

public class Ch4_2_7 {
	int a = 1;
	static int b = 2;
	
	public int sum(int c){
		return a + b + c;
	}
	
	public static void main(String[] args) {
		new Ch4_2_7().sum(3);
	}
}
