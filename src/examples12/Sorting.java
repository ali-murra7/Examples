/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples12;

/**
 *
 * @author murra9546
 */
public class Sorting {

    
    public void bubbleSort(int [] n)
    {
        boolean swapped = false;
    do{
        swapped = false;
        for(int i = 0; i < n.length - 1; i++)
        {
            if(n[i] > n[i +1])
            {
                //swap
                int temp = n[i];
                n[i] = n[i+1];
                n[i+1] = temp;
                swapped = true;
            }
        }
    }while(swapped);
    }
    
    public void selectionSort(int[]n)
    {
        for(int i = 0; i < n.length -1; i++)
        {
            int smallest = i;
            for(int j = i +1; j < n.length; j++)
            {
                if(n[j] < n[smallest])
                {
                    smallest = j;
                }
                 //swap
                int temp = n[i];
                n[i] = n[smallest];
                n[smallest] = temp; 
            }
        }
    }
        
    public void insertionSort(int[]n)
    {
         for(int i = 1; i < n.length; i++)
         {
             for(int j = i; j > 0 && n[j] < n[j-1];j--)
             {
                 int temp = n[j];
                 n[j] = n[j-1];
                 n[j-1] = temp;
             }
         }
    }
    
    public int sequencialSearch(int[]n, int find)
    {
        for(int i = 0; i < n.length;i++)
        {
            if(n[i] == find)
            {
                return i;
            }else if(n[i] > find)
            {
                return -1;
            }
        }
    }
//    
    public int binarySearch(int[]n, int find, int start, int end)
    {
        if(end < start){
            return -1;
        }
        
        int mid = (end - start) /2;
        if(n[mid] == find)
        {
            return mid;
        }else if(n[mid] > find)
        {
            return binarySearch(n, find, start, mid-1);
        }else{
            return binarySearch(n,find, mid+1, end);
        }
    }
       
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sorting test = new Sorting();
        
        int[] n = {24,1,5,23,87,13,2};
        //sort array
//        test.bubbleSort(n);
        test.insertionSort(n);
        //check if sorted
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
    }
}
