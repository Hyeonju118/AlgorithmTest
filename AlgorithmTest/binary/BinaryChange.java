package AlgorithmTest.binary;

public class BinaryChange {
    public static void main(String[] args) {

        int inputNum = 19;
        int bin[] = new int[100];

        int i = 0;
        int mod = inputNum;

        while(mod > 0) {
            bin[i] = mod % 2;
            mod /= 2;
            i++;
        }
        i--;
        for(; i>=0; i--){
            System.out.print(bin[i]);
        }
    }
}
