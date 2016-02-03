package cn.tootoo.test;

import java.awt.Dimension;

public class Example {
	static final public int TOTAL_VALUES = 10;
	private Dimension[] d = new Dimension[TOTAL_VALUES];

	public Example() {
	}

	public synchronized void setValues(int index, int height, int width)
			throws IllegalArgumentException {
		if (d[index] == null)
			d[index] = new Dimension();
			d[index].height = height;
			d[index].width = width;
	}

	public synchronized Dimension[] getValues()
			throws CloneNotSupportedException {
		return (Dimension[]) d.clone();
	}
}
