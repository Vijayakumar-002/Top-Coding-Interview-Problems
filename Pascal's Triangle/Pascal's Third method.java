//print the entire Pascal's Pattern
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       ArrayList<List<Integer>> list1=new ArrayList<>();
       for(int i=1;i<=n;i++){
          list1.add(pt(i));
       }
       for(int i=0;i<n;i++){
           System.out.println(list1.get(i));
       }
    }
       
      
      static List<Integer> pt(int r){
          int ans=1;
          ArrayList<Integer> list=new ArrayList<>();
          list.add(1);
          for(int j=1;j<r;j++){
             ans=ans*(r-j);
             ans=ans/j;
             list.add(ans);
       }
       return list;
     
       }
       
      
       
    
   
}