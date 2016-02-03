package com.chuan.blockingqueue.Priority;

public class PriorityEntity implements Comparable<PriorityEntity> {
	private static int count = 0;
	private int id = count++;
	private int priority;
	private int index = 0;

	public PriorityEntity(int _priority, int _index) {
		this.priority = _priority;
		this.index = _index;
	}

	public String toString() {
		return id + "# [index=" + index + " priority=" + priority + "]";
	}

	// 数字小，优先级高
	public int compareTo(PriorityEntity o) {
		return this.priority > o.priority ? 1 : this.priority < o.priority ? -1 : 0;
	}

	// 数字大，优先级高
	// public int compareTo(PriorityTask o) {
	// return this.priority < o.priority ? 1
	// : this.priority > o.priority ? -1 : 0;
	// }
}