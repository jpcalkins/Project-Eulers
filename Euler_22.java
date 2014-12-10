/*
Name: Jacob Calkins
CS-2133-001
*/

import java.io.*;
import java.util.*;
 
public class Euler_22{
	private static ArrayList<String> nameList = new ArrayList<String>();

	public static void main(String[] args){
		buildList(readFile("names.txt"));
		System.out.println(calcValue());
	}
 	
 	private static void buildList(String s){
		String temp = "";
		boolean isName = false;
		int i = 0;
		
		while (i < s.length()){
			if (s.charAt(i) == '\"'){
				isName = !isName;
				i++;
			}
			if (isName)
			{	// If switch is on, capture characters into temp
				temp += s.charAt(i);
			} else{
				if (temp == ""){
					break;
				} else{
					nameList.add(temp);
					temp = "";	
				}
			}
			i++;
		}
		Collections.sort(nameList);
	}
 
	private static String readFile(String filename){
		String list = "";
		try{
			StringBuffer contents = new StringBuffer();
			String text = null;
			BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
			while ((text = reader.readLine()) != null)
			{
				contents.append(text).append(System.getProperty("line.separator"));			
			}
			list = contents.toString();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		return list;
	}
 
	private static long calcValue(){
		long grandTotal = 0;
		int i = 1;
		Iterator<String> itr = nameList.iterator();
		while(itr.hasNext()){
			String tmp = itr.next().toString();
			int localSum = 0; 
 
			for (int j = 0; j < tmp.length(); j++){
				if (tmp.charAt(j) == 'A'){
					localSum += 1;
				} else if (tmp.charAt(j) == 'B'){
					localSum += 2;
				} else if (tmp.charAt(j) == 'C'){
					localSum += 3;
				} else if (tmp.charAt(j) == 'D'){
					localSum += 4;
				} else if (tmp.charAt(j) == 'E'){
					localSum += 5;
				}else if (tmp.charAt(j) == 'F'){
					localSum += 6;
				}else if (tmp.charAt(j) == 'G'){
					localSum += 7;
				}else if (tmp.charAt(j) == 'H'){
					localSum += 8;
				}else if (tmp.charAt(j) == 'I'){
					localSum += 9;
				}else if (tmp.charAt(j) == 'J'){
					localSum += 10;
				}else if (tmp.charAt(j) == 'K'){
					localSum += 11;
				}else if (tmp.charAt(j) == 'L'){
					localSum += 12;
				}else if (tmp.charAt(j) == 'M'){
					localSum += 13;
				}else if (tmp.charAt(j) == 'N'){
					localSum += 14;
				}else if (tmp.charAt(j) == 'O'){
					localSum += 15;
				}else if (tmp.charAt(j) == 'P'){
					localSum += 16;
				}else if (tmp.charAt(j) == 'Q'){
					localSum += 17;
				}else if (tmp.charAt(j) == 'R'){
					localSum += 18;
				}else if (tmp.charAt(j) == 'S'){
					localSum += 19;
				}else if (tmp.charAt(j) == 'T'){
					localSum += 20;
				}else if (tmp.charAt(j) == 'U'){
					localSum += 21;
				}else if (tmp.charAt(j) == 'V'){
					localSum += 22;
				}else if (tmp.charAt(j) == 'W'){
					localSum += 23;
				}else if (tmp.charAt(j) == 'X'){
					localSum += 24;
				}else if (tmp.charAt(j) == 'Y'){
					localSum += 25;
				}else if (tmp.charAt(j) == 'Z'){
					localSum += 26;
				}
			}
			localSum *= (i);
			grandTotal += localSum;
			i++;
		}
		return grandTotal;		
	}
}