public class substring {
    public static void main(String[] args) {
        String name="Mani";
        int n=name.length();
        String sub="";
        for(int i=0;i<3;i++){
            sub=sub+name.charAt(i);
        }
        System.out.println(sub);

        // String s=name.substring(0,2);
        // System.out.println(s);
        // for(int i=0;i<=n;i++){
        //     String sub=name.substring(0,i);
        //     for(int j=i;j<11;j++){
        //         System.out.println(sub);
        //     }
        //     System.out.println();
        // }
    }
}
