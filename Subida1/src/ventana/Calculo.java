/*
Creado por Emmanuel Acoltzi Bautista
Fecha de creacion: 31-03-2024
email: basedeemma@gmail.com
*/
package ventana;

public class Calculo {
   double numero;
   Double Mat1[][]=new Double[3][6];
   Double Mat2[][]=new Double[3][6];
   Double MatrizInvertida[][]=new Double[3][6];
  String texto="";
  String texto2="";
  Double Identidad[][]=new Double[3][3];
  Double MatDesa[][]=new Double[3][3];
  Double MatOri[][]=new Double[3][3];
   Double Matriz[][]=new Double[3][6];
     static double a=0;
     static double c=0;
        static double b=0;
    public Calculo(double p1,double p2,double p3,double p4,double p5,double p6,double p7,double p8,double p9){
    //Relleno la matriz
        this.Matriz[0][0]=p1;
        this.Matriz[0][1]=p2;
        this.Matriz[0][2]=p3;
        this.Matriz[0][3]=1.0;
        this.Matriz[0][4]=0.0;
        this.Matriz[0][5]=0.0;
        
        
        this.Matriz[1][0]=p4;
        this.Matriz[1][1]=p5;
        this.Matriz[1][2]=p6;
        this.Matriz[1][3]=0.0;
        this.Matriz[1][4]=1.0;
        this.Matriz[1][5]=0.0;

        
        this.Matriz[2][0]=p7;
        this.Matriz[2][1]=p8;
        this.Matriz[2][2]=p9;
        this.Matriz[2][3]=0.0;
        this.Matriz[2][4]=0.0;
        this.Matriz[2][5]=1.0;
        

        
        
        this.MatOri[0][0]=p1;
        this.MatOri[0][1]=p2;
        this.MatOri[0][2]=p3;
        
        
        this.MatOri[1][0]=p4;
        this.MatOri[1][1]=p5;
        this.MatOri[1][2]=p6;
        
        
        this.MatOri[2][0]=p7;
        this.MatOri[2][1]=p8;
        this.MatOri[2][2]=p9;
        
        
        
        
        
}
    public void Paso1(){
       
    numero=0;

    
            if(Matriz[1][0]==0){
            }else{
            System.out.println("Matriz[1][0]");

            numero=Matriz[0][0];
    if(numero>0 && Matriz[1][0]>0){
    numero=numero*Matriz[1][0]*(-1);
    }else{
        System.out.println("todo nice1");
    }
            
            System.out.println("Matriz1="+numero);

            for(int i=0;i<=5;i++){
       double Mul=Matriz[1][i];
       Matriz[1][i]=Mul*numero;
       }
       b=1;
       
        }

    
    
    
    
    numero=0;
    
    if(Matriz[2][0]==0){
    
        System.out.println("Entro");
    }else{
        
            System.out.println("Matriz[2][0]");
       numero=Matriz[1][0];
            System.out.println("Matriz1="+numero);
       for(int i=0;i<=5;i++){
       double Mul=Matriz[2][i];
       Matriz[2][i]=Mul*numero;
       
        }
       a=1;
        }
       
       if(a==1){
                       System.out.println("a");
        for(int i=0;i<=5;i++){
        double MatrizAntes=Matriz[1][i];
        double mat=Matriz[2][i];
        Matriz[2][i]=MatrizAntes+mat;
        }        
            }
        
       
       if(b==1){
                      
        System.out.println("b");

        for(int i=0;i<=5;i++){
        double MatrizAntes=Matriz[0][i];
        double mat=Matriz[1][i];
        Matriz[1][i]=(MatrizAntes+mat);
        }                                
        }   
       
       
       
       
       for(int i=0;i<=2;i++){
       for(int j=0;j<=5;j++){
           System.out.print("["+Matriz[i][j]+"]"+" ");
       }
           System.out.println("");
       }
    }
    
    
    public void Paso2(){
    numero=Matriz[1][1];
    
    double numero2=Matriz[2][1];
    if(numero>0 && numero2>0){
    numero=numero*numero2*(-1);
    }else{
        System.out.println("todo nice2");
    }
    
    for(int i=0;i<=5;i++){
    Matriz[2][i]=Matriz[2][i]*numero;
    }
    //suma
    
    for(int i=0;i<=5;i++){
    
        Matriz[2][i]=Matriz[2][i]+Matriz[1][i];
    }
       for(int i=0;i<=2;i++){
       for(int j=0;j<=5;j++){
           System.out.print("["+Matriz[i][j]+"]"+" ");
       }
           System.out.println("");
       }
    }
    public void Paso3(){
    //a
     if(Matriz[0][2]>=0){
    a=(Matriz[0][2]);
    
         System.out.println("am="+Matriz[0][2]);
 
    }else{
    a=(Matriz[0][2]*-1);
    }
    
     if(Matriz[2][2]>=0){
    b=(Matriz[2][2]);

    System.out.println("bm="+b);
 
    }else{
    b=(Matriz[2][2]*-1);
    }
   //c
     if(Matriz[1][2]>=0){
     c=(Matriz[1][2]);

      System.out.println("cm="+c);

    }else{
    c=(Matriz[1][2]*-1);
    }
   
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
     
     
     
//para la fila 1     
     for(int i=0;i<=5;i++){
     Mat1[0][i]=Matriz[0][i]*b;
     }
     for(int i=0;i<=5;i++){
     Mat1[2][i]=Matriz[2][i]*a;
     }
     for(int i=0;i<=5;i++){
     Matriz[0][i]=Mat1[0][i]+Mat1[2][i];
     }
     
     
     
  //para la fila 2   
     for(int i=0;i<=5;i++){
     Mat2[1][i]=Matriz[1][i]*b;
         System.out.print("("+Mat1[1][i]+")---");
     }
        System.out.println("");
     for(int i=0;i<=5;i++){
     Mat2[2][i]=Matriz[2][i]*c;
         System.out.print("("+Mat2[2][i]+")---");

     }
     for(int i=0;i<=5;i++){
     Matriz[1][i]=Mat2[1][i]+Mat2[2][i];
     }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("-----------------");
        
        
        
        for(int i=0;i<=2;i++){
            for(int k=0;k<=5;k++){
                System.out.print("["+Matriz[i][k]+"] ");
            }
            System.out.println("");
        }
     
     
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        
    }
    
    
    public void Paso4(){
    a=Matriz[0][1];
    b=Matriz[1][1];
    c=0;
    
    if(a>b){
    c=a/b;
    }else{
    c=b/a;
    }
    if(a>0){
    c=c*-1;
    }else{
    }
    for(int i=0;i<=5;i++){
    Matriz[0][i]=(Matriz[0][i]*c)+Matriz[1][i];
    }
        System.out.println("ok1");
     
        for(int i=0;i<=2;i++){
            for(int k=0;k<=5;k++){
                System.out.print("["+Matriz[i][k]+"] ");
            }
            System.out.println("");
        }
     
    
    }
    
    
    public void paso5(){
        System.out.println("ok2");
    a=Matriz[0][0];
    b=Matriz[1][1];
    c=Matriz[2][2];
    
    for(int i=0;i<=5;i++){
        MatrizInvertida[0][i]=Matriz[0][i]/a;
    }
    for(int i=0;i<=5;i++){
        MatrizInvertida[1][i]=Matriz[1][i]/b;
    }
    for(int i=0;i<=5;i++){
        MatrizInvertida[2][i]=Matriz[2][i]/c;
    }

      for(int i=0;i<=2;i++){
            for(int k=0;k<=5;k++){
                texto+="["+MatrizInvertida[i][k]+"]\t";
                System.out.print("["+MatrizInvertida[i][k]+"] ");
            }
            System.out.println("");
            texto+="\n";
        }
     
    
    
    }
    
    
    
    
    
    
    
    public void Comprobacion(){
        System.out.println("Comprobacion");
    for(int i=0;i<=2;i++){
    for(int k=3;k<=5;k++){
    MatDesa[i][k-3]=MatrizInvertida[i][k];
    }
    }
    
    for(int i=0;i<=2;i++){
    for(int k=0;k<=2;k++){
        System.out.print("["+MatDesa[i][k]+"]  ");
    
    }
        System.out.println("");
    }
        
    
        System.out.println("");
    
    for(int i=0;i<=2;i++){
    for(int k=0;k<=2;k++){
        a=MatDesa[i][k];
        b=MatOri[k][i];
        Identidad[i][k]=a*b;
        System.out.print("["+a+"*"+b+"]  ");
  }
        System.out.println("");
    }
    
    for(int i=0;i<=2;i++){
    for(int k=0;k<=2;k++){
            texto2+="["+Identidad[i][k]+"]";
    }
        System.out.println("");
        texto2+="\n";
    }
    
    
    
    
    }
    
    
}
