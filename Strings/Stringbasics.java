
import java.lang.*;
public class Stringbasics {
    //Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
       String str="java";
       str.concat("program");
       System.out.println(str);
       String str2="python ";
       str2=str2.concat("program");
       System.out.println(str2);
       System.out.println("length():"+str.length());
       System.out.println("charAt(1):"+str.charAt(1));
       System.out.println("substring(2):"+str.substring(2)+" ' ");
       System.out.println("substring(2,7):"+str2.substring(2,7)+" '");
       System.out.println("toLowerCase():"+str.toLowerCase()+" '");
       System.out.println("toUpperCase():"+str.toUpperCase()+" '");
       System.out.println("trim:"+str2.trim()+" '");
       System.out.println("equals():"+str.equals(str2)+" '");
       System.out.println("equalsIgnoreCase():"+str.equalsIgnoreCase(str2)+" '");
       System.out.println("compareTo():"+str.compareTo(str2)+" '");
       System.out.println("contains(\"while\"):"+str.contains("while")+ " '");
       System.out.println("replace('i','*'):"+str.replace('i','*')+" '");
       String[] parts=str2.trim().split(" ");
       System.out.println("split(\" \"): first word='" + parts[0] + "', second word='" + parts[1] +" '");
       System.out.println(str2.indexOf("y"));
        System.out.println(str2.lastIndexOf("p"));
        System.out.println(str2.startsWith("log"));
        System.out.println(str2.endsWith("lie"));

    //String comparison
    //1.== operator
    String a= "Charanya";
    String b="Charanya";
    String c= new String("Charanya");
    System.out.println(a==b);
    System.out.println(a==c);
    //2.equals ---> upper and lower also should be same
    String d="Charanya";
    String e= new String("Charanya");
    System.out.println(d.equals(e));
    //3.equalsIgnoreCase() --> ignore lower and upper cases
    String f="Charanya";
    String g= new String("CHARANYA");
     System.out.println(f.equalsIgnoreCase(g));
     //4.compare()
     System.out.println("apple".compareTo("apple"));
     System.out.println("banana".compareTo("apple"));
     System.out.println("apple".compareTo("banana"));

     //String concatenation
     //1.+
     String first="java";
     String second="program";
     String res=first + second;
     System.out.println(res);
     //2.concat()
      String str3="python ";
       str3=str3.concat("program");
       System.out.println(str3);
     
       //Converting strings 
       //1.toCharArray(): converts string into an array of characters
       String str5="java123";
       char[] chars=str5.toCharArray();
       System.out.print("characters:");
       for(char ch :chars)
       {
        System.out.print(ch+" ");
       }
       System.out.println();
       //2. to byte array
       byte[] bytes=str5.getBytes();
       System.out.println("Bytes:");
       for(byte by:bytes)
       {
        System.out.print(by);
       }
       System.out.println();
       //3.parse integer
       String numStr="123";
       int num=Integer.parseInt(numStr);
       System.out.println(num);
       //Methods
       StringBuilder sb=new StringBuilder("Logic");
       sb.append("while");
       System.out.println("After append:"+sb);
       sb.insert(6, " and");
       System.out.println("After insert:"+sb );
       sb.replace(0, 5, "Loop");
       System.out.println("After replace:"+sb);
       sb.reverse();
       System.out.println("After reverse:"+sb);
       String finalString=sb.toString();
       System.out.println("Final string:"+finalString);

       StringBuffer bs=new StringBuffer("Logic");
       bs.append("while");
       System.out.println("After append:"+bs);
       bs.insert(6, " and");
       System.out.println("After insert:"+bs );
       bs.replace(0, 5, "Loop");
       System.out.println("After replace:"+bs);
       bs.delete(4,8);
       System.out.println("After delete:"+bs);
       bs.reverse();
       System.out.println("After reverse:"+bs);
         String finalString1=bs.toString();
       System.out.println("Final string:"+finalString1);
   }
}
