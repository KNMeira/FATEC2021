package Prova;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hipotenusa;
		
		double hipotenusa2;
		
		Pitagoras pitagoras = new Pitagoras(10,15,20);
		
		hipotenusa = pitagoras.calcular_Trigonometria(pitagoras.getCateto_oposto(), pitagoras.getCateto_adjacente());
		
		System.out.println("O valor da hipotenusa é " + hipotenusa);
		
		Trigonometria trigonometria = new Trigonometria (20,30,60);
		
		hipotenusa2 = trigonometria.calcular_Trigonometria(trigonometria.getCateto_adjacente(), trigonometria.getCateto_adjacente());
		
		System.out.println("O valor hipotenusa 2 é " + hipotenusa2);
		

	}

}
