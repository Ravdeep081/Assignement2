package tEST2;
import java.io.*;
import java.util.*;  
import java.nio.file.*;

public class tST {

	    public static void main(String[] args) throws IOException{
	        String path ="C:\\Users\\soni\\Desktop\\_prog5001_students_grade_2022.csv";
	        String line=" ";
	        int s=0;
	        int iteration = 0;
	        int v1=0;
	        int v2=0;
	        int v3=0;
	        String arr1[] = new String[25];
	        Dictionary dict = new Hashtable();  
	      //adding values in the dictionary  
	      
	        System.out.println("Enter one of the following commands:");
	        System.out.println("1 - Print Student details with Total Marks");
	        System.out.println("2 - Print list of the students having marks less than threshold value");
	        Scanner scanchoice = new Scanner(System.in);
	        System.out.println();
	        int choiceentry = -1;

	        	    while(choiceentry < 1 || choiceentry > 3){

	        	            System.out.println("Enter \"1\", \"2\", \"3\" ");
	        	            if(scanchoice.hasNextInt())
	        	            choiceentry = scanchoice.nextInt();

	        	    }

	        	     switch(choiceentry){
	        	        case 1:
	        	        	try{
	    	        	        System.out.println("LastName "+"FirstName "+"Student ID "+"A1 "+"A2 "+"A3 "+"TotalMarks");
	    	        	        BufferedReader br = new BufferedReader(new FileReader(path));
	    	        	        
	    	        	        while ((line = br.readLine()) !=null){
	    	        	        	String[] values =line.split(",");
	    	        	        	if(iteration == 0 | iteration == 1) {
	    	        		            iteration++;  
	    	        		       
	    	        		        }
	    	        		        else {
	    	        		        	try {
	    	        		        	   v1 = Integer.parseInt(values[3]);
	    	        		        	   v2 = Integer.parseInt(values[4]);
	    	        		        	   v3 = Integer.parseInt(values[5]);
	    	        			           s=v1+v2+v3;

	    	        		        	}
	    	        		        	catch (NumberFormatException e) {
	    	        		        	   v1 = 0;
	    	        		        	   v2 = 0;
	    	        		        	   v3 = 0;
	    	        		        	}
//	    	        		        System.out.println(v1);
////	    	        	            v1=Integer.parseInt(values[3]);  
//	    	        	            v2=Integer.parseInt(values[4]);  
//	    	        	            v3=Integer.parseInt(values[5]);

	    	        	            System.out.println(values[0]+" "+values[1]+" "+values[2]+" "+values[3]+" "+values[4]+" "+values[5]+" "+s);
	    	        	            iteration++;
	    	        	            dict.put(values[1],s);  
	    	        	            
	    	        	  	      
	    	        	        }
	    	        	        	
	    	        	        }
	    	        	        }
	    	        	        catch(FileNotFoundException e){
	    	        	            e.printStackTrace();
	    	        	        }
	    	        	           catch(IOException e){
	    	        	            e.printStackTrace();
	    	        	        }
	    	            
   	           break;
	        	        case 2:
	        	            Scanner sc = new Scanner(System.in);
	        		        System.out.print("Print threshold Value: ");
	        		        int a= sc.nextInt();  
	        		        System.out.println(a); 
	        		        try {
    	        	        BufferedReader br = new BufferedReader(new FileReader(path));
    	        	        
    	        	        while ((line = br.readLine()) !=null){
    	        	        	String[] values =line.split(",");
    	        	        	if(iteration == 0 | iteration == 1) {
    	        		            iteration++;  
    	        		       
    	        		        }
    	        		        else {
    	        		        	try {
    	        		        	   v1 = Integer.parseInt(values[3]);
    	        		        	   v2 = Integer.parseInt(values[4]);
    	        		        	   v3 = Integer.parseInt(values[5]);
    	        			           s=v1+v2+v3;

    	        		        	}
    	        		        	catch (NumberFormatException e) {
    	        		        	   v1 = 0;
    	        		        	   v2 = 0;
    	        		        	   v3 = 0;
    	        		        	}
//    	        		        System.out.println(v1);
////    	        	            v1=Integer.parseInt(values[3]);  
//    	        	            v2=Integer.parseInt(values[4]);  
//    	        	            v3=Integer.parseInt(values[5]);
                                if (s<=a){
                                	System.out.println(values[1] + values[0]);}
    	        	            iteration++;
                                
    	        	        }
    	        	        }
	        		        }
	        
    	        	        catch(FileNotFoundException e){
    	        	            e.printStackTrace();
    	        	        }
    	        	           catch(IOException e){
    	        	            e.printStackTrace();
    	        	        }
    	        	        
	        	           break;
	        	        case 3:

	        	           break;
	        	   }
	        
	    }
}
