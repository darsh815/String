import java.util.Scanner;
class str
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String 1");
        String a=sc.next();

        System.out.println("Enter String 2");
        String b=sc.next();

        System.out.println("Enter String 3");
        String c=sc.next();

        if(a.equalsIgnoreCase(b))
        {
            System.out.println("String 1 and 2 are equal");
        }
        if(b.equalsIgnoreCase(c))
        {
            System.out.println("String 2 and 3 are equal");
        }
        if(c.equalsIgnoreCase(a))
        {
            System.out.println("String 3 and 1 are equal");
        }
        else 
        {
            System.out.println("String are not equal");
        }
        String builder=a.concat(" "+b+" "+c);

        System.out.println("Concated string is " + builder);

        System.out.println("Enter character to find");
        char se=sc.next().charAt(0);

        System.out.println("Position of character is " + builder.indexOf(se));
        System.out.println("Positopn of character is " + builder.lastIndexOf(se));
        //System.out.println("Positopn of character is " + a.contains(se));
                

        System.out.println("Substring is " + builder.substring(5));
        }
    }