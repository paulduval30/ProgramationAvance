package MVC_12Fev20201429;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

/**
 * Il s'agit du moyen de modifier une grandeur. Ici, pour modifier la valeur, on agit sur des boutons
 * @author Richard Raduly
 * 
 *
 */

public class ControleVue_Perso{
public Nombre nombre;
public ControleVue_Perso(Nombre nombre, Vue_Perso vue){ // 
	this.nombre = nombre;
	vue.getMoins().addActionListener( new ActionListener(){
												public void actionPerformed(ActionEvent ae){
												ControleVue_Perso.this.nombre.dec(Integer.parseInt(vue.getvaleur()));
														  }

});

vue.getPlus().addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent ae){
					ControleVue_Perso.this.nombre.inc(Integer.parseInt(vue.getvaleur()));
}
});

}
} 