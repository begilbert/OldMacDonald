class Chick implements Animal {     
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;    
         boolean r = (Math.random()<0.5);
         if (r == true)  {
         mySound = sound1;     
       }
       else if (r == false) {
       mySound = sound2;}
     }     
     public Chick()     {         
         myType = "Chick";         
         mySound = "Tweet!";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
