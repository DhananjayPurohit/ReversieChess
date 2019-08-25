/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversiechess;

/**
 *
 * @author dhana
 */
public class trial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=15;
        int mask=1;
        mask=mask<<31;
        for (int i=0;i<32;i++)
        {
            int x=n&mask;
            if (x==0)
                System.out.print("0");
            else
                System.out.print("1");
            mask=mask>>>1;
        }
    }
    
}
