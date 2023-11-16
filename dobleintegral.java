
import java.io.*;
import java.math.*;

public class dobleintegral  {

    
    public static void main(String[] args) throws IOException {
       BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
   
       double l=0,a=0,b=0,c=0,d=0,m=0,n=0,h=0,i=0,j=0,x=0,xh=0,k=0,y=0,q=0,k1=0,k2=0,k3=0,j1=0,j2=0,j3=0,INTEGRAL=0;
 
       System.out.print("\nINTEGRAL DOBLE DE SIMPSON\n");
       System.out.print("\nIngrese el valor de a ");
       a = Double.parseDouble(teclado.readLine());
       System.out.print("\nIngrese el valor de b ");
       b= Double.parseDouble(teclado.readLine());
       System.out.print("\nIngrese el valor de c ");
       c = Double.parseDouble(teclado.readLine());
       System.out.print("\nIngrese el valor de d ");
       d= Double.parseDouble(teclado.readLine());
       System.out.print("\nIngrese el valor de m ");
       m = Double.parseDouble(teclado.readLine());
       System.out.print("\nIngrese el valor de n ");
       n= Double.parseDouble(teclado.readLine());
       h =(b-a)/n;
       i =0;
       j1=0;
       j2=0;
       j3=0;
       
       do {
    	   x = a + i*h;
    	   xh = (d-c)/m;
    	   k1= Math.log(x+2*c)+Math.log(x+2*d);
    	   k2=0;
    	   k3=0;
    	   j=1;
    	   do {
    		   y = c+j*xh;
    		   q = Math.cos(x*y);
    		   if (j%2==0) {
    			   k2=k2+q;
    			
    			   
    		   }else 
    		   {
    			   k3=k+q;
    		   }
    		   j=j+1;
    	   }while(j<= m-1);
    	   l=((k1+2*k2+4*k3)*xh)/3;
    	   if(i==0||i==n) {
    		   j1 =j1+l;
    		  
    		   
    	   }else
    	   {
    		   if(i%2==0) {
    			   j2 = j2+l;
    		   }else
    		   {
    			   j3=j3+l;
    		   }
    	   }
    	   i=i+1;
    			   
       }while(i<=n);
       
       INTEGRAL = h*(j1+2*j2+4*j3)/3;
       System.out.println("La solucion es : "+INTEGRAL);
  
    }
}


