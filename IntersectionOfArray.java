public class Intersection1{
	
	static int  linearSearch(int [] input,int key){
      
      
      for(int i=0;i<input.length;i++){
              
        if(key==input[i])
          return 1;
  
      } 
        return 0;
    
    }
  
  
  
  
  
  
  public static void intersection(int[] arr1, int[] arr2){
		/* Your class should be named Intersection
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
  		 */
		 int k=0;
    	for(int i=0;i<arr1.length;i++ ){
          
          
          k=linearSearch(arr2,arr1[i]);
          if(k==1)
            System.out.println(arr1[i]);
          
          
          
          
          
          
          
        }
    
    
    
    
    
    
    
    
    
    
    
    
	}
}