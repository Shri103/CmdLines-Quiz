public class Main {
    public static void main (String args[]){
        Quiz q = (int one, int two) -> {
            System.out.println("In Interface");
            int num = one;
            one++;
            while(one <= two){
                num += one;
                one++;
            }
            return num;
        };
        
        int ans = q.addNums(1, 4);
        System.out.println(ans);
    }
}
