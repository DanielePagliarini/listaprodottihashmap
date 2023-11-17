package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> listaProdotti=new HashMap<>() {
		{
		 put(1, "pane");
		 put(2, "pasta");
         put(3, "biscotti");
		 put(4, "formaggio");
		 put(5, "mortadella");
		}};
		HashMap<Integer, Float> prezzoProdotti=new HashMap<>() {
			{
		 put(1, 4f);
		 put(2, 2f);
         put(3, 3f);
		 put(4, 6.50f);
		 put(5, 10f);
		}};
		double prezzo,quantità;
		String altroProdotto;
		int posizione, i, codiceProdotto;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("inserisci codice prodotto (1,2,3,4,5)");
			codiceProdotto= Integer.parseInt(sc.nextLine());
			if (listaProdotti.containsKey(codiceProdotto)) 
			{
				System.out.println("Stai acquistando " + listaProdotti.get(codiceProdotto));
				System.out.println("quanto ne vuoi?");
				quantità=Float.parseFloat(sc.nextLine());
				prezzo = quantità * prezzoProdotti.get(codiceProdotto);
				System.out.println("il prezzo è : " + String.format("%0.2d", prezzo));
				}
			else System.out.println("prod non disp");
				
			System.out.println("vuoi altro?");
			altroProdotto=sc.nextLine();
			altroProdotto= altroProdotto.toLowerCase();
			}
	 while(altroProdotto.equals("si"));
		
		
				
	
	}
		
}


