/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20171074;

import javax.swing.JOptionPane;

/**
 *
 * @author user11
 */
public class ThirdAssignment {
    public static void main(String[] args) {
             String firstnumber;
             String secondnumber;
             float n1,n2,sum;
             firstnumber=JOptionPane.showInputDialog("Enter the value of the first number: ");
             secondnumber=JOptionPane.showInputDialog("Enter the value of the second number: ");
             
             n1=Float.parseFloat(firstnumber);
             n2=Float.parseFloat(secondnumber);
             
             sum = n1 + n2;
             JOptionPane.showMessageDialog(null,"The sum is : "+sum,"Result is",JOptionPane.PLAIN_MESSAGE);
             
    }
    
}
