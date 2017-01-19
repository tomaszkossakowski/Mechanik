package MechanikZad1;

public class Test {

	public static void main(String[] args) {

		Samochod skoda = new Samochod();
		Warsztat war = new Warsztat();

		Samochod audi = new Samochod("Audi", "A8", 2016, "red", false, 600, 6);
		Samochod hyundai = new Samochod("hyundai", "i40", 2015, "Black", false, 0, 0);

		skoda.setMarka("skoda");
		skoda.setModel("octawia");
		skoda.setRocznik(2000);
		skoda.setKolor("czerwony");
		skoda.setZepsuty(true);
		skoda.setKasaWlasciciela(0);
		skoda.setUsterki(0);

		// war.listaSamochodow.add(hyundai);
		war.dodajSamochod(hyundai);
		war.dodajSamochod(audi);
		war.dodajSamochod(skoda);

		System.out.println(war.listaSamochodow.size());

		// System.out.println(war.listaSamochodow.get(0));
		System.out.println(war.listaSamochodow.get(1));
		// war.wyswietlSamochodySprawne();
		// war.wyswietlSamochodyUszkodzone();
		// war.wyswietlSamochodySprawne();

		// war.usunUsterki(hyundai);
		war.usunUsterki(audi);
	}

}