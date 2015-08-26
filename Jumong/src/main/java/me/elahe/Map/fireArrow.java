/*
 * In The Name Of God
 * ========================================
 * [] File Name : fireArrow.java
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

public class fireArrow extends Item {
	public fireArrow() {
		name = "fireArrow";
	}

	@Override
	public void use(Jumong j) {
//      Iterator it=j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.iterator();
//        while(it.hasNext())
//        {
//            it.next();
//            it.remove();
//            break;
//        }

		if (Jumong.getX() > 0 && Jumong.getX() < 22 && Jumong.getY() > 0 && Jumong.getY() < 22) {
			j.getPoint()[Jumong.getX() + 1][Jumong.getY()].setIswall(false);

			j.getPoint()[Jumong.getX() - 1][Jumong.getY()].setIswall(false);

			j.getPoint()[Jumong.getX()][Jumong.getY() - 1].setIswall(false);

			j.getPoint()[Jumong.getX()][Jumong.getY() + 1].setIswall(false);
		}
	}
}
