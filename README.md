# IBM-Practice-Problems-
Solution1 - Array Rotation 

     int [] sliceA = new int [d]; 
        
        int counter = 0; 
        for(int i = 0; i < a.length; i++){
            if(i < d){
                sliceA[i] = a[i];
                System.out.println("added to SliceA: " + a[i]);
            }else{
                a[counter] = a[i];
                counter++; 
                System.out.println("add to newA: "+ a[i]); 
            }
            
        }
        
        for(int k = 0; k < sliceA.length; k++){
         a[counter] = sliceA[k]; 
            counter++;  
        }
        
    return a;  

Solution2 - Sparse Array 
Solution3 - Two Strings 
