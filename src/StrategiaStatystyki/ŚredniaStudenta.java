package StrategiaStatystyki;

import Uzytkownik.*;

public class ŚredniaStudenta implements Statystyki {

	public void Oblicz(Uzytkownik [] uzytkownicy, String s) {
		//Metoda oblicza średnią studenta
		for(int i = 0; i < uzytkownicy.length; i++) {
			if(uzytkownicy[i] != null) {
				if(uzytkownicy[i]  instanceof Student) {
					if(uzytkownicy[i].getNazwisko().equals(s)) {
						int [] oceny = ((Student)uzytkownicy[i]).getOceny();
						double srednia = 0;
						int k = 0;
						
						for(int j = 0; j < oceny.length; j++) {
							srednia += oceny[j];
							if(oceny[j] != 0) k++;
						}
						
						if(k != 0) srednia = srednia/k;
						System.out.println("Średnia studenta " + uzytkownicy[i].getImie() +" "+ uzytkownicy[i].getNazwisko() + " wynosi " + srednia + "\n");
					}
				}
			}
		}
	}
	

}
