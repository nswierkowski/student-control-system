package SystemObslugiStudiow;

import Uzytkownik.*;
import java.util.Scanner;
import StrategiaStatystyki.*;
import StrategiaOceny.*;
import StrategiaMenu.*;

public class SystemObslugiStudiow {

	Uzytkownik [] uzytkownicy = new Uzytkownik[50];
	Scanner scanner = new Scanner(System.in);
//	Statystyki sredniaStudenta = new ŚredniaStudenta();
//	Statystyki sredniaPracownika = new ŚredniaStudentówPracownika();
//	Oceny ocenyPokaz = new WyswietlOceny();
//	Oceny ocenyWpisz = new WpiszOcene();
	Menu menuStudent = new MenuStudent();
	Menu menuPracownik = new MenuPracownika();
	
	public SystemObslugiStudiow() {		
		uzytkownicy[0] = new Student("studentJeden", "studentJeden", "Ignacy", "Kowalski", "budownictwo");
		uzytkownicy[1] = new Student("studentDwa", "studentDwa", "Jakub", "Nowak", "informatyka stosowana");
		uzytkownicy[2] = new Student("studentTrzy", "studentTrzy", "Michał", "Wiśniewski", "cyberbezpieczeństwo");
		uzytkownicy[3] = new Student("studentCztery", "studentCztery", "Adam", "Gruszka", "informatyka stosowana");
		
		Student [] s1 = new Student [3];
		s1[0] = (Student)uzytkownicy[1];
		s1[1] = (Student)uzytkownicy[2];
		s1[2] = (Student)uzytkownicy[3];
		uzytkownicy[4] = new Pracownik("pracownikJeden", "pracownikJeden", "Władysław", "Nowicki", "PSIO", s1);
		
		Student [] s2 = new Student [1];
		s1[0] = (Student)uzytkownicy[0];
		uzytkownicy[5] = new Pracownik("pracownikDwa", "pracownikDwa", "Bartosz", "Zebra", "Analiza Matematyczna", s2);
	}
	
	public static void main(String[] args) {
		SystemObslugiStudiow jsos = new SystemObslugiStudiow();
		Scanner scanner = new Scanner(System.in);
		boolean wylacz = false;
		int wybor;
		
		while(wylacz == false) {
			System.out.println("\n Witamy w systemie obsługi studiów! Wybierz działanie: ");
			System.out.println("1) Zaloguj się na swoje konto SOS ");
			System.out.println("2) Wyjdź");
			wybor = scanner.nextInt();
			
			switch(wybor) {
				case 1:
					jsos.ZalogujSie();
					break;
				case 2:
					System.out.println("Do widzenia!");
					wylacz = true;
					break;
				default:
					System.out.println("Nie rozpoznaje tej komendy");
			}
		}
	}

	public void ZalogujSie() {		
		System.out.println("Wpisz login");
		String l = scanner.next();
		System.out.println("Wpisz hasło");
		String h = scanner.next();

		for(int i = 0; i < uzytkownicy.length; i++) {
			if(uzytkownicy[i] != null) {
				if(l.equals(uzytkownicy[i].getLogin())) {
					if(h.equals(uzytkownicy[i].getHaslo())) {
						System.out.println("Zalogowano");
						

						if(uzytkownicy[i] instanceof Student) menuStudent.Menu(uzytkownicy, uzytkownicy[i]);
						else if(uzytkownicy[i] instanceof Pracownik) menuPracownik.Menu(uzytkownicy, uzytkownicy[i]);
					}
					else {
						System.out.println("Błędne hasło. Spróbuj ponownie wpisać hasło");
						h = scanner.next();
						i--;
					}	
				}
			}
		}
	}
}
