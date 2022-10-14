// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int j;
        for(int i=2;i<100;i++){
           int s=0;
        for(j=2;j<i;j++){
            if(i%j==0){
                s=1;
            break;
            }
        }
        if(i==j){
            System.out.print(i+" ");
        }
        }
    }
}
