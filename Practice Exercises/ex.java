public class ex {
    public static void main(String[] args) {
         char [][] name={
            {'B','I','l','A','L'}
            ,{'A','H','M','D','e'}
            ,{'q','e','r','y','t'}
            ,{'w','e','r','u','r'}};
      
           crop(name);
           zoom(name);
    } 

 public static void crop(char [][] name){

    for ( int i=0 ; i<name.length; i++){

        for ( int j = 0; j<name.length;j++){
      
       if(i==0|| i== name.length-1){
           System.out.print(name[i][j]+" ");
       }
       else if(j==0||j==name.length-1){
           System.out.print(name[i][j]+" ");   
       }
       else {

           System.out.print("  ");
       }
    }
      System.out.println();
    } 
   }
  public static void zoom(char [][] name){

    for (int i = 0; i < name.length; i++) {
        for (int j = 0; j < name[i].length; j++) {
            if (i == 0 || i == name.length - 1 || j == 0 || j == name[i].length - 1) {
                System.out.print("  "); 
            } else {
               
                System.out.print(name[i][j] + " ");
            }
        }
        System.out.println(); 
    }
}
   


  
}

