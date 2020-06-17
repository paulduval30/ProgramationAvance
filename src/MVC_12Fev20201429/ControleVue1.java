package MVC_12Fev20201429;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Il s'agit du moyen de modifier une grandeur. Ici, pour modifier la valeur, on agit sur des boutons
 * @author Richard Raduly
 * 
 *
 */

public class ControleVue1{
public Nombre nombre;
public ControleVue1(Nombre nombre, Vue1 vue){ // 
	this.nombre = nombre;
	vue.getMoins().addActionListener( new ActionListener(){
												public void actionPerformed(ActionEvent ae){
												ControleVue1.this.nombre.dec(Integer.parseInt(vue.getvaleur()));
														  }

});

vue.getPlus().addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent ae){
					ControleVue1.this.nombre.inc(Integer.parseInt(vue.getvaleur()));
}
});
}
} 