/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatricejenkins;

/**
 *
 * @author pollo
 */
public class CalculatriceJenkins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 8;

        System.out.println(sum(num1, num2));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
