public class Prime{

    public static void main(String[] args) {

        
            int limit = 100;

            System.out.println("Prime numbers between 1 and " + limit);

            for(int i=1; i < 100; i++){

                    boolean isPrime = true;

                    //check to see if the number is prime
                    for(int j=2; j < i ; j++){

                            if(i % j == 0){
                                    isPrime = false;
                                    break;
                            }
                    }
                    
                    if(isPrime)
                            System.out.print(i + " ");
            }
    }
}