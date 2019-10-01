package ar.edu.utn.com;
class CalculadorFormas {

	public static void main(String[] args) {
		FormaRectangular forma1 = new FormaRectangular();
		// TODO Auto-generated method stub

		forma1.setAltura(12);
		forma1.setBase(10);

		System.out.println("Area es: " + forma1.area());
		System.out.println("Perimetro: " + forma1.perimetro());
		System.out.println("Es cuadrado: " + forma1.esCuadrado());

		FormaRectangular forma2 = new FormaRectangular();

		forma2.setAltura(8);
		forma2.setBase(15);

	}

}
