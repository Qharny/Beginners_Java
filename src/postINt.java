public class postINt {
    public static void main(String[] args) {
        int [] postiInt = new int [10];
        for(int i = 0; i < postiInt.length; i++){
            postiInt[i] = i;
        }
        System.out.println(postiInt[0]);
        int sum = 0;
        for(int x = 0; x < postiInt.length; x++){
            sum = sum + postiInt[x];
        }
        System.out.println(sum);
    }
}
