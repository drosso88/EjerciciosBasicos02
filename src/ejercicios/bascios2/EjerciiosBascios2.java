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
public class EjerciiosBascios2 {
    
    public String  quita(String str){
        int numero = str.length();
        String auxiliar="";
         for(int i=0;i<numero;i++){
            if(str.charAt(i)!=' '){
                auxiliar=auxiliar+str.charAt(i);
            }
        }
         return auxiliar;
    }
    
    public boolean palindromo(String str){
       
        String auxiliar2="";
        String sinEspacios=quita(str);       
        String sinEspaciosYMinusculas=sinEspacios.toLowerCase();    
        int numeroCadenaSinEspacios=sinEspaciosYMinusculas.length();
        
        for(int i = numeroCadenaSinEspacios-1;i>=0;i--){
            auxiliar2=auxiliar2+sinEspaciosYMinusculas.charAt(i);
        }
        if(auxiliar2.equals(sinEspaciosYMinusculas)){
            System.out.println("has tenido suerte " + str + " es un palindromo!");
        
        
    return true;
        }else{
            System.out.print("El parametro " + str +" no es un palindromo, sigue buscando! ");
            return false;
           
        }
    }
    
    public boolean isograma(String str){
        
       
        String sinEspacios=quita(str);
        String sinEspaciosYMinusculas=sinEspacios.toLowerCase();
        int numero =sinEspaciosYMinusculas.length();
       
        int auxiliar=0;
        for(int i = 0; i < numero ; i++){
            for(int j =0; j<numero;j++){
                if(sinEspaciosYMinusculas.charAt(i)==sinEspaciosYMinusculas.charAt(j)){
                    auxiliar++;
               
                }
            }
        }
         if(auxiliar==numero){
        System.out.print("el parametro " + str + " es un isograma ");
                    return true;
         }
        System.out.print("Aaay Señol,Señol " + str + " no es un isograma,sigue buscandooo ");
        return false;
    }
    
    public String acronimo(String str){
        int numero = str.length();
        String y="y";
        String e="e";
        String de="de";
        String la="la";
        String las="las";
        String minusculas=str.toLowerCase();
        String auxiliar=str.substring(0,1);
        //aqui hace falta espicificar que despues de y,de,las,la, tiene que ir espacio no seas huevon y acabalo!!!
            for(int i = 0; i < numero ; i++){
             if(minusculas.charAt(i)==' '){
                 String extracto1=str.substring(i+1,i+2);
                 if(extracto1.equals(y)|| extracto1.equals(e)){
                     i=i+1;
                 }
                  String extracto3=str.substring(i+1,i+4);
                  if(extracto3.equals(las)){
                     i=i+4;
                 }
                 
                 String extracto2=str.substring(i+1,i+3);
                 if(extracto2.equals(de) || extracto2.equals(la)){
                     i=i+2;
                 }
                
                
                String letra=str.substring(i+1,i+2);
                auxiliar=auxiliar+letra;
             }
            }
        auxiliar=quita(auxiliar);
        auxiliar=auxiliar.toUpperCase();
        
        return auxiliar;        
    }
    public boolean anagrama(String a, String b){
        
        String sinEspacioA=quita(a);
        String sinEspacioB=quita(b);
        
        String auxiliar="";
        
        String sinEspaciosAYMinusculas=sinEspacioA.toLowerCase();
        String sinEspaciosBYMinusculas=sinEspacioB.toLowerCase();
         
        System.out.print(sinEspaciosAYMinusculas);
        System.out.print(" "+sinEspaciosBYMinusculas);
        
        int numeroA=sinEspaciosAYMinusculas.length();
        int numeroB=sinEspaciosBYMinusculas.length();
        
        System.out.println(numeroA+ " " +numeroB);
        System.out.print(sinEspaciosBYMinusculas);
        
        auxiliar=sinEspaciosBYMinusculas;
            if(numeroA==numeroB){
             for(int i = 0; i <numeroA;i++){
                 for(int j = 0; j <auxiliar.length();j++){
                     if(sinEspaciosAYMinusculas.charAt(i)==auxiliar.charAt(j)){
                         
                      auxiliar=auxiliar.substring(0, j)+auxiliar.substring(j+1);
                     
                     }
                 }
                 
             }
             if(auxiliar.length()==0){
                 System.out.print("enhorabuena, parametros: " + a + " y " + b + " son anagramas ");
                 return true;
             }
           
            }
             System.out.print("Nein!!! Nein!!! "+ a+ " y " + b + " no son anagramas!!!");
        return false;
    }
    public void calendario(int numero){
        String auxiliar="";
        int salto=0;
         //variable salto cuenta de 7 en 7 y hace salto de linea
        for(int i = 1; i<numero; i ++){
         System.out.print("XX ");
          salto++; 
        }
        for(int i=1; i<=(numero); i++){
            System.out.print ("0"+i+" ");
            salto++;  
            if(salto%7==0){
            System.out.println();
        }
        }
        for(int i = numero+2;i<=31;i++){
            
           salto++;
            if(i<10){
          System.out.print("0"+i+" ");
        }else{
          System.out.print(i + " ");
            }
            if(salto%7==0){
                System.out.println();
            }   
        }
        while(salto%7!=0){
            salto++;
            System.out.print("XX "); 
        }       
    }
    
    public boolean escaleraDePalabras(char[][]listaPalabras){
      
        int numero = listaPalabras.length;
        int auxiliar=0;
        
        for(int i = 1;i<listaPalabras.length;i++){
            for(int j =0; j < listaPalabras[i].length;j++){
                if(listaPalabras[i-1][j]!=listaPalabras[i][j]){
                       auxiliar++;
            
                } 
            }
        }
       
        if(auxiliar==numero-1){
            
            return true;
        }
        
      return false;  
    }
  

    
    public static void main(String[] args) {
        EjerciiosBascios2 ejercicios=new EjerciiosBascios2();
       
        
        System.out.println(ejercicios.palindromo("an ana ana Anaana"));
        System.out.println(ejercicios.isograma("murcielago" ));
        System.out.println(ejercicios.acronimo("Tecnologia de la infrmacion y de las Comunicaciones"));
        System.out.println(ejercicios.anagrama("roma paso","amo rsapo"));
        ejercicios.calendario(1);
                
        	char	[][]	listaPalabras	=	{
                    	{'P',	'A',	'T',	'A',    'S'},
                    	{'P',	'A',	'T',	'O',    'S'},
                        {'R',	'A',	'T',	'O',    'S'},
                        {'R',	'A',	'M',	'O',    'S'},
                        {'G',	'A',	'M',	'O',    'S'},
                        {'G',	'A',	'T',	'O',    'S'},
                        {'M',	'A',	'T',	'O',    'S'},
                        {'T',	'A',	'T',	'O',    'S'},
                        {'T',	'A',	'T',	'U',    'S'},
                        {'T',	'A',	'B',	'U',    'S'},
                        {'Y',	'A',	'B',	'U',    'S'},
                        {'Y',	'A',	'B',	'U',    'Y'},
                };
        System.out.println(ejercicios.escaleraDePalabras(listaPalabras));
    }
    
}
