package calisma;

public class Main {
	 public  static String perfecNumberFinder(int number){
	        int sum = 0;
	        for(int i =1;i<number;i++) {
	            if (number % i == 0) {
	                sum = sum + i;
	            }
	        }
	            if(number==sum){
	                String yazi1="Sayi m]kemmeldir";
	                return (yazi1);}
	            else {
	                String metin = "Sayi mukemmel deildir";
	                return (metin);
	            }
	            }

	public static void main(String[] args) {
		int exNumber = 6;
				System.out.println(perfecNumberFinder(exNumber));



	}

}


   