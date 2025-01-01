import java.util.Scanner;
class simpleCalculator{
    private int num1,num2,operator,result;
    //Initialize
    simpleCalculator(){
        calculate();
    }
    //Take Input
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Operation -> +, -, *, / ");
        operator = sc.next().charAt(0);
        System.out.println("Enter Your First Number: ");
        num1 = sc.nextInt();
        System.out.println("Enter Your Second Number");
        num2 = sc.nextInt();
    }
    //Calculate
    public void calculate(){
        getData();
        if(operator=='+'){
            result = sum(num1,num2);
            System.out.println("Sum Of Two Number Are: "+result);
        } else if (operator=='-') {
            result = sub(num1,num2);
            System.out.println("Subtraction Of Two Number Are: "+result);
        } else if (operator=='*') {
            result = mul(num1,num2);
            System.out.println("Multiplication Of Two Number Are: "+result);
        } else if (operator=='/') {
            if (num1==0 || num2==0){
                System.out.println("Division By Zero Is Not Possible, Please Try Again");
                calculate();
            }else {
                result = div(num1,num2);
                System.out.println("Division Of Two Number Are: "+result);
            }
        }else {
            System.out.println("Invalid Operation, Please Try Again");
            calculate();
        }
    }
    //Addition
    public int sum(int a,int b){
        return a+b;
    }
    //Subtraction
    public int sub(int a,int b){
        return a-b;
    }
    //Multiplication
    public int mul(int a, int b){
        return a*b;
    }
    //Division
    public int div(int a,int b){
        return a/b;
    }


}
public class calculator {
    public static void main(String[] args) {
        simpleCalculator obj = new simpleCalculator();
    }
}
