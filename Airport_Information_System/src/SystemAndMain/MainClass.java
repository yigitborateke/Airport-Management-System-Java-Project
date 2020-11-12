/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemAndMain;

import GUI.WelcomeFrame;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Yiğit Bora Teke - Ali Yağız Mumcu
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        AirportSys.readAirports();
        AirportSys.readPlanes();
        WelcomeFrame mf=new WelcomeFrame();//GUI part is just a test 
        mf.setVisible(true);
        DefaultComboBoxModel dcbm=new DefaultComboBoxModel(AirportSys.getAirportNames());
        mf.getCmbAirports().setModel(dcbm);
        System.out.println(AirportSys.display("Sabiha"));
        System.out.println(AirportSys.display("Esenboga"));
        System.out.println(AirportSys.display("Ataturk"));
        
        
    }
    
}
