package MVC_12Fev20201429;

import java.awt.*;
import java.util.*;

import javax.swing.*;


public class Vue_Perso extends JFrame implements Observer{
	private Image backgroundImage;
	private JButton plus= new JButton("+");
	private JButton moins= new JButton("-");
	private JTextField textfieldv=new JTextField(3);

	private JSlider jauge=new JSlider(JSlider.VERTICAL, -10, 10, 5);

	public Vue_Perso(Nombre nombre) {
	super("Ma vue personnalis�e");

	// On enregistre la vue aupr�s de l'observ� pour qu'elle recoive les notifications.
	//l'observ� et l'observateur sont des objets.
	//C'est dans le constructeur qu'on enregistre.

	nombre.addObserver(this);
	

	JPanel pane = new JPanel();
	
	pane.add(plus);
	pane.add(moins);
	pane.add(textfieldv);
	pane.add(jauge);
	setContentPane(pane);
	pack();
	this.setVisible(true);
	this.setSize(750, 300);
	jauge.setValue(0);
	textfieldv.setText("0");
	pane.setBackground(Color.BLUE);

	}

	//appel de la m�thode apr�s avoir �t� notifi� par l'observ�

	public void update(Observable obs, Object arg){
		if(obs instanceof Nombre){
			Nombre n = (Nombre)obs;
			this.textfieldv.setText(String.valueOf(n.valeur) );
			this.jauge.setValue(n.getValeur());
	}
	}

	public JButton getPlus(){return plus;}
	public JButton getMoins(){return moins;}

	public String getvaleur(){return textfieldv.getText();}

}
