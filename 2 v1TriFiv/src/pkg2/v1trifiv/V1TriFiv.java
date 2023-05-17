/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.v1trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hector Manuel
 */
public class V1TriFiv {

    
    public static void main(String[] args) throws IOException {
            BufferedReader bufEntrada = new BufferedReader (new InputStreamReader (System.in));
        
        int numero;
        float mult3, mult5;
        
        System.out.println("Dame el numero; ");
        numero = Integer.parseInt(bufEntrada.readLine());
        
        mult3= numero % 3;
        mult5=numero % 5;
        
        if(mult3==0){
            System.out.println("TRI");
        }
        if(mult5==0){
            System.out.println("FIV");
        }
        if(mult3==0 && mult5==0){
            System.out.println("TRIFIV");
        }
        
    }
    }
    
    

