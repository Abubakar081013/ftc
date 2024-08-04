// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SumFromTo {
    public static void main(String[] args) {
        System.out.println("LETS GO!!!!!!!!!");
        System.out.println(sumFromTo(4,7));
    }
    public static int sumFromTo(int first, int last){
        int sum = 0;
        
        if(first > last){
            for (int i = last; i <= first; i++) {
                 sum = i + sum;
            }
        }
        else{
             for (int i = first; i <= last; i++) {
            sum = i + sum;
            }
        }
        return sum;
   }

}
