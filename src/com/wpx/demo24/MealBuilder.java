package com.wpx.demo24;

public class MealBuilder {

	/**
	 * �߲˺���
	 * @return �͵�
	 */
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	/**
	 * ���⺺��
	 * @return �͵�
	 */
	public Meal prepareNonVeMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
