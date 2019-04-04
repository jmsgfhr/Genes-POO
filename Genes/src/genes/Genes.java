/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genes;

import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

/**
 *
 * @author jmsgfhr
 */
public class Genes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1,s2;
        Scanner teclado = new Scanner(System.in);
        s1 = teclado.nextLine();
        s2 = teclado.nextLine();
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        int roda=0;
        for (int i=0;i<s1.length();i++){
            if ((s1.charAt(i)=='A')||(s1.charAt(i)=='T')||(s1.charAt(i)=='C')||(s1.charAt(i)=='G')){
                if((s2.charAt(i)=='A')||(s2.charAt(i)=='T')||(s2.charAt(i)=='C')||(s2.charAt(i)=='G'))
                    roda = 1;
            }
            else roda = 0;
        }
        if(roda==1){
            crossover(s1,s2);
            mutacao(s1);
        }
        else System.out.print("Digite um gene valido");
    }
    
    public static void crossover(String s1,String s2){
        if (s1.length()==s2.length()) {
            String s3,s4;
            s3="";
            s4="";
            int pos = (int) (Math.random() * s1.length()-1);
            for(int i=0;i<s1.length();i++){
                if (i<pos)
                    s3+=s1.charAt(i);
                else
                    s3+=s2.charAt(i);
            }
            for(int i=0;i<s1.length();i++){
                if (i<pos)
                    s4+=s2.charAt(i);
                else
                    s4+=s1.charAt(i);
            }
            System.out.print("Crossover: \n"+"S3: "+s3+"\n"+"S4: "+s4);
        }
        else{
            System.out.print("Genes com tamanhos diferentes!!!!!");
        }
    }
    
    public static void mutacao(String s1){
        int pos= (int) (Math.random()*s1.length());
        int letra= (int) (Math.random()*3);
        String resp = "";
        for (int i = 0;i< s1.length();i++){
            if (i==pos){
                if(letra==0) resp+='A';
                if(letra==1) resp+='G';
                if(letra==2) resp+='T';
                if(letra==3) resp+='C';
            }
            else resp +=s1.charAt(i);
        }
        s1=resp;
        System.out.print("\nDNA MODIFICADO: "+s1);
    }
}