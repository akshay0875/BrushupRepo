public class operationNumbers {

    public int  add (int b , int c){
        int d = b+c;
        return d ;

    }

    public void add (int e, int f,int g){
        int h = e+f+g;
        System.out.println(h);

    }

    public static void main(String[] args) {
        operationNumbers demo = new operationNumbers();

        int  a = demo.add(5,5);

        System.out.println(a);

        demo.add(5,5,5);


    }

}
