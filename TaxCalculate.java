public class TaxCalculate {
    public static void main(String[] args) {
        float income =700000f;
        float tax =0;
        if(income>250000 && income<500000){
            tax= (income - 250000) *  0.02f;
        }
        else if(income>=500000 && income<1000000){
            tax= (income - 500000) *  0.05f;
        }
        else if(income>=1000000 ){
            tax= (income - 1000000) *  0.1f;
        }else{
        };
        System.out.println(tax);
    }
}   