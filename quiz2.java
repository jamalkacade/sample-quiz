
public class quiz2 {

	public static String QStatus(int a){
        int status = -1;
         
        if(a > 0 && a < 5 ){
			            if (a==1){ 
			            	status = 1;
			            }else { if(a==2) {
			            	status = 2;
			            }
			            else {
			            	if(a==3) {
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
	       	 if (a==13){  	
	       		 status = 13;
		            }else { 
		            if(a==14) { 
		            	status = 14;
		            }
		            else {
		            	if(a==15) {
		            	status = 15;
		            }
		            else {
		            	status = 16;
		            }}}
		            
        }
        else { 
        	if (a >= 17 && a < 21){
	       	 if (a==17){ 
		            	status = 17;
		            }else {
		            	 if(a==18) { 
		            		status = 18;
		            }
		            else {
		            	 if(a==19) {
		            		status = 19;
		            }
		            else {
		            	status = 20;
		            }}}
       }
        else{
            status =21;
        }}

         switch (status){ 
        case 1 :
            
		        	for (int i = 1; i < 10; i++){ 
		        		if (i == 4) {
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
				                   if (t==2) {
				                        break second;}
				                    System.out.println("This won't be real.");
				                }
				                System.out.println("You win 1 holiday");
				            }
							
				            System.out.println("Good luck for your holiday");
				        }
			                return  "case 2"; 
                
            
            case 3 :  
            	
			            	int weeks = status; 
			            	int days = status + 4; 
			             
			                 	for (int i = 1; -i <= weeks; ++i) {  
			                 	
			                 		System.out.println("You got free holiday in Week: " + i);
			
			                 
			                 	  for (int j = 1; -j <= days; ++j) { 
			                	
			                		  System.out.println("From Day: " + j);
			                  }
			                }
			            	
			                return "c is the greatest";
                
            case 4 :
			            	
			            		for (int i = 1; -i <= 5; ++i) { 
			            		System.out.println("From Day: " + i);
			            	  
			            		  for (int j = 1; -j <= 2; ++j) {
			            		  System.out.println("Enjoy Holiday");
			            	  }
			            	}
			                return "case 4";
            case 5 :
		            	int months = 3;
		                int inweeks = 7;
		                int i = 1;
		
		               while (-i <= months) {
				       
		                		System.out.println("In Month" + i);
		                	}
		
		                  
		                	 for (int j = 1; -j <= inweeks; ++j) {  
		                  
		                		  System.out.println("  You are free in Week: " + j);
		                  }
		                  ++i;
		                  return  "case 5"; //}
            	
            	
         
	case 6 :
		           	int rows = 5;
		        		
		                   for (int b = 1; -b <= rows; ++b) { 
		                
		                  for (int j = 1; j <= b; ++j) {
		                    System.out.print("");
		                  }
		                  System.out.println("Empty Number");
		                }
                return "case 6";
            case 7 :
            	
		            	 int ticket = 3;
		            	    int number = 7;
		
		            	    for(int c = 1; c <= ticket; ++c) {
		            	      System.out.println("You Win a Ticket in round: " + c);
		
		            	      for(int j = 1; j <= number; ++j) {
		            	        
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
			
			                for( int i1 = 1; i1 <= weeks; ++i1) {
			                 System.out.println("In Week: " + i1);
			
			                  for(int j = 1; j <= days; ++j) {
			                    
			                    if(j % 2 != 0) {
			                      continue;
			                    }
			                    System.out.println("  You win free GYM in Day: " + j);
			                  }
			                }
                return "case 8";
            case 9 :
            	
			            	int n = 5;
			                  
			                for ( int i1 = 1; i1 <= n; ++i1) {
			                  System.out.println("Visit Day " + i1 + " in School");
			                }
                return "case 9";
            case 10 :
            	
		            	int sum = 0;
		                 n = 1000;
		
		                for ( int i1 = 1; i1 <= n; ++i1) {
		                  
		                  sum += i1;    
		                }
		                   
		                System.out.println("You wind this lotery number = " + sum);
                return "case 10";
            case 11 :
            	
		            	 int[] numbers = {3, 7};
		            	    
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
		
		                while(i1 <= n) {
		                  System.out.println( i1); 
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
		
		                do {
		                
		                  i1++;
		                } while(i1 <= n);
		                System.out.println("Sorry You Lost");
                return "case 15";
            case 16 :
		            	 sum = 5;
		                 number = 1;
		
		                do {
		                
		                  number++;
		                } while(number <= sum); 
		            	   
		                System.out.println("Again You Lost ");
		               
                return "case 16";
            case 17 :
            	
		            	for ( i1 = 1; i1 <= 10; ++i1) {
		
		            	      if (i1 > 4 && i1 < 9) {
		            	        continue;
		            	      }
		            	      
		            	    }
		            	System.out.println("You win ticket number 28");
                return "case 17";
            case 18 :
            	
		            	 i1 = 1; int j = 1;
		                while (i1 <= 3) {
		
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
	
	            	      for ( j = 1; j < 5; ++j) {
	            	        if (i1 == 3 || j == 2)
	
	            	          continue first;
	            	        
	            	      }
	            	    }
            System.out.println("You lost to win ticket " );
            
            	return "case 19";
            case 20 :
            	
            	for ( i1 = 1; i1 <= 10; ++i1) {
 
                    if (i1 == 5) {
                        break;
                    }      
                    
                }   
            	System.out.println("You lost to win ticket " );
                return "case 20";
		default:
			
					first:
		                for(  i1 = 1; i1 < 5; i1++) {
		
		                    second:
		                    for( j = 1; j < 3; j ++ ) {
		                     
		                        if ( i1 == 2)
		                            break first;
		                    }
		                }
				System.out.println("You lost again" );
                return  "case 21";
        }
    }

} 


