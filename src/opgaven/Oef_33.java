/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaven;

/**
 *
 * @author wsijs
 * 
 */

import javax.swing.*;
import java.awt.*;

public class Oef_33 extends JFrame {
   //Opstart klasse
    public static void main ( String args[]) {
    JFrame frame = new Oef_33();
    frame.setSize( 400, 200 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Oefening 3.3" );
    frame.setContentPane( new Paneel33() );
    frame.setVisible( true );
    }
    
}

// Het paneel 
class Paneel33 extends JPanel {
  private int leeftijdInSeconden, leeftijdInMinuten, leeftijdInUren;
  
  public Paneel33() {
    setBackground( Color.WHITE );
    leeftijdInSeconden = 5454532; // leeftijd in seconden
    leeftijdInUren = leeftijdInSeconden / (60*60);
    leeftijdInMinuten = leeftijdInUren % 60;
  }
  
  public void paintComponent( Graphics g ) {
    super.paintComponent( g );
    g.drawString( "Leeftijd in seconden is: " + leeftijdInSeconden, 70, 60 );// string,int, column, row
    g.drawString( "Leeftijd is " + leeftijdInUren + " uren en " + leeftijdInMinuten + " minuten.", 70, 80 );// string,int, column, row
   }
}