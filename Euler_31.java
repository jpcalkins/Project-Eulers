/*
Name: Jacob Calkins
CS-2133-001
*/

public class Euler_31{
	public static void main(String[] args){
		//starts at one to accout for the combination of just one 2 pound piece.
		int totalCombinations = 1;
		//1 pound combinations
		for(int a = 0; a<=2; a++){
			//50 pence combinations
			for(int b = 0; b<=4; b++){
				//20 pence combinations
				for (int c = 0; c<=10; c++){
					//10 pence combinations
					for(int d=0; d<=20; d++){
						//5 pence combinations
						for(int e=0; e<=40; e++){
							//2 pence combinations
							for(int f=0; f<=100; f++){
								//1 pence combinations
								for(int g=0; g<=200; g++){
									if(a*100 + b*50 + c*20 + d*10 + e*5 + f*2 + g*1 == 200){
										totalCombinations++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(totalCombinations);
	}
}