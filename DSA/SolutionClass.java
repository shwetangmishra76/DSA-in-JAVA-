
package DSA;

class SolutionClass{
    /**
    Method EVENODD
     */
    public static boolean EVENODD(int Number){
        return Number%2==0;
    }
    public static float SimpleIntrest(double P,double R,double T){
        return (float) ((P*R*T)/100);
    }
    public static double CurrencyExchange(double Currecy)
{
    return Currecy*84;
}  
 
public static int FebonacciSeries(int F){
      int j=0;
    for (int i =0; i<F; i++){
        j=j+i;
        i++;
    }
    return j;
 }

 public static boolean Palindrome(String str){
    int left=0;
    int right =str.length()-1;
    while(left<right){
        if(str.charAt(right)!= str.charAt(left)){
            return false;
        }
        left++;
        right--;
    }
    return true;
 }
    public static void main(String[] args) {
        
        double intrest = SimpleIntrest(100,4,5);
        System.out.println(intrest);
        
        EVENODD(9);
        boolean a = EVENODD(9);
        System.out.println(a);

        double Indoller =  CurrencyExchange(88);
        System.out.println("inr to doller " + Indoller);

        int Feb= FebonacciSeries(40);
        System.out.println(Feb);

        boolean Name = Palindrome("reger");
        System.out.println("Palindrome" + " : " + Name);

        
    }


}

    