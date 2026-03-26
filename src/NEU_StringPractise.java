import java.util.Scanner;
import java.util.TreeSet;

public class NEU_StringPractise {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String arr=sc.nextLine();
        String result0=arr.replace("."," ");
        String result1=result0.replace("?"," ");
        String result2=result1.replace("!"," ");
        String result3=result2.replace(","," ");
        String result4=result3.replace(";"," ");
        String result5=result4.replace(":"," ");
        result0=result5.toLowerCase();
//        System.out.println(result0);
        String[] parts=result0.split(" ");
        TreeSet<String> set=new TreeSet<>();
        for(int i=0;i<parts.length;i++){
            set.add(parts[i]);
        }
        for(String s:set){
            System.out.print(s);
            System.out.print(" ");
        }
    }
}
