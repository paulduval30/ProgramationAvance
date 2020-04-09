package Specialisation;
/**
 * C'est une interface.
 */

/**
 * 
 * @author Richard
 * @see enseigner()
 * @see afficher()
 * 
 * 
 */

public interface Enseignement {
	
/** C'est une méthode abstraite. Toute classe qui implmente l'interface a l'obligation de proposer un comportement pour cette méthode</p>
*/
	
	public abstract void enseigner();
	
/** Il en est de même pour la méthode afficher(). A ce stade, on ne sait pas encore ce qu'on va afficher </p>
* 
*/

	public abstract void afficher();
	
}
