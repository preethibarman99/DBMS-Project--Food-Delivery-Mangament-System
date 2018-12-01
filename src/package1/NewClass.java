/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author whitehat
 */
public class NewClass {
     public static void main(String[] args) {
        lanuch screen = new lanuch();
        //NewSignin sign = new NewSignin();
        screen.setVisible(true);
        try {
            for (int row = 0; row <=10; row++) {
                Thread.sleep(1000);
                screen.loadnum.setText(Integer.toString(row)+"");
                screen.load.setValue(row*10);
                if (row == 10) {
                    new welcome().setVisible(true);
                    
                }
            }
        } catch (Exception e) {
        }
    }
}
