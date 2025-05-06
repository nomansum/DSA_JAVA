public class HammingDistance {



    public int hammingDistance(int x, int y) {


        int val = x^y;

        int result = 0;
        for(int i=0;i<32;++i){
            if((val&(1<<i))!=0) result++;
        }

return result;
    }
    public  boolean isPalindrome(String s) {
        int length = s.length();

        int idxStart = 0;
        int idxEnd = length -1;
        StringBuilder str = new StringBuilder();
        str.append(s.toLowerCase());

        while(idxStart<idxEnd){
            char a = str.charAt(idxStart);
            char b = str.charAt(idxEnd);
            if( (a>47 && a<58)||(a>64 && a<91) || (a>96 && a<123) ){
                if( (b>47 && b<58)||(b>64 && b<91) || (b>96 && b<123) ){

                    if(str.charAt(idxStart)!=str.charAt(idxEnd)){
                        return false;
                    }
                    idxStart++;
                    idxEnd--;
                }
                else {
                    idxEnd--;
                }
            }
            else {
                idxStart++;
            }
        }
        return true;
    }

}
