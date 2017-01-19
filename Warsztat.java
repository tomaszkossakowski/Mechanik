package MechanikZad1;

import java.util.ArrayList;
import java.util.List;

public class Warsztat {

	List<Samochod> listaSamochodow = new ArrayList<>();

	void napraw(Samochod sam) {
		if (sam.getZepsuty() == true) {
			System.out.println("samoch�d zosta� naprawiony");
			sam.setZepsuty(false);
		} else {
			System.out.println("samochodu nieda sie naprawi� poniewa� jest sprawny");

		}
	}

	void przemaluj(Samochod sam) {
		if (sam.getZepsuty() == true) {
			System.out.println("musisz naprawi� samochod zanim go przemalujesz!");
		} else {
			System.out.println("samoch�d zosta� przemalowany");
			sam.setKolor("red");
		}

	}

	void dodajSamochod(Samochod sam) {
		listaSamochodow.add(sam);

	}

	void wyswietlSamochodyUszkodzone() {
		for (Samochod s : listaSamochodow) {
			if (s.getZepsuty() == true) {
				System.out.print(s);
			}
		}
	}

	void wyswietlSamochodySprawne() {
		for (Samochod sam : listaSamochodow) {
			if (sam.getZepsuty() == false) {
				System.out.println(sam);
			}
		}
	}

	void usunUsterki(Samochod sam) {
		if (sam.getUsterki() > 0 && sam.getKasaWlasciciela() > 200) {
			int usterki = sam.getUsterki();
			double kasa = sam.getKasaWlasciciela() / 200;
			int i = 0;
			do {
				i++;
				usterki--;
				kasa--;
			} while (usterki != 0 && kasa > 1);
			System.out.println("uda�o si� naprawi� " + i + "usterk");

		}

		else if (sam.getUsterki() < 0 && sam.getKasaWlasciciela() < 200) {
			System.out.println("\nSamoch�d nie posiada usterek i nie posiadasz odpowiedniej ilo�ci got�wki");
		} else if (sam.getUsterki() < 0) {
			System.out.println("\nSamoch�d nie posiada usterek");
		} else {
			System.out.println("\nnie posiadasz odpowiedniej ilo�ci got�wki");
		}
	}

}