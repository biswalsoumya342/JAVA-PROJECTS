import java.util.Scanner;

class ATM{
    int pin =1234,currentBalance=1000,enteredPin,newPin,option,withdraw,deposite;
    int choice;
    ATM(){
        menu();
    }
    void repeat(){
        System.out.println("Do You Want To Proceed Further? 1-YES , 2-No");
        Scanner sc3 = new Scanner(System.in);
        choice = sc3.nextInt();
        if(choice==1){
            menu();
        } else if (choice==2) {
            exit();
        }
        else{
            System.out.println("Wrong Input! Please Try Again Later");
        }
    }
    public void askPin(){
        System.out.println("Enter Your Pin For Proceed:");
        Scanner sc = new Scanner(System.in);
        enteredPin = sc.nextInt();
    }

    void checkBalance(){
        askPin();
        if (enteredPin==pin){
            System.out.println("Your Current Balance Is: "+currentBalance);
        }else{
            System.out.println("Wrong Pin, Try Again Later");
            checkBalance();
        }
        repeat();
    }
    void withdrawBalance(){
        askPin();
        if (enteredPin==pin){
            System.out.println("How Much Do You Want To Withdraw?");
            Scanner sc5 = new Scanner(System.in);
            withdraw = sc5.nextInt();
            if(currentBalance>=withdraw){
                currentBalance-=withdraw;
                System.out.println("Withdraw Successful, Current Balance Is:"+currentBalance);
            }else{
                System.out.println("Insufficient Balance, Please Try Again Later");
                withdrawBalance();
            }
        }else {
            System.out.println("Wrong Pin, Try Again Later");
            withdrawBalance();
        }
        repeat();
    }
    void depositeBalance(){
        askPin();
        if (enteredPin == pin) {
            System.out.println("How Much Do You Want To Deposite?");
            Scanner sc6 = new Scanner(System.in);
            deposite = sc6.nextInt();
            currentBalance += deposite;
            System.out.println("Money Deposite Successful, Currect Balance Is:" + currentBalance);
        }else {
            System.out.println("Wrong Pin, Try Again Later");
            depositeBalance();
        }
        repeat();

    }
    public void changePin(){
        askPin();
        if (enteredPin==pin){
            System.out.println("Enter New Pin:");
            Scanner sc1 = new Scanner(System.in);
            newPin = sc1.nextInt();
            pin = newPin;
            System.out.println("-:Pin Changed Successful:-");
        }else{
            System.out.println("Wrong Pin, Try Again Later");
            changePin();
        }
        repeat();
    }
    void exit(){
        System.out.println("-:Thank You For Banking With Us:-");
        System.out.println("     -:VISIT AGAIN TEAM SBI:-");
        return;
    }
    void menu(){
        System.out.println("WELCOME TO SBI ATM SERVICE");
        System.out.println("Choose The Below Option For Proceed");
        System.out.println("1-CHECK BALANCE");
        System.out.println("2-WITHDRAW BALANCE");
        System.out.println("3-DEPOSITE MONEY");
        System.out.println("4-PIN CHANGE");
        System.out.println("5-EXIT");
        Scanner sc4 = new Scanner(System.in);
        option = sc4.nextInt();
        if(option==1){
            checkBalance();
            repeat();
        } else if (option==2) {
            withdrawBalance();
            repeat();
        } else if (option==3) {
            depositeBalance();
            repeat();
        } else if (option==4) {
            changePin();
            repeat();
        } else if (option==5) {
            exit();
        }else {
            System.out.println("Wrong Input! Please Try Again Later");
            menu();
        }
    }
}
public class atm{
    public static void main(String args[]){
        ATM obj = new ATM();
    }
}
