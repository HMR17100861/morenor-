package seriefiboConsola;

public class Fibo { 
    public static void main(String[] args) {
        int valor1=0,valor2=1,x=1,iteraciones=15;

        System.out.println(valor1);
        System.out.println(valor2);
        
       do {
           int valor3=valor1+valor2;
           System.out.println(valor3);
           valor2=valor3;
           valor1=valor2;
           x++;
       } while (x<= iteraciones);
   }

}
