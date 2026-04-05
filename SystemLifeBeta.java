import java.util.Scanner;
public class SystemLifeBeta {
    
    Scanner scan = new Scanner (System.in);
final int lifefull= scan.nextInt();
int vitima= 0;
final int regen  = 50;
public SystemLifeBeta(){}
    public static void main(String args[]) {
         SystemLifeBeta pessoa = new SystemLifeBeta();
        pessoa.lifesystem();
        pessoa.regensystem();
   
    }
       public void lifesystem(){ 
           while (true){
           if(lifefull<=100) {
               System.out.println("machucado nivel1 ");
               // falha aki se a vida for menor ou igual a 100 ele repete sem parar
       }
            if(lifefull<=50){
           System.out.println("machucado nivel2 ");
           medico();
           break;
           }
            if(lifefull<=0){
           morte();
           break;
            }
           }
       }
            public void morte (){
        System.out.println("ele ta morto");
    }
            public void medico(){
                vitima = lifefull + regen;
                System.out.println("um medico curou um machucado 2: "+vitima);
            }
            public void regensystem(){ 
            
        }
            }
