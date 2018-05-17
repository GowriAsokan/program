
public class FactorsOfANumber {

	public static void main(String[] args) {
		System.out.println("Here i m printing the factors of");
		for(int i=0; i<100; i++){
			System.out.print("Factor of"+" "+ i+"is"+"");
			for(int j=1; j<=i; j++){
				if(i%j==0){
					System.out.print(" "+j);
				}
			}
			System.out.println();
		}

	}
}
