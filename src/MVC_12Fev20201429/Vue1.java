package MVC_12Fev20201429;

import java.util.*;

import javax.swing.*;


public class Vue1 extends JFrame implements Observer{

private JButton plus= new JButton("plus");
private JButton moins= new JButton("moins");
private JTextField textfieldv=new JTextField(3);

private JSlider jauge=new JSlider(JSlider.VERTICAL, 0, 10, 5);

public Vue1(Nombre nombre) {
super("Vue1 Nombre");

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

