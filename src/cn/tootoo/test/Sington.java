package cn.tootoo.test;

public class Sington {
	private static Sington sington = null;

	private Sington() {
	}

	public static synchronized Sington getInstance() {
		if (sington == null) {
			sington = new Sington();
		}
		return sington;
	}
}
