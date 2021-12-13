package StrategiaMenu;

import Uzytkownik.Pracownik;
import Uzytkownik.Student;
import Uzytkownik.Uzytkownik;

public class MenuPracownika implements Menu {

	public void Menu(Uzytkownik[] uzytkownicy, Uzytkownik ob) {
		//Po zalogowaniu na konto typu pracownik, użytkownik ma takie możliwości:
				boolean wylacz = false;
				Student [] studenci = ((Pracownik) ob).getStudenci();
				
				while(wylacz == false) {
					System.out.println("\n" + ob);
					System.out.println("\n Dzień dobry " +ob.getImie() + ". Co chcesz zrobić?");
					System.out.println("1) Zobacz statystyki danego studenta");
					System.out.println("2) Zobacz statystyki danego pracownika");
					System.out.println("3) Sprawdź oceny danego studenta");
					System.out.println("4) Wpisz oceny z przedmiotu");
					System.out.println("5) Wyloguj się");
					int wybor = scanner.nextInt();
					
					switch(wybor) {
					case 1:
						for(int i = 0; i < studenci.length; i++) {
							System.out.println(studenci[i]);	
						}
						
						System.out.println("\n Wpisz nazwisko studenta, którego średnią ocen chcesz zobaczyć");
						String n1 = scanner.next();
						
						sredniaStudenta.Oblicz(uzytkownicy, n1);
						break;
					case 2:
						for(int i = 0; i < uzytkownicy.length; i++) {
							if(uzytkownicy[i] instanceof Pracownik) System.out.println(uzytkownicy[i]);	
						}
						
						System.out.println("\n Wpisz nazwisko pracownika, którego średnią ocen studentów chcesz zobaczyć");
						String n2 = scanner.next();
						
						sredniaPracownika.Oblicz(uzytkownicy, n2);
						break;
					case 3:
						for(int i = 0; i < studenci.length; i++) {
							System.out.println(studenci[i]);	
						}
						System.out.println("\n Wpisz nazwisko studenta, którego oceny chcesz zobaczyć");
						String n3 = scanner.next();
						
						ocenyPokaz.Oceny(uzytkownicy, n3, 0);
						break;
					case 4:	
						for(int i = 0; i < studenci.length; i++) {
							System.out.println(studenci[i]);	
						}
						
						System.out.println("\n Wpisz nazwisko studenta, któremu chcesz wpisać ocene");
						String n4 = scanner.next();
						System.out.println("Wpisz ocene");
						int o = scanner.nextInt();
						
						ocenyWpisz.Oceny(uzytkownicy, n4, o);
						break;
					case 5:
						System.out.println("Wylogowano");
						wylacz = true;
						break;
					default:
						System.out.println("Nie rozpoznaje tej komendy");
					}
				}
	}


}
