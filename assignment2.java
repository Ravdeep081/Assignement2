package tEST2;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.nio.file.*;
import java.util.TreeMap;  
import java.util.Iterator;  
import java.util.Map;  
import java.util.HashMap;  

public class tST {

	    public static void main(String[] args) throws IOException{
	        String path ="C:\\Users\\soni\\Desktop\\_prog5001_students_grade_2022.csv";
	        String line=" ";
	        int iteration = 0;
	        int v1=0;
	        int v2=0;
	        int v3=0;
	        String arr1[] = new String[25];
	        Map<String,Integer> dicts = new HashMap<>(); 
	        try{
		      
    	        System.out.println("LastName "+"FirstName "+"Student ID "+"A1 "+"A2 "+"A3 "+"TotalMarks");
    	        BufferedReader br = new BufferedReader(new FileReader(path));
    	        
    	        while ((line = br.readLine()) !=null){
    	        	  int s=0;
    	        	String[] values =line.split(",");
    	        	if(iteration == 0 | iteration == 1) {
    		            iteration++;  
    		       
    		        }
    		        else {
    		        	
    		        Integer v4  = Integer.parseInt(values[3]);
    		        Integer v5  = Integer.parseInt(values[4]);
    		        Integer v6  = Integer.parseInt(values[5]);
    		        s=v4+v5+v6;
    	            System.out.println(values[0]+"|"+values[1]+"|"+values[2]+"|"+values[3]+""+values[4]+"|"+values[5]+"|"+s);
    	            
    	            iteration++;
    	            System.out.println("---------------------------------");
    	            dicts.put((values[1]+" "+values[0]),s);
    	            }
    	        }
	        }
    	        catch(FileNotFoundException e){
    	            e.printStackTrace();
    	        }
    	           catch(IOException e){
    	            e.printStackTrace();
    	        }
    		  
    	   
	      
	        System.out.println("Enter one of the following commands:");
	        System.out.println("1 - Print list of the students having marks less than threshold value");
	        System.out.println("2 - Print list of the students having top 10 highest and lowest marks ");
	        Scanner scanchoice = new Scanner(System.in);
	        System.out.println();
	        int choiceentry = -1;

	        	    while(choiceentry < 1 || choiceentry > 3){

	        	            System.out.println("Enter \"1\", \"2\" ");
	        	            if(scanchoice.hasNextInt()) {
	        	            choiceentry = scanchoice.nextInt();

	        	    }

	        	     switch(choiceentry){
	        	     
	        	        case 1:
	        	        	int iter =0 ;
	        	            Scanner sc = new Scanner(System.in);
	        		        System.out.print("Print threshold Value: ");
	        		        int a= sc.nextInt();  
	        		        System.out.println(a); 
	        		        try {

    	        	        BufferedReader br = new BufferedReader(new FileReader(path));
    	        	        
    	        	        while ((line = br.readLine()) !=null){
	        			        int s=0;
    	        	        	String[] values =line.split(",");
    	        	        	if(iter == 0 | iter == 1) {
    	        		            iter++;  
    	        		       
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
                                if (s<=a){
                                	System.out.println(values[1] +" "+ values[0]);}
    	        	            iter++;
                                
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
	        	        
                          System.out.print("Top 10 Students with highest marks \n");
	        	          System.out.println(getTopKeysWithOccurences(dicts, 10,1));

	        	          System.out.print("Top 10 Students with lowest marks \n");
	        	          System.out.println(getTopKeysWithOccurences(dicts, 10,2));

	        	           break;
	        	   }
	        
	    }
}
	    
	    public static List<Entry<String,Integer>> getTopKeysWithOccurences(Map mp, int top,int n) {
	        List<Entry<String,Integer>> results = new ArrayList<>(mp.entrySet());
	        if (n==1){
		        Collections.sort(results, (e1,e2) -> e2.getValue() - e1.getValue());
	        }
	        else {
		        Collections.sort(results, (e1,e2) -> e1.getValue() - e2.getValue());

	        }
	     
	        return results.subList(0, top);
	}
}
	        
	   
