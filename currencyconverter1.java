class CurrencyConverter1{

int usdollar=3;

int rupee=usdollar*63;

int dirham=usdollar*3;

int chilean_peso=usdollar*595;

int _yen=usdollar*107;

int $australian=usdollar*2;

int Rupee=usdollar*63;

void printCurrencies(){
System.out.println("LIST OF CURRENCIES");
System.out.println("usdollar:"+usdollar);

System.out.println("rupee:"+rupee);

System.out.println("dirham:"+dirham);

System.out.println("chilean_peso:"+chilean_peso);

System.out.println("_yen:"+_yen);

System.out.println("$australian:"+$australian);

System.out.println("Rupee:"+Rupee);

}

public static void main(String[] args){

CurrencyConverter1 cc= new CurrencyConverter1();

cc.printCurrencies();
}
}