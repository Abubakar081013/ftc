// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SumFromTo {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        System.out.println(sumFromTo(1,3));
    }
    public static int sumFromTo(int first, int last){
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum = i + sum;
        }
        return sum;
    }

}
