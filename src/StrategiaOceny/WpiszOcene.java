package StrategiaOceny;

import Uzytkownik.*;

public class WpiszOcene implements Oceny {

	public void Oceny(Uzytkownik [] uzytkownicy, String s, int o) {
		// Metoda pozwala Pracownikowi dodawać ocene studentowi
				for(int i = 0; i < uzytkownicy.length; i++) {
					if(uzytkownicy[i] != null) {
						if(uzytkownicy[i]  instanceof Student) {
							if(uzytkownicy[i].getNazwisko().equals(s)) {
								int [] oceny = ((Student)uzytkownicy[i]).getOceny();
								for(int j = 0; j < oceny.length; j++) {
									if(oceny[j] == 0) {
										((Student)uzytkownicy[i]).dodajOcene(j, o);
										break;
									}	
								}
							}
						}
					}
				}
	}
}
