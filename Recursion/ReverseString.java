
class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        //System.out.println("Start small. Ship something.");
    }
    
    
    static String reverse(String s){
        if(s.length()<=1){
            return s;
        }
        
        //System.out.println(s);
        String t = reverse(s.substring(1,s.length()));
        //System.out.print(s.substring(0,1));
        return new StringBuilder(t+s.substring(0,1)).toString();
        
    }
    
    /*static void reverse(String s){
        if(s.length()<=1){
            System.out.print(s);
            return;
        }
        
        System.out.println(s);
        reverse(s.substring(1,s.length()));
        System.out.print(s.substring(0,1));
        
    }*/

}
