//Factorial implementation using Recursion
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        System.out.print(factorial(6));
    }
    
    private static int factorial(int n){
        if(n==0 || n==1)
            return n;
        return n * factorial(n-1);
    }
}
