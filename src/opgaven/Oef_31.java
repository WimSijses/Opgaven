package opgaven;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wsijs
 */
import javax.swing.*;
import java.awt.*;


public class Oef_31 extends JFrame{
  public static void main( String args[] ) {
    JFrame frame = new Oef_31();
    frame.setSize( 400, 200 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Oefening 3.1" );
    frame.setContentPane( new Paneel() );
    frame.setVisible( true );  
  }    
}
// Het paneel 
class Paneel extends JPanel {
  private int securen, secdag, secjaar;
  
  public Paneel() {
    setBackground( Color.WHITE );
    securen = 60*60; // seconden in een uur
    secdag = securen * 24; // seconden in een dag
    secjaar = secdag * 365;  // seconden in een jaar
  }

  public void paintComponent( Graphics g ) {
    super.paintComponent( g );
    g.drawString( "Seconden in een uur: " + securen, 70, 60 );// string,int, column, row
    g.drawString( "Seconden in een dag: " + secdag, 70, 75 );
    g.drawString( "Seconden in een jaar: " + secjaar, 70, 90);
  }
}