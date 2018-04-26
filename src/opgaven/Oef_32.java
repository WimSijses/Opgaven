/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaven;

/**
 *
 * @author wsijs
 */
import javax.swing.*;
import java.awt.*;

public class Oef_32 extends JFrame{
    //Opstart klasse
    public static void main ( String args[] ) {
    JFrame frame = new Oef_32();
    frame.setSize( 400, 200 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Oefening 3.2" );
    frame.setContentPane( new Paneel32() );
    frame.setVisible( true ); 
    }
    
}

// Het paneel 
class Paneel32 extends JPanel {
  private int uitkomst, negatief1, negatief2;
  
  public Paneel32() {
    setBackground( Color.WHITE );
    negatief1 = -2; // vullen negatief1
    negatief2 = -3; // vullen negatief2
    uitkomst = negatief1 + negatief2;  // vullen uitkomst
  }
  
  public void paintComponent( Graphics g ) {
    super.paintComponent( g );
    g.drawString( "Uitkomst: " + uitkomst, 70, 60 );// string,int, column, row
  }
}