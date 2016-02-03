package cn.tootoo.reference;

import java.lang.ref.WeakReference;

public class TestWeakReference {
	public static void main(String[] args) {
		Car car = new Car(1888888, "silver");
		WeakReference<Car> weakCar = new WeakReference<Car>(car);
		int i = 0;
		while (true) {
			if (weakCar.get() != null) {
				i++;
				new Car(i, "asdf");
				System.out.println("Object is alive for " + i + " loops-" + weakCar);
			} else {
				System.out.println("Object has been collected");
				break;
			}
		}
	}
}
