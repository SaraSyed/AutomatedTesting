package com.qa.quickstart.maven_archetype_quickstart;

public class BlackJack {
	public int play(int a, int b) {
		if (a > 21) {
			if (b > 21)
				return 0;
			return b;
		}
		if (a < b && b <= 21)
			return b;
		return a;
	}

}
