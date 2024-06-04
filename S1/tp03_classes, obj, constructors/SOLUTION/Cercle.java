/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.myproject;

/**
 *
 * @author Expert Info
 */
public class Cercle {
     double rayon ;

 /** constructeur avec rayon 1 */
Cercle(){
 rayon = 1 ;
 }

 /** Constructor with parameter **/
 Cercle( double nR) {
 rayon = nR;
 }

 /** return the surface of the circle**/
 double getSurface( ) {
 return Math.pow(rayon, 2)* Math.PI ; //rayon*rayon
 }

 /** Return the perimetre o fthe circle **/
double getPerimetre( ) {
return 2 * rayon * Math.PI ;

}

 /** Give the radius new value **/
 void setRayon( double nR) {
 rayon = nR;
}
}