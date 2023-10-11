import java.util.Scanner;

public class atm {
    
    public static void main (String args[]){
        
//declare and initialize balance, withdraw and deposit
    int balance = 100000, withdraw, deposit;
 
 Scanner sc = new Scanner(System.in);
 while(true)
 {
     //user chosen function to perform
        System.out.println("Paina 1 nostaaksesi rahaa");
        System.out.println("Paina 2 tallettaaksesi rahaa");
        System.out.println("Paina 3 tarkistaaksesi saldon");
        System.out.println("Paina 4 lopettaaksesi");

        int userfunction=sc.nextInt();
            switch(userfunction)
            {
                
            //withdraw a sum user chooses from account
                case 1:
                    System.out.println("Syötä nostettava summa:");
                    
                        withdraw = sc.nextInt();  
                        if(balance >= withdraw)
                        {
                         balance = balance-withdraw;
                            System.out.println("Nosto onnistui! Tilisi saldo on nyt " +balance);
                        }else{
                            System.out.println("Tilin saldo ei riitä summan nostoon!");
                        }System.out.println("");
                        break;
                
            //deposit the sum user chooses to account
                case 2: 
                    System.out.println("Syötä talletettava summa:");
                
                        deposit=sc.nextInt();
                        balance=balance+deposit;
                        System.out.println("Summa on talletettu! Tilisi saldo on nyt "+balance);
                        System.out.println("");
                        break;
                
            //check balance of account
                case 3:
                    System.out.println("Tilisi saldo on nyt " +balance);
                    System.out.println("");
                    break;
                
            //exit atm
                case 4:
                    System.out.println("Kiitos käynnistä, ja tervetuloa uudelleen!");
                    System.exit(4);
                    
            }
        }
    }
}

