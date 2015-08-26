/*
 * In The Name Of God
 * ========================================
 * [] File Name : Chest.java
 *
 * [] Creation Date : 26-08-2015
 *
 * [] Created By : Elahe Jalalpour (el.jalalpour@gmail.com)
 * =======================================
*/
/**
 * @author Elahe Jalalpour
 */
package me.elahe.Map;

import me.elahe.jumong.Jumong;

import java.util.Random;

public class Chest extends Item {
	private Random num;
	private int number;

	public Chest() {
		name = "Chest";
		num = new Random();

		number = num.nextInt(3);
		switch (number) {
			case 0:
				match = 0;
				break;
			case 1:
				match = 1;
				break;
			case 2:
				match = 2;
				break;
			case 3:
				match = 3;
				break;

		}

	}

	@Override
	public void use(Jumong j) {
		switch (number) {
			case 0:
				j.getPoint()[Jumong.getX()][Jumong.getY()].items.add(new Shovel());
				break;
			case 1:
				j.getPoint()[Jumong.getX()][Jumong.getY()].items.add(new energyPotion());
				j.getPoint()[Jumong.getX()][Jumong.getY()].items.add(new fireArrow());
				break;
			case 2:
				j.getPoint()[Jumong.getX()][Jumong.getY()].items.add(new stoneBreaker());
				break;
			case 3:
				j.getPoint()[Jumong.getX()][Jumong.getY()].items.add(new reviveScroll());
				break;
		}
	}
}
