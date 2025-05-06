public class IntegerToRoman {






    public String intToRoman(int num) {

        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<values.length;++i){

            if(num==0) break;

            while(num>=values[i]){
                sb.append(symbols[i]);
                num-=values[i];
            }




        }
        return sb.toString();




    }
public String intToROman(int  num){

    String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    String ths[]={"","M","MM","MMM"};
    return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];




}




}
