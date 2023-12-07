public class Main {
    public static void main (String[] args)
    {
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


        int ans = q.addNums(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println(ans);
    }
}
