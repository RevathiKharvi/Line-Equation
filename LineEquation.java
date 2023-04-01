
class LineEquation
{
	public static void main(String[] args) 
	{
	    int n=7;
	    for (int i=0; i<=n-1; i++ )
	    {
	        for(int j=0; j<=n-1; j++)
	        {
	            if(i==0 || j== n/2 || i-j == n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");//J
	            }
	        }
	        	System.out.print(" ");

	       for(int j=0; j<=n-1; j++)
	      {
	            if(j==0 && i!=0 || j==n-1 && i!=0 || i==n/2 || i==0 && j!=0 && j!=n-1)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	         System.out.print(" ");  //A 
	        }
	     }
	    System.out.print(" ");

	    for (int j=0; j<=n-1; j++)
	    {
	        if( i==j && j<=3 || i+j == n-1 && j>=3)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	            System.out.print(" "); //V
	        }
	    }
	  System.out.print(" ");

	     for(int j=0; j<=n-1; j++)
	      {
	            if(j==0 && i!=0 || j==n-1 && i!=0 || i==n/2 || i==0 && j!=0 && j!=n-1)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	         System.out.print(" ");   //A
	        }
	     }
	     System.out.print("     ");
	     
	     for(int j=0; j<=n-1; j++)
	     {
	         if( i==0|| i==n-1 || j== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//I
	         }
	     }
	System.out.print(" ");
 
	    for(int j=0; j<=n-1; j++)
	     {
	         if( i==0 && j!=0 || i== n-1 && j!=n-1 || i== n/2 && j!=0&& j!=n-1 || j==0 && i!=0 && i<=2 || j== n-1 && i>=4 && i!=n-1)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//S
	         }
	     }
	     System.out.print("     ");
	     
	     for(int j=0; j<=n-1; j++)
	      {
	            if(j==0 && i!=0 || j==n-1 && i!=0 || i==n/2 || i==0 && j!=0 && j!=n-1)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	         System.out.print(" ");   //A
	        }
	     }
	     
	System.out.print(" ");

	     
	     for(int j=0; j<=n-1; j++)
	      {
	            if(j==0 || j== n-1 || i-j ==0 && j<=3 || i+j == n-1 && j>=3)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	         System.out.print(" ");  //M 
	        }
	     }
	 System.out.print(" ");

	     
	      for(int j=0; j<=n-1; j++)
	      {
	            if(j==0 && i!=0 || j==n-1 && i!=0 || i==n/2 || i==0 && j!=0 && j!=n-1)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	         System.out.print(" ");   //A
	        }
	     }
	     
          System.out.print(" ");

	     
	      for(int j=0; j<=n-1; j++)
	      {
	            if(i==0 || i== n-1 || i+j== n-1)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	         System.out.print(" ");   //Z
	        }
	     }
	     
       System.out.print(" ");

	     
	    for(int j=0; j<=n-1; j++)
	     {
	         if( i==0|| i==n-1 || j== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//I
	         }
	     }
	   	System.out.print(" ");

	     
	    for(int j=0; j<=n-1; j++)
	     {
	         if( j==0 || j== n-1 || i==j)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//N
	         }
	     }
	     
	  	System.out.print(" ");

	     
	     for(int j=0; j<=n-1; j++)
	     {
	         if( j==0 || i==0 || j== n-1 && i!=2 || i== n/2 && j!=1 && j!=2 || i== n-1 && j!=4 && j!=5 || j== n/2 && i>=3)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//G
	         }
	     }
	     System.out.println();

	    }
	    
	    System.out.println();
	    System.out.println();

	    

	    for( int i=0; i<=n-1; i++)
	    {
	        for( int j=0; j<=n-1; j++)
	        {
	            if( j==0 || i==0 && j != n-1 || i== n/2 && j!=n-1 || j== n-1 && i!=0 && i<=2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //P
	            }
	        }
	        	System.out.print(" ");

	        
	         for( int j=0; j<=n-1; j++)
	        {
	            if( j==0 || i<=0 && j<=2 || i==n/2 && j<=2 || j== n/2 && i!=0 && i<= 2 || i-j == n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //R
	            }
	        }
	   	System.out.print("");

	        
	        for( int j=0; j<=n-1; j++)
	        {
	            if( j==0 && i!=0 && i!=n-1 || i==0 && j!=0 && j!=n-1 || j== n-1 && i!=0 && i!=n-1 || i== n-1 && j!=0 && j!=n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //O
	            }
	        }
	        
		System.out.print(" ");


	        for( int j=0; j<=n-1; j++)
	        {
	            if( j==0 && i!= n-1 || j== n-1 && i!=n-1 || i== n-1 && j!=0 && j!=n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //U
	            }
	        }
	        
         System.out.print(" ");


	        for( int j=0; j<=n-1; j++)
	        {
	            if( i==0 && j!=n-1 || j==0 || i==n-1 && j!=n-1 || j==n-1 && i!=0 && i!=n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //D
	            }
	        }
	    System.out.print("     ");

	        
	      for(int j=0; j<=n-1; j++)
	       {
	         if( j==0 || i==0 || j== n-1 && i!=2 || i== n/2 && j!=1 && j!=2 || i== n-1 && j!=4 && j!=5 || j== n/2 && i>=3)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//G
	         }
	     }
      System.out.print(" ");

	      for(int j=0; j<=n-1; j++)
	     {
	         if( i==0 && j<=n/2 && j!=0 || j==0 && i<=n/2 && i!=0 || j==4 && i<=4 && i!=0 || i==4 && j<=4 && j!=0 || i==j && j>=3)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//Q
	         }
	     }
	     
	System.out.print(" ");


	      for(int j=0; j<=n-1; j++)
	     {
	         if( i==0 || j== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//T
	         }
	     }
	     
      System.out.print(" ");

	     for(int j=0; j<=n-1; j++)
	     {
	         if( i==0|| i==n-1 || j== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//I
	         }
	     }
	     
        System.out.print(" ");


	     for(int j=0; j<=n-1; j++)
	      {
	            if(j==0 && i!=0 || j==n-1 && i!=0 || i==n/2 || i==0 && j!=0 && j!=n-1)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	         System.out.print(" ");   //A
	        }
	     }
	     
          System.out.print(" ");


	   for(int j=0; j<=n-1; j++)
	     {
	         if( j==0 || j== n-1 || i==j)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//N
	         }
	     }
	     	System.out.println();
 
	}
      System.out.println();
      System.out.println();
      
      for(int i=0; i<=n-1; i++)
      {
            for(int j=0; j<=n-1; j++)
	     {
	         if( i==0 || j== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//T
	         }
	     }
	     
      System.out.print(" ");
      
        for(int j=0; j<=n-1; j++)
	     {
	         if(j==0 || j== n-1 || i== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//H
	         }
	     }
	     
      System.out.print(" ");
      
      
    	     for(int j=0; j<=n-1; j++)
	      {
	            if(j==0 && i!=0 || j==n-1 && i!=0 || i==n/2 || i==0 && j!=0 && j!=n-1)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	         System.out.print(" ");   //A
	        }
	     }
	     
          System.out.print(" ");
          
          for(int j=0; j<=n-1; j++)
	     {
	         if( j==0 || j== n-1 || i==j)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//N
	         }
	     }
         System.out.print(" ");
         
         for(int j=0; j<=n-1; j++)
	     {
	         if( j==0 || i+j==n/2 || i-j== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//K
	         }
	     }
         System.out.print("     ");
         
         for(int j=0; j<=n-1; j++)
	     {
	         if(i+j==n-1 || i==j && j<=3)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//Y
	         }
	     }
         System.out.print(" ");
         
         	        for( int j=0; j<=n-1; j++)
	        {
	            if( j==0 && i!=0 && i!=n-1 || i==0 && j!=0 && j!=n-1 || j== n-1 && i!=0 && i!=n-1 || i== n-1 && j!=0 && j!=n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //O
	            }
	        }
	        
		System.out.print(" ");


	        for( int j=0; j<=n-1; j++)
	        {
	            if( j==0 && i!= n-1 || j== n-1 && i!=n-1 || i== n-1 && j!=0 && j!=n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //U
	            }
	        }
	        
         System.out.print("     ");
         
         
          for(int j=0; j<=n-1; j++)
	       {
	         if( j==0 || i==0 || j== n-1 && i!=2 || i== n/2 && j!=1 && j!=2 || i== n-1 && j!=4 && j!=5 || j== n/2 && i>=3)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//G
	         }
	     }
      System.out.print(" ");
      
      	 for( int j=0; j<=n-1; j++)
	        {
	            if( j==0 || i<=0 && j<=2 || i==n/2 && j<=2 || j== n/2 && i!=0 && i<= 2 || i-j == n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //R
	            }
	        }
	   	System.out.print("     ");
	   	
	   	for(int j=0; j<=n-1; j++)
	     {
	         if( i==0 && j!=0 || i== n-1 && j!=n-1 || i== n/2 && j!=0&& j!=n-1 || j==0 && i!=0 && i<=2 || j== n-1 && i>=4 && i!=n-1)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//S
	         }
	     }
	     System.out.print(" ");
	     
	   	 for(int j=0; j<=n-1; j++)
	     {
	         if( i==0|| i==n-1 || j== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//I
	         }
	     }
	System.out.print(" ");
	
    	for(int j=0; j<=n-1; j++)
    	
	        {
	            if( j==0 || i<=0 && j<=2 || i==n/2 && j<=2 || j== n/2 && i!=0 && i<= 2 || i-j == n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //R
	            }
	        }
	   System.out.println();

	} 
	
	     System.out.println();
	   	System.out.println();
	   	
	   	
	   	for (int i=0; i<=n-1; i++)
    {
        for( int j=0; j<=n-1; j++ )
        {
            if(i== 0 || j== n/2)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        
        for(int j=0; j<=n-1; j++)
	     {
	         if(j==0 || j== n-1 || i== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//H
	         }
	     }
	     
      System.out.print(" ");
      
      for(int j=0; j<=n-1; j++)
	      {
	            if(j==0 && i!=0 || j==n-1 && i!=0 || i==n/2 || i==0 && j!=0 && j!=n-1)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	         System.out.print(" ");   //A
	        }
	     }
	     
	    System.out.print(" ");
          
          for(int j=0; j<=n-1; j++)
	     {
	         if( j==0 || j== n-1 || i==j)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//N
	         }
	     }
         System.out.print(" ");
         
         for(int j=0; j<=n-1; j++)
	     {
	         if( j==0 || i+j==n/2 || i-j== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//K
	         }
	     }
         System.out.print("     ");
         
         for(int j=0; j<=n-1; j++)
	     {
	         if(i+j==n-1 || i==j && j<=3)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//Y
	         }
	     }
         System.out.print(" ");
         
         	        for( int j=0; j<=n-1; j++)
	        {
	            if( j==0 && i!=0 && i!=n-1 || i==0 && j!=0 && j!=n-1 || j== n-1 && i!=0 && i!=n-1 || i== n-1 && j!=0 && j!=n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //O
	            }
	        }
	        
		System.out.print(" ");


	        for( int j=0; j<=n-1; j++)
	        {
	            if( j==0 && i!= n-1 || j== n-1 && i!=n-1 || i== n-1 && j!=0 && j!=n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //U
	            }
	        }
	        
         System.out.print("     ");
         
         
          for(int j=0; j<=n-1; j++)
	       {
	         if(i==0 || i== n-1 || i+j == n-1)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//Z
	         }
	     }
      System.out.print(" ");
      
      for(int j=0; j<=n-1; j++)
	      {
	            if(j==0 && i!=0 || j==n-1 && i!=0 || i==n/2 || i==0 && j!=0 && j!=n-1)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	         System.out.print(" ");   //A
	        }
	     }
	     System.out.print(" ");
      
      	 for( int j=0; j<=n-1; j++)
	        {
	            if( j==0 || i==0 || i== n-1 || i== n/2 && j!=n-1 || j==n-1 && i!=0 && i!=n/2 && i!=n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //B
	            }
	        }
	   	System.out.print(" ");
	   	
	   	for(int j=0; j<=n-1; j++)
	     {
	         if( i==0|| i==n-1 || j== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//I
	         }
	     }
         System.out.println();

    }
    
    System.out.println();
    
    for(int i=0; i<=n-1; i++)
    {
	   	
	   	for(int j=0; j<=n-1; j++)
	     {
	         if( i==0 && j!=0 || i== n-1 && j!=n-1 || i== n/2 && j!=0&& j!=n-1 || j==0 && i!=0 && i<=2 || j== n-1 && i>=4 && i!=n-1)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//S
	         }
	     }
	     System.out.print(" ");
	     
	   	 for(int j=0; j<=n-1; j++)
	     {
	         if( i==0|| i==n-1 || j== n/2)
	         {
	             System.out.print("*");
	         }
	         else
	         {
	             System.out.print(" ");//I
	         }
	     }
	System.out.print(" ");
	
    	for(int j=0; j<=n-1; j++)
    	
	        {
	            if( j==0 || i<=0 && j<=2 || i==n/2 && j<=2 || j== n/2 && i!=0 && i<= 2 || i-j == n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" "); //R
	            }
	        }
	   System.out.println();

        
    }


}
}
