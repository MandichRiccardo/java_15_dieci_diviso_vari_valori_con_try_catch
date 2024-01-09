public class Test{
    public static void main(String[] args) {
        int[] a = new int[10];
        java.util.Random ran = new java.util.Random();
        do{
            for(int i=0;i<a.length;i++) a[i] = ran.nextInt(0, 10);
        }while(thereIsnt0(a));
            //a[ran.nextInt(0, 9)] = 0;
        for(int i:a){
             try{
                 System.out.println("10/" + i + "=" + 10/i);
             }
             catch (ArithmeticException e){
                 System.out.println("attenzione: ho lanciato un'eccezione perché non puoi dividere 10 per 0");
             }
        }
        System.out.println("\narray:");
        for (int j : a) {
            System.out.println(j);
        }
    }
    public static boolean thereIsnt0(int[] a){
        for (int j : a) {
            if (j == 0) return false;
        }
        return true;
    }
}