package de.laura.mains;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {

		System.out.print("start ");
		new RandomTest().run();

	}

	private void run() {
		Random rand = new Random(4);
		for (int i = 0; i < 12; i = i + 4) {
			int r = rand.nextInt(5) + 1;
			System.out.print(r + " ");
		}

	}

}
