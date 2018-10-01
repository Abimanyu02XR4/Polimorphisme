/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class tes {
      public static void main(String[] args){
        Line tes= new Line(12.0,15.0,18.0,21.0);

        System.out.println(tes.getLength());
        System.out.println(tes.isGreater(tes, tes));
        System.out.println(tes.isLess(tes, tes));
      }
    
    
}
