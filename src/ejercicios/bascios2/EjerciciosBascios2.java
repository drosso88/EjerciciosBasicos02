/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.bascios2;

/**
 *
 * @author igorr
 */
public class EjerciciosBascios2 {
    
    public boolean palindromo(String str){
        int numero = str.length();
        String auxiliar="";
        String auxiliar2="";
        
        for(int i=0;i<numero;i++){
            if(str.charAt(i)!=' '){
                auxiliar=auxiliar+str.charAt(i);
            }
        }
        auxiliar=auxiliar.toLowerCase();
     
        int numeroCadenaSinEspacios=auxiliar.length();
        
        for(int i = numeroCadenaSinEspacios-1;i>=0;i--){
            auxiliar2=auxiliar2+auxiliar.charAt(i);
        }
        if(auxiliar2.equals(auxiliar)){
            System.out.println("has tenido suerte " + str + " es un palindromo!");
        
        
    return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        EjerciciosBascios2 ejercicios=new EjerciciosBascios2();
       
        System.out.println(ejercicios.palindromo("anaana ana Anaana"));
    }
    
}
