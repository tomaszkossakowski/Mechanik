package MechanikZad1;

public class Samochod {

	private String marka;
	private String model;
	private int rocznik;
	private String kolor = "Black";
	private boolean zepsuty = true;
	private double kasaWlasciciela;
	private int usterki = 0;

	public Samochod() {

	}

	public Samochod(String marka, String model, int rocznik, String kolor, boolean zepsuty, double kasaWlasciciela,
			int usterki) {
		this.marka = marka;
		this.model = model;
		this.rocznik = rocznik;
		this.kolor = kolor;
		this.zepsuty = zepsuty;
		this.kasaWlasciciela = kasaWlasciciela;
		this.usterki = usterki;
	}

	String getMarka() {
		return marka;
	}

	String getModel() {
		return model;
	}

	int getRocznik() {
		return rocznik;
	}

	String getKolor() {
		return kolor;
	}

	boolean getZepsuty() {
		return zepsuty;
	}

	double getKasaWlasciciela() {
		return kasaWlasciciela;
	}

	int getUsterki() {
		return usterki;
	}

	void setMarka(String marka) {
		this.marka = marka;
	}

	void setModel(String model) {
		this.model = model;
	}

	void setRocznik(int rocznik) {
		this.rocznik = rocznik;
	}

	void setKolor(String kolor) {
		this.kolor = kolor;
	}

	void setZepsuty(boolean zepsuty) {
		this.zepsuty = zepsuty;
	}

	void setKasaWlasciciela(double kasaWlasciciela) {
		this.kasaWlasciciela = kasaWlasciciela;
	}

	void setUsterki(int usterki) {
		this.usterki = usterki;
	}

	@Override

	public String toString() {
		return marka + " " + model + " " + rocznik + " " + kolor + " " + zepsuty + " " + kasaWlasciciela + " "
				+ usterki;
	}

}