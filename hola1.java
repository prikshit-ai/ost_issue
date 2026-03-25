public class hola1{

    public static void main(String[] args) {
       //Scanner cf = new Scanner(System.in) ;
       //System.out.println("type number ");

       //int num = cf.nextInt();
       for(int i = 0 ; i<26 ; i++){
       if(i%3 == 0 ){
            System.out.println("fizz :" + i);
       }
       else if(i%4==0){
        System.out.println("buzz :" + i );

       }
       else if(i%5==0){
        System.out.println("fizz buzz :" + i);

       }
    }
    System.out.println("bonjour");
        
    }
}
