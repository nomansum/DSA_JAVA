public class CountPrimes {

    // https://leetcode.com/problems/count-primes/description/


    public static int countPrimes(int n) {

        boolean isPrime[] = new boolean[n+1];

        if(n<=2)return 0;

            isPrime[2]=true;
        
        int totalPrimes = 1;

        for(int i=3;i*i<=n;i+=2){

            if(isPrime[i]==false){

                for(int j = i*i;j<n;j+=i+i){
                    isPrime[j] = true;
                }

            }

        }
        for(int i=3;i<n;i+=2){
            if(isPrime[i]==false){
                totalPrimes++;
            }
        }



        return totalPrimes;

    }


    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }



}
