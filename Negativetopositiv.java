package week1.day2;

public class Negativetopositiv {
	public void negativetopositive(){
		int inputnum = -40;
		if (inputnum<0) {
			int possitivenum = Math.abs(inputnum);
			
			System.out.println("possitive number of "+inputnum+" is "+possitivenum);
		}
		else {
			System.out.println("The given number is possitive");
			}
		}
		
	
	public static void main(String[] args) {
		Negativetopositiv obj = new Negativetopositiv();
		obj.negativetopositive();

	}

}
