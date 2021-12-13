package StrategiaStatystyki;

import Uzytkownik.*;

public class ŚredniaStudentówPracownika implements Statystyki {

	public void Oblicz(Uzytkownik[] uzytkownicy, String s) {
		//Metoda oblicza średnią studentów, których uczy ten sam pracownik
		for(int i = 0; i < uzytkownicy.length; i++) {
			if(uzytkownicy[i] != null) {
				if(uzytkownicy[i]  instanceof Pracownik) {
					if(uzytkownicy[i].getNazwisko().equals(s)) {
						Student [] studenci = ((Pracownik)uzytkownicy[i]).getStudenci();
						
						double srednia = 0;
						int n = 0;
						for(int j = 0; j < studenci.length; j++) {
							int [] oceny = studenci[j].getOceny();
							
							for(int l = 0; l < oceny.length; l++) {
								srednia += oceny[l];
								if(oceny[l] != 0) n++;
							}
						}
						
						srednia = srednia/n;
						System.out.println("Średnia studentów, pracownika " + uzytkownicy[i].getImie() +" "+ uzytkownicy[i].getNazwisko() + " wynosi " + srednia + "\n");
					}
				}
			}
		}
	}
	

}
