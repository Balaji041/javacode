class HelloWorld {
    public static void main(String[] args) {
String str="Balaji";
String res="";
int len=str.length();
for(int i=len-1;i>=0;i--){  //decrement
    res=res+str.charAt(i);
}
System.out.println(res);
        
    }
}
