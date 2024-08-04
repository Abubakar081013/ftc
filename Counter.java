// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Counter {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        for(int cool = 1; cool < 8; cool++){
            for(int awesome_sauce = 1; awesome_sauce <= 8 - cool; awesome_sauce++){
            System.out.print(awesome_sauce);
            }
            System.out.println();
        }
    }
}
