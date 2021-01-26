import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args)
  {
    int num1;
    int num2;
    char operation;
    int rezult;
    


    String str1=getOperation();
    String str0=probel(str1);
    //System.out.println("dlina1stroki: "+str1.length());
    //System.out.println("dlina2stroki: "+str0.length());
    
    
    int maxznak=maxzn(str0);
    operation=get2(str0, maxznak);
    int k=maxznak;//номер знака операции в строке
    int N=str0.length();// длина исходной строки без пробелов
    String str2=str0.substring(0,k);//строка первого числа с пробелами
    int l1=str2.length();
    String str20=probel(str2);//строка первого числа без пробелов
    int l2=str20.length();
    String str3=str0.substring(k+1,N);//строка второго числа с пробелами
    int l3=str3.length();
    String str30=probel(str3);//строка второго числа без пробелов
    int l4=str30.length();

//      System.out.println("operation: "+operation);

//    System.out.println("nomer_max_znaka: "+maxznak);
//    System.out.println("stroka number1 c probel: "+str2);
//    System.out.println("dlina number1 c probel: "+l1);
//    System.out.println("stroka number1 bez probel: "+str20);
//    System.out.println("dlina number1 bez probel: "+l2);
//    System.out.println("dlina string0 bez probel: "+N);
//    System.out.println("stroka number2 c probel: "+str3);
//    System.out.println("dlina number2 c probel: "+l3);
//    System.out.println("stroka number2 bez probela: "+str30);
//    System.out.println("dlina number2 bez probela: "+l4);


 int x1;//identifikator sluchaya 
     int num10;//1 simbol 1 chisla
     int num20;//1 simbol 2 chisla
     char[] str200Array = str20.toCharArray();
        num10=(int)str200Array[0];
     char[] str300Array = str30.toCharArray();
       num20=(int)str300Array[0];
        int i;
    int chislo11=0;    
    int [] symbol11=new int [l2];
        int chislo12=0;

    int [] symbol12=new int [l4];
    int chislo3; 
// cluchai 1
//проверка первых символов в строках числа1 и числа 2
     if(num10>57&num20>57){//первые числа в строках = римские цифры у двух чисел
     // проверка остальных  чисел в строках ??
     x1=1;//identificator cluchaya 1

// распознаем первое и второе число
     chislo11=get100(str20);
     chislo12=get100(str30);

if(chislo11<=10&chislo12<=10){//проверка на корректность введенных чисел
chislo3=calc1(chislo11, chislo12, operation);
if (chislo3<=10&chislo3>0){//1проверка итогового числа на условие (0;10]
String rez=get40(chislo3);
//System.out.println("rezult-arab "+chislo3);
System.out.println(rez);
}//конец 1 проверки

else if (chislo3>10){//2проверка итогового числа на условие больше 10
//System.out.println("rezult-arab "+chislo3);
double chislo4=Math.floor(chislo3/10);
int chislo5=(int) chislo4;
//System.out.println("rezult-arab2 "+chislo4);
int chislo6=chislo3-chislo5*10;
if (chislo6==0){
String rez0=get50(chislo5);
System.out.println(rez0);
}
else{
String rez1=get40(chislo6);
String rez0=get50(chislo5);
rez0=rez0.concat(rez1);
System.out.println(rez0);
}
}//конец 2 проверки
//проверка отрицательного результата
else if (chislo3<=0){//3проверка итогового числа на условие <=0
System.out.println("Rezultat operacii <=0. it is not correct. Please input correct data");



}//конец 3 проверки


}



else{
System.out.println("Odno Rimskoe chislo not correct. Please input correct data");
}





}
// cluchai 2
if(num10<=57&num20<=57){//первые числа в строках = арабские цифры у двух чисел
     // проверка остальных  чисел в строках ??
     x1=2;//identificator cluchaya 2
//     System.out.println("1 symbol v 1string i v 2 string-arabskie: "+x1);

// распознаем первое и второе число
     chislo11=get1000(str20);
     chislo12=get1000(str30);




if(chislo11<=10&chislo12<=10){
int chislo31=calc1(chislo11, chislo12, operation);
// проверка на <=0
//if(chislo31<=0){
//System.out.println("Rezultat operacii <=0 - not correct. Please input correct data");
//break;
//chislo31=11;
//}
//else{
System.out.println(chislo31);
//}
}
else{
System.out.println("Odno arabic chislo not correct. Please input correct data");
} 
}
// cluchai 3
if(num10>57&num20<=57){//первые числа в строках = римские цифры у двух чисел
     // проверка остальных  чисел в строках ??
     x1=3;
     System.out.println("1 chislo rimskoe, 2 chislo arabic - chisla rasnie!:Please input coorrect string!");
}
// cluchai 4
if(num10<=57&num20>57){//первые числа в строках = римские цифры у двух чисел
     // проверка остальных  чисел в строках ??
     x1=4;
     System.out.println("1 chislo arabic, 2 chislo rimskoe - chisla rasnie!:Please input coorrect string!");
}
//System.out.println ("chislo11 "+ chislo11);
//System.out.println ("chislo12 "+ chislo12);


// дополнительная проверка чисел на 10
chislo3=calc1(chislo11, chislo12, operation);
//System.out.println ("chislo11-operation-chislo12 "+ chislo3);
//if(chislo11>10|chislo12>10|chislo3>10){
//System.out.println("Dop. control. Error. odno is chisel >10. Please input correct string.");
//}




}

