package Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Servicios.metodoInterfaz;
import Servicios.metodoImplemetacion;

public class inicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<Integer> numeros = new ArrayList<Integer>();
		
		metodoInterfaz mi = new  metodoImplemetacion();
		mi.añadir(numeros);
		mi.verForeach(numeros);
		mi.cambiar(numeros);
		mi.verFor(numeros);
		
	
	}
}
