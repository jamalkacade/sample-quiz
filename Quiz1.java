
public class Quiz1 {
	//int i =10;
	public static String QStatus(int a){
        int status = -1;
         
        if(a > 0 && a < 5 ){
			            if (a==1){  //ORIGINAL 
			            //  if (-a == 1) { // AOIU_1
			            	status = 1;
			            }else { if(a==2) {//ORIGINAL 
			            	//if (-a == 2) { // AOIU_2
			            	status = 2;
			            }
			            else {
			            	if(a==3) {//ORIGINAL
			            	//	if (-a == 3) {// AOIU_3
			            	status = 3;
			            }
			            else {
			            	status = 4;
			            }}}
        	
        }
        else if (a >= 5 && a < 9){
			        	 if (a==5){
				            	status = 5;
				            }else if(a==6) {
				            	status = 6;
				            }
				            else if(a==7) {
				            	status = 7;
				            }
				            else {
				            	status = 8;
				            }
        	
        }
        else if (a >= 9 && a < 13){
				       	 if (a==9){
					            	status = 9;
					            }else if(a==10) {
					            	status = 10;
					            }
					            else if(a==11) {
					            	status = 11;
					            }
					            else {
					            	status = 12;
					            }

        }
        else if (a >= 13 && a < 17){
	       	 if (a==13){ // ORIGINAL
	       	//	 if (-a == 13) {  // AOIU_10 	
	       		 status = 13;
		            }else { 
		            if(a==14) { // ORIGINAL
		               // if (-a == 14) {  // AOIU_11
		            	status = 14;
		            }
		            else {
		            	if(a==15) { // ORIGINAL
		              	// if (-a == 15) { // AOIU_12
		            	status = 15;
		            }
		            else {
		            	status = 16;
		            }}}
		            
        }
        else { 
        	if (a >= 17 && a < 21){
	       	 if (a==17){ // ORIGINAL
	       		//if (-a == 17) { // AOIU_13
		            	status = 17;
		            }else {
		            	 if(a==18) { // ORIGINAL
		            	//	 if (-a == 18) { // AOIU_14
		            		status = 18;
		            }
		            else {
		            	 if(a==19) {// ORIGINAL
		            	//	  if (-a == 19) { // AOIU_15
		            		status = 19;
		            }
		            else {
		            	status = 20;
		            }}}
       }
        else{
            status =21;
        }}

         switch (status){ // ORIGINAL
      //  switch (-status) {  // AOIU_16
        case 1 :
            
		        	for (int i = 1; i < 10; i++){ // ORIGINAL
        	 //for (int i = 1; -i < 10; i++) {  // AOIU_17
		        		if (i == 4) {// ORIGINAL
		        		//	if (-i == 4) {   // AOIU_18 
		        			break;}
		           
		                     System.out.println("you win " + i + " reward of holiday");
		                 }
		                 System.out.println("holiday rewards complete.");
		                return "case 1";
               
		case 2 :
			
						int t = 2+status;
						first:
				        {
				            second:
				            {
				                third:
				                {
							System.out.println("Before you got reward");
				                   if (t==2) {// ORIGINAL
				                     //	if (-t == 2) { //AOIU_19
				                        break second;}
				                    System.out.println("This won't be real.");
				                }
				                System.out.println("You win 1 holiday");
				            }
							
				            System.out.println("Good luck for your holiday");
				        }
			                return  "case 2"; 
                
            
            case 3 :  
            	
			            	int weeks = status; //ORIGINAL
			            	//int weeks = -status; // AOIU_20 
			            	int days = status + 4; //ORIGINAL
			            	//  int days = -status + 4; // AOIU_21
			            	  
			
			                // outer loop prints weeks
			                for (int i = 1; i <= weeks; ++i) { //ORIGINAL
			                 //	for (int i = 1; -i <= weeks; ++i) { // AOIU_22 
			                 	// for (int i = 1; i <= -weeks; ++i) { // AOIU_23 
			                 		System.out.println("You got free holiday in Week: " + i);
			
			                  // inner loop prints days
			                 for (int j = 1; j <= days; ++j) {  //ORIGINAL
			                 //	  for (int j = 1; -j <= days; ++j) { //AOIU_24 
			                	// for (int j = 1; j <= -days; ++j) { // AOIU_25
			                		  System.out.println("From Day: " + j);
			                  }
			                }
			            	
			                return "c is the greatest";
                
            case 4 :
			            	// outer loop
			            	for (int i = 1; i <= 5; ++i) {//ORIGINAL
			            	//	for (int i = 1; -i <= 5; ++i) { // AOIU_26	
			            		System.out.println("From Day: " + i);
			            	  // inner loop
			            	   for(int j = 1; j <=2; ++j) {//ORIGINAL
			            		//  for (int j = 1; -j <= 2; ++j) { // AOIU_27
			            		  System.out.println("Enjoy Holiday");
			            	  }
			            	}
			                return "case 4";
            case 5 :
		            	int months = 3;
		                int inweeks = 7;
		                int i = 5;
		
		                // outer loop
		                while (i <= months) { //ORIGINAL
		              // while (-i <= months) { //AOIU_28
				       //while (i <= -months) { //AOIU_29
		                		System.out.println("In Month" + i);
		                	}
		
		                  // inner loop
		                   for (int j = 1; j <= inweeks; ++j) {//ORIGINAL
		                	// for (int j = 1; -j <= inweeks; ++j) {  //AOIU_30
		                  //for (int j = 1; j <= -inweeks; ++j) {//AOIU_31
		                		  System.out.println("  You are free in Week: " + j);
		                  }
		                  ++i;
		                //}
            	
            	return  "case 5";
         
		case 6 :
		           	int rows = 5;
		        		
		                // outer loop
		             	   for (int b = 1; b <= rows; ++b) {//ORIGINAL
		                //   for (int b = 1; -b <= rows; ++b) { //AOIU_32
		                // for (int b = 1; b <= -rows; ++b) {//AOIU_33
		                  // inner loop to print the numbers
		                  for (int j = 1; j <= b; ++j) {
		                    System.out.print("");
		                  }
		                  System.out.println("Empty Number");
		                }
                return "case 6";
            case 7 :
            	
		            	 int ticket = 3;
		            	    int number = 7;
		
		            	    // outer loop
		            	    for(int c = 1; c <= ticket; ++c) {
		            	      System.out.println("You Win a Ticket in round: " + c);
		
		            	      // inner loop
		            	      for(int j = 1; j <= number; ++j) {
		            	        
		            	        // break inside the inner loop
		            	        if(c == 2) {
		            	          break;
		            	        }
		            	        System.out.println("  Ticket number: " + j);
		            	      }
		            	    }
                return "case 7";
            case 8 :
            	
			            	 weeks = 3;
			                 days = 7;
			
			                // outer loop
			                for( int i1 = 1; i1 <= weeks; ++i1) {
			                 System.out.println("In Week: " + i1);
			
			                  // inner loop
			                  for(int j = 1; j <= days; ++j) {
			                    
			                    // continue inside the inner loop
			                    if(j % 2 != 0) {
			                      continue;
			                    }
			                    System.out.println("  You win free GYM in Day: " + j);
			                  }
			                }
                return "case 8";
            case 9 :
            	
			            	int n = 5;
			                // for loop  
			                for ( int i1 = 1; i1 <= n; ++i1) {
			                  System.out.println("Visit Day " + i1 + " in School");
			                }
                return "case 9";
            case 10 :
            	
		            	int sum = 0;
		                 n = 1000;
		
		                // for loop
		                for ( int i1 = 1; i1 <= n; ++i1) {
		                  // body inside for loop
		                  sum += i1;     // sum = sum + i
		                }
		                   
		                System.out.println("You wind this lotery number = " + sum);
                return "case 10";
            case 11 :
            	
		            	 int[] numbers = {3, 7};
		            	    
		            	    // iterating through the array 
		            	    for (int d: numbers) {
		            	       System.out.println("You have not won this");
		            	    }
                return "case 11";
            case 12 :
            	
		            	 sum = 0;
		
		                for ( int i1 = 1; i1 <= 3; ++i1) {
		                    System.out.println("You have not won this also");
		                }
                return "case 12";
            case 13 :            	
            	
		            	int i1 = 1;   	 
		            	 n = 5;
		
		                // while loop from 1 to 5
		                while(i1 <= n) {
		                  System.out.println( i1); // if u add this printing to this test instruction coverage become 52
		                  i1++;
		                }
		              
                return "case 13";
            case 14 :
		            	
		            	 sum = 5;
		            	 number = 1;
		                while (number <= sum) {
		                	System.out.println("You win free teickets in day " + number);
		                	 number++;
		                }
                     
                return  "case 14";
            case 15 :
		            	 i1 = 1; n = 5;
		
		                // do...while loop from 1 to 5
		                do {
		                 // System.out.println(i);
		                  i1++;
		                } while(i1 <= n);
		                System.out.println("Sorry You Lost");
                return "case 15";
            case 16 :
		            	 sum = 5;
		                 number = 1;
		
		                do {
		                  // add only positive numbers
		                  
		                 // System.out.println("Enter a number");
		                  number++;
		                } while(number <= sum); 
		            	   
		                System.out.println("Again You Lost ");
		               
                return "case 16";
            case 17 :
            	
		            	for ( i1 = 1; i1 <= 10; ++i1) {
		
		            	      // if value of i is between 4 and 9
		            	      // continue is executed
		            	      if (i1 > 4 && i1 < 9) {
		            	        continue;
		            	      }
		            	      //System.out.println(i);
		            	    }
		            	System.out.println("You win ticket number 28");
                return "case 17";
            case 18 :
            	
		            	 i1 = 1; int j = 1;
		                while (i1 <= 3) {
		
		                //  System.out.println("You are got free hiliday in month " + i);
		                  while(j <= 3) {
		
		                    if(j == 2) {
		                      j++;
		                      continue;
		                    }
		
		                    System.out.println("You win ticket number : " + j+55);
		                    j++;
		                  }
		                  i1++;
		                }
                return  "case 18";
            case 19 :
            	
	            	first:
	            	    for ( i1 = 1; i1 < 6; ++i1) {
	
	            	      // inner loop
	            	      for ( j = 1; j < 5; ++j) {
	            	        if (i1 == 3 || j == 2)
	
	            	          // skips the current iteration of outer loop
	            	          continue first;
	            	        //System.out.println("i = " + i + "; j = " + j);
	            	      }
	            	    }
            System.out.println("You lost to win ticket " );
            
            	return "case 19";
            case 20 :
            	
            	for ( i1 = 1; i1 <= 10; ++i1) {

                    // if the value of i is 5 the loop terminates  
                    if (i1 == 5) {
                        break;
                    }      
                    
                }   
            	System.out.println("You lost to win ticket " );
                return "case 20";
		default:
			
					first:
		                for(  i1 = 1; i1 < 5; i1++) {
		
		                    // the for loop is labeled as second
		                    second:
		                    for( j = 1; j < 3; j ++ ) {
		                        //System.out.println("i = " + i + "; j = " +j);
		                     
		                        // the break statement breaks the first for loop
		                        if ( i1 == 2)
		                            break first;
		                    }
		                }
				System.out.println("You lost again" );
                return  "case 21";
        }
    }

} 

// code parts are from https://www.programiz.com/java-programming/break-statement