package javaapplication3;
import java.io.IOException;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;


public class JavaApplication3 {
  public static String sumar_dos_numeros(String numero1,String numero2){
      numero1=Valor_Absoluto(numero1);
      numero2=Valor_Absoluto(numero2);
    int aux,aux2,nu1,nu2;
    int exedente=0;
    int suma=0;
    String ex,respuesta=""; 
    
     if(numero1.length()>=numero2.length() ){ //compara el valor mas grande
     aux=numero1.length();
     aux2=numero1.length()-numero2.length();
     } 
     else{
             aux=numero2.length();  
             aux2=numero2.length()-numero1.length();}
     
     if(numero1.length()>numero2.length() ){
     for(int i=0;i<aux2;i++){
         numero2="0"+numero2;
     }
     }
      if(numero1.length()<numero2.length() ){
         for(int i=0;i<aux2;i++){
         numero1="0"+numero1;
     }
     }
     
      for(int i=aux-1;i>=0;i--){
         
          nu1=Integer.parseInt( ""+numero1.charAt(i)); //cambai a entero
          nu2=Integer.parseInt( ""+numero2.charAt(i));
          suma=nu1+nu2+exedente;
          exedente=0;
          if(suma>=10){
          ex=""+suma;
          exedente=Integer.parseInt( ""+ex.charAt(0));
          }
         if(exedente>0){
             ex=suma+"";
          respuesta=ex.charAt(1)+respuesta;
         } 
         else {
             ex=suma+"";
          respuesta=ex.charAt(0)+respuesta;
         }
          
      }
      if(exedente>0){
      respuesta=exedente+respuesta;
      
      }
      return(respuesta);
    }
  public static String Valor_Absoluto(String numero1){
        if( numero1.charAt(0)=='-'){
            numero1 = numero1.replace("-","");
        }

        return numero1;
    }

  public static String restar_dos_numeros(String numero1,String numero2){
      numero1=Valor_Absoluto(numero1);
      numero2=Valor_Absoluto(numero2);
    int aux,aux2,nu1,nu2,pr=0;
    int resta=0,prestado=0,exedente=0,contador=0;
    String ex,respuesta="",cambio; 
    int inter1=numero1.length(),inter2=numero2.length();
     if(numero1.length()>=numero2.length() ){ //compara el valor mas grande
     aux=numero1.length();
     aux2=numero1.length()-numero2.length();
     } 
     else{
             aux=numero2.length();  
             aux2=numero2.length()-numero1.length();}
     
     if(numero1.length()>numero2.length() ){
     for(int i=0;i<aux2;i++){
         numero2="0"+numero2;
     }
     }
      if(numero1.length()<numero2.length() ){
         for(int i=0;i<aux2;i++){
         numero1="0"+numero1;
     }
     }
      if(inter1<inter2){
      cambio= numero1;
      numero1=numero2;
      numero2=cambio;
      }
      if(inter1==inter2 && numero1.charAt(0)<numero2.charAt(0) ){
      cambio= numero1;
      numero1=numero2;
      numero2=cambio;
      }
     
      for(int i=aux-1;i>=0;i--){
         
          nu1=Integer.parseInt( ""+numero1.charAt(i)); //cambai a entero
          nu2=Integer.parseInt( ""+numero2.charAt(i));
          
          prestado=nu1-pr;
         if(prestado<nu2){
              prestado=10+prestado;
              resta=prestado-nu2;
              contador=1;
              pr=0;
         }
         else{
         if(contador==1){
         nu1=nu1-1;
         
         contador=0;
        
             }
         resta=nu1-nu2;
         }
         if(contador>=1){
             pr=1;
         }
             respuesta=resta+respuesta;
         }
          return(respuesta);
      }
     
  

