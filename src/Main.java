public class Main {

    public static void main(String[] args) {
        String a="abcrtedfg";
        String s="";
        int i,j,k;
        i=a.length()/2-1;
        k=a.length()/2;
        for(;i>=0;i--)
            s+=a.charAt(i);
        for(;k<a.length();k++)
            s+=a.charAt(k);
        System.out.println(s);
    }
}
