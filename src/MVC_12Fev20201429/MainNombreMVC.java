package MVC_12Fev20201429;

import java.awt.Dimension;


public class MainNombreMVC{
	/**
	 * <p>On cr�� les objets afin de mettre en place notre fen�tre </p>
	 * 
	 */
	public static void main(String[] args){
		Nombre nombre = new Nombre(0,10, 5);
		Nombre nombre1 = new Nombre(0,10, 0);
		Vue1 vue1 = new Vue1(nombre);
		Vue_Perso vueperso = new Vue_Perso(nombre1);
		ControleVue1 controle1 = new ControleVue1(nombre,vue1);
		
		ControleVue_Perso controle2= new ControleVue_Perso(nombre1, vueperso);
		
	
	     
		
		
		
		}
		}
