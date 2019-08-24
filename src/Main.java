import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int flag=0;
        Scanner scan=new Scanner(System.in);
        String pwd="";
        pwd=scan.nextLine();
        int b=pwd.length();
        int count=0;
        int flag1=0;
        for(int i=0;i<pwd.length();i++){
        int d=pwd.charAt(i);
            if(d>=48 && d<=57 || d>=97 && d<=122){
                flag=1;
            }
            else{
                flag=0;
                break;
            }
            if(i+1<=pwd.length()-1)
            if((int)pwd.charAt(i+1)-(int)pwd.charAt(i)==1){
                count++;
                if (count == 4) {
                    System.out.println("It must not contain 5 or more letter and no. in seq.");
                    flag1=1;
                    break;
                }

            }
            else count=0;

        }
        if(flag1==0 && flag==1 && b>=5 && b<=12)
            System.out.println("Accepted");
        else if(flag1==0 && flag==0) System.out.println("it should contain letter and number only");
        else if(flag1==0 && b<=5 || b>=12) System.out.println("it should contain 5 to 12 digits");
        else if(flag1==0 && flag==0 &&  b<=5 || b>=12) System.out.println("it should contain " +
                "letter and number only"+"\n"+"it should contain 5 to 12 digits");

    }
}
