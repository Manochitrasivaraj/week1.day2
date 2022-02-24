package week1.day2;

public class Calculator {
	
		//Method for addition
	public int add(int num1, int num2,int num3){
			int result=num1+num2+num3;
			System.out.println("Addition:" + result);
			return result;
		}
		//Method for subtraction
	public int substract(int num1, int num2){
			int result=num1-num2;
			System.out.println("substraction :"+ result);
			return result;
		}
		//Method for multiplication
	public double multiply(double num1, double num2){
			double result=num1*num2;
			System.out.println("multiplication :" + result);
			return result;
		}
		//Method for division
	public float divide(float num1, float num2){
			float result=num1/num2;
			System.out.println("division : "+ result);
			return result;
		}
		
	
	public static void main(String[] args) {
	}

}
