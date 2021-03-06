/*
 * In The Name Of God
 * ========================================
 * [] File Name : Item.java
 *
 * [] Creation Date : 26-08-2015
 *
 * [] Created By : Elahe Jalalpour (el.jalalpour@gmail.com)
 * =======================================
*/
/**
 * @author Elahe Jalalpour
 */
package me.elahe.jumong.items;

import me.elahe.jumong.Jumong;

public abstract class Item {
	public String name;
	public int match = 0;

	public abstract void use(Jumong jumong);

}