package Sumalatha;
abstract class Clothes{  
   Clothes()
   {
    System.out.println("clothes are mandatory");
  }  
   abstract void silk();  
   void cotton()
   {
    System.out.println("very comfortable");
  }  
 }  
 
 class rayon extends Clothes{  
 void silk()
 {
    System.out.println("running safely..");
}

public String toString() {
    return "Clothes []";
}  
 }  
 class Abstaction{  
 public static void main(String args[]){  
  Clothes obj = new rayon();  
  obj.silk();  
  obj.cotton();  
 }  
}  

    

