class StrJoin{
public static void main(String args[]){
String s1=new String("Hello");
String s2=new String("World");
String s3=new String("Java");
String s=String.join("!!!!!!!!!!",s1,s2,s3);
String S=String.join("\n",s1,s2,s3);
System.out.println(s.toString());
System.out.println(S.toString());
}
}