   public static String division_de_un_numero (String numero1,String numero2){
       
       //esta division solo funciona cuando una de las variables solo tiene un digito
       //la otra variable puede tener los 250 caracteres
       numero1=Valor_Absoluto(numero1);
      numero2=Valor_Absoluto(numero2);
       String cambio="",respuesta="";
       int nu1,nu2,cont=0,resto=0,con2=0;
       if(numero1.length()<numero2.length()){
      cambio= numero1;
      numero1=numero2;
      numero2=cambio;
      }
      for(int i=0;i<numero1.length();i++){
      nu1=Integer.parseInt( ""+numero1.charAt(i)); //cambai a entero
      nu2=Integer.parseInt( ""+numero2.charAt(0));
      if(nu2==1){
      return (numero1);
      }
      if(nu2==0){
      return (numero1="profe eso no se hace");
      }
      
      nu1=resto*10+nu1;
      
      if(nu1<nu2){
      if(numero1.length()-1==i ){
          if(Integer.parseInt( ""+numero1.charAt(i))>=nu2){
              while(nu1>=nu2){
      nu1=nu1-nu2;
      cont=cont+1;
              }
              respuesta=respuesta+cont;
              
              return(respuesta);
              
              
          }else{
          respuesta=respuesta+0;
          return(respuesta);
          }
          
          
      } else  {
         
          nu1=nu1*10+Integer.parseInt( ""+numero1.charAt(i+1));
          
          
        
          
          
    }
      
      }
      
      
      while(nu1>=nu2){
      nu1=nu1-nu2;
      cont=cont+1;
      resto=nu1;
     }
       
     
      respuesta=respuesta+cont;
      cont=0;
    
      }
      return(respuesta);
      }

public static String resto(String numero1,String numero2){
       
       //esta division solo funciona cuando una de las variables solo tiene un digito
       //la otra variable puede tener los 250 caracteres
       numero1=Valor_Absoluto(numero1);
      numero2=Valor_Absoluto(numero2);
       String cambio="",respuesta="",r="";
       int nu1,nu2,cont=0,resto=0;
       if(numero1.length()<numero2.length()){
      cambio= numero1;
      numero1=numero2;
      numero2=cambio;
      }
      for(int i=0;i<numero1.length();i++){
      nu1=Integer.parseInt( ""+numero1.charAt(i)); //cambai a entero
      nu2=Integer.parseInt( ""+numero2.charAt(0));
      if(nu2==1){
      return ("0");
      }
      if(nu2==0){
      return (numero1="profe eso no se hace");
      }
      
      nu1=resto*10+nu1;
      
      if(nu1<nu2){
      if(numero1.length()-1==i ){
          if(Integer.parseInt( ""+numero1.charAt(i))>=nu2){
              while(nu1>=nu2){
      nu1=nu1-nu2;
      cont=cont+1;
              }
              respuesta=respuesta+cont;
              r =""+nu1;
              return(r);
              
              
          }else{
          respuesta=respuesta+0;
          r =""+nu1;
          return(r);
          }
          
          
      } else  {
          if(Integer.parseInt( ""+numero1.charAt(i+1))<nu2){
          nu1=nu1*10+Integer.parseInt( ""+numero1.charAt(i+1));
          }
          else {nu1=nu1*10;
         }
      }
      i=i+1;
      }
      
      
      while(nu1>=nu2){
      nu1=nu1-nu2;
      cont=cont+1;
      resto=nu1;
     }
       
     
      respuesta=respuesta+cont;
      cont=0;
     r =""+nu1;
      }
      return(r);
      }
  
 public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        String numero1 = "", numero2 = "";
        
        System.out.println("Ingrese un numero");
        numero1 = sn.nextLine();
        System.out.println("Ingrese otro numero");
        numero2 = sn.nextLine();
        
        
        while (!salir) {
            System.out.println("\n");
            System.out.println("mi trabajo no funciona con numeros negativos ni letras ");
            System.out.println("en el caso que coloque un negativo se le dara valor absoluto");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            
            System.out.println("3. Dividir  (el divisor es solo de un digito el dividendo no tiene limite )");
         ;
            System.out.println("4. Resto");
            System.out.println("5. ValorAbsoluto");
            System.out.println("6. Salir"); 
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        
                        System.out.println("La Suma es:");
                        System.out.println(sumar_dos_numeros(numero1, numero2));
                        break;
                    case 2:
                        
                        System.out.println("La Resta es:");
                        System.out.println(restar_dos_numeros(numero1, numero2));
                        break;
                    case 3:
                        ;
                        System.out.println("La Division es:");
                        System.out.println(division_de_un_numero(numero1, numero2));
                        break;
                    case 4:
                        
                        System.out.println("El Resto es:");
                        System.out.println(resto(numero1, numero2));
                        break;
                    case 5:
                        
                        System.out.println("El valor Absoluto es:");
                        System.out.println(Valor_Absoluto(numero1) +  "\n" 
                                           +Valor_Absoluto(numero2));
                        break;
                    
                        
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    
 
 }  


          
}