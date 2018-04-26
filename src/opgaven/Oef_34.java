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

public class Oef_34 extends JFrame {
   //Opstart klasse
    public static void main ( String args[]) {
    JFrame frame = new Oef_34();
    frame.setSize( 400, 200 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Oefening 3.4" );
    frame.setContentPane( new Paneel34() );
    frame.setVisible( true );
    }
    
}

// Het paneel 
class Paneel34 extends JPanel {
  private int leeftijdInSeconden, leeftijdInMinuten, leeftijdInUren, weken, dagen, restDagen, restWeken;
  
  public Paneel34() {
    setBackground( Color.WHITE );
    leeftijdInSeconden = 5454532; // leeftijd in seconden
    leeftijdInUren = leeftijdInSeconden / (60*60);
    leeftijdInMinuten = leeftijdInUren % 60;
    dagen = leeftijdInUren / 24;
    restDagen = leeftijdInUren % 24;
    weken = (dagen + restDagen) / 7;
    restWeken = dagen % 7;
    
  }
  
  public void paintComponent( Graphics g ) {
    super.paintComponent( g );
    g.drawString( "Leeftijd in seconden is: " + leeftijdInSeconden, 70, 60 );// string,int, column, row
    g.drawString( "Leeftijd is " + leeftijdInUren + " uren en " + leeftijdInMinuten + " minuten.", 70, 80 );// string,int, column, row
    g.drawString( "Leeftijd in dagen is: " + dagen + "." + restDagen, 70, 100);
    g.drawString( "Leeftijd in weken is: " + weken + "." + restWeken, 70, 120);
   }
}