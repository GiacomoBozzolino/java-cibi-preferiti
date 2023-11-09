package org.lessons.java.array;

public class CibiPreferiti {
	public static void main (String[] Args) {
		String [] favoriteFoods = {"gelato", "pasta", "pizza", "risotto", "cioccolato", "prosciutto"};
		
		System.out.println("Ho"+ " " + favoriteFoods.length + " " + "cibi preferiti.");
		
		System.out.println("Il mio cibo preferito in assoluto è il"  + " " + favoriteFoods[0]);
		
		System.out.println("Il mio cibo preferito, ma meno degli altri è il" + " " + favoriteFoods[favoriteFoods.length - 1]);
		
//		Bonus: Stampate a video anche il cibo di mezza classifica
		
		int intAvarageFood = favoriteFoods.length / 2;
        System.out.println("Il cibo di mezza classifica è il" + " " + favoriteFoods[intAvarageFood]);
		
	}

}