///begin probel

    public static String probel(String str1)
    {
    String str2=str1.trim(); 
     
    return str2;
   }
///end probel

//распознаватель римских цифр
public static int get100(String str1)
{
int num1;
switch (str1){
                case "I":
                num1 =1;
                break;
            case "II":
                num1 = 2;
                break;
             case "III":
                num1 = 3;
                break;
             case "IV":
                num1 = 4;
                break;
            case "V":
                num1 = 5;
                break;
             case "VI":
                num1 = 6;
                break;
            case "VII":
                num1 = 7;
                break;
            case "VIII":
                num1 = 8;
                break;
             case "IX":
                num1 = 9;
                break;
             case "X":
                num1 = 10;
                break;
            default:
                System.out.println("Error. Please input correct string.");
                num1 = 11;//в строке с римскими цифрами есть другие цифры
        }
        return num1;
}

//распознаватель арабских цифр
public static int get1000(String str1)
{
int num1;
switch (str1){
                case "1":
                num1 =1;
                break;
            case "2":
                num1 = 2;
                break;
             case "3":
                num1 = 3;
                break;
             case "4":
                num1 = 4;
                break;
            case "5":
                num1 = 5;
                break;
             case "6":
                num1 = 6;
                break;
            case "7":
                num1 = 7;
                break;
            case "8":
                num1 = 8;
                break;
             case "9":
                num1 = 9;
                break;
             case "10":
                num1 = 10;
                break;
            default:
                System.out.println("Error. Please input correct string.");
                num1 = 11;//в строке с римскими цифрами есть другие цифры
        }
        return num1;
}

//перевод арабских чисел в  римские цифры  
public static String get40(int k)
    {
     //int num; 
     String num1;
     //char[] str1Array = str1.toCharArray();
     //   num=(int)str1Array[k];
     switch (k){
                case 1:
                num1 = "I";
                break;
            case 2:
                num1 = "II";
                break;
             case 3:
                num1 = "III";
                break;
             case 4:
                num1 = "IV";
                break;
            case 5:
                num1 = "V";
                break;
             case 6:
                num1 = "VI";
                break;
            case 7:
                num1 = "VII";
                break;
            case 8:
                num1 = "VIII";
                break;
             case 9:
                num1 = "IX";
                break;
             case 10:
                num1 = "X";
                break;
            default:
                System.out.println("Error. Please input correct string.");
                num1 = "O";//в строке с римскими цифрами есть другие цифры
        }
        return num1;
}

//перевод арабских чисел больше 10 и кратных 10 в  римские цифры  
public static String get50(int k)
    {
     //int num; 
     String num1;
     //char[] str1Array = str1.toCharArray();
     //   num=(int)str1Array[k];
     switch (k){
            case 1:
                num1 = "X";
                break;
            case 2:
                num1 = "XX";
                break;
            case 3:
                num1 = "XXX";
                break;
             case 4:
                num1 = "XL";
                break;
             case 5:
                num1 = "L";
                break;
            case 6:
                num1 = "LX";
                break;
             case 7:
                num1 = "LXX";
                break;
            case 8:
                num1 = "LXXX";
                break;
            case 9:
                num1 = "XC";
                break;
             case 10:
                num1 = "C";
                break;
             case 11:
                num1 = "CX";
                break;
            default:
                System.out.println("Error. Please input correct string.");
                num1 = "O";//в строке с римскими цифрами есть другие цифры
        }
        return num1;
}



public static int maxzn(String str1)//ищем номер элемента массива, в котором есть символ операции
    {
     int num1;
     int num2;
     int num3;
     int num4; 
     char[] str1Array = str1.toCharArray();
     num1=str1.indexOf('+');
     num2=str1.indexOf('-');
     num3=str1.indexOf('*');
     num4=str1.indexOf('/');
     int max1 = Math.max(num1, num2);
     int max2 = Math.max(num3, num4);
     int max3 = Math.max(max1, max2); 
    return max3;
   }

 
      
public static char get2(String str1, int k)
    {
     char simbol; 
     char[] str1Array = str1.toCharArray();
        simbol=str1Array[k];
     
    return simbol;
   }
  
  public static String getOperation(){
        System.out.println("Input string:");
        String operation0 = scanner.nextLine();
       
        return operation0;
    }
  
  public static int calc1(int num1, int num2, char operation){
        int result1;
        switch (operation){
            case '+':
                result1 = num1+num2;
                break;
            case '-':
                result1 = num1-num2;
                break;
            case '*':
                result1 = num1*num2;
                break;
            case '/':
                result1 = num1/num2;
                break;
            default:
                System.out.println("Error. Please input correct string.");
                result1 = 0;//рекурсия
        }
        return result1;
    }
     
}
