package StrategiaOceny;

import Uzytkownik.*;

public class WyswietlOceny implements Oceny {

	public void Oceny(Uzytkownik [] uzytkownicy, String s, int o) {
		// Metoda wyświetla oceny konkretnego studenta
				for(int i = 0; i < uzytkownicy.length; i++) {
					if(uzytkownicy[i] != null) {
						if(uzytkownicy[i]  instanceof Student) {
							if(uzytkownicy[i].getNazwisko().equals(s)) {
								int [] oceny = ((Student)uzytkownicy[i]).getOceny();
								if(oceny[0] == 0) System.out.print("Nie ma wpisanych jeszcze żadnych ocen");
								else {
									for(int j = 0; j < oceny.length; j++) {
										if(oceny[j] != 0) {
											System.out.print("Oceny " +uzytkownicy[i].getNazwisko() + ": "+ oceny[j] + ", ");
										}
									}
								}
								System.out.print("\n\n");
							}
						}
					}
				}
	}
	
}
