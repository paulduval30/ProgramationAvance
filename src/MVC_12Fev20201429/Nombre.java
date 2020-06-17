package MVC_12Fev20201429;

public class Nombre extends java.util.Observable{
public final int VALEUR_MIN;
public final int VALEUR_MAX;
public int valeur;

public Nombre(int min, int max,int val){
this.VALEUR_MIN =min;
this.valeur = val;
this.VALEUR_MAX = max;
}
public void inc(int vale){
valeur=vale;
if(valeur < VALEUR_MAX && valeur >= VALEUR_MIN){
this.valeur++;
setChanged();
notifyObservers();
}
}

public void dec(int vale){
valeur=vale;
if(valeur <= VALEUR_MAX && valeur > VALEUR_MIN){
this.valeur--;

setChanged();

notifyObservers();
}
}
public int getValeur(){return valeur;}

}












