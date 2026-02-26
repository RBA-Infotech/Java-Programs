package StringPrgms;

import java.util.Scanner;

public class UniqueCharacters {

		         public static void main(String[] args) {
		             Scanner sc=new Scanner(System.in);
		             System.out.println("Enter the sentence:");
		             String str=sc.nextLine().toLowerCase();
		             str=str.replaceAll(" ","");
		             System.out.println("Lower Case: " + str);
		           // System.exit(0);
		            
		            for(int i=0;i<str.length();i++)
		            {
		                if(str.charAt(i)<'a'||str.charAt(i)>'z'){
		                    System.out.println("Invalid sentence");
		                    System.exit(0);
		                }
		            }
		            char[] ch=str.toCharArray();
		            char[] unique=new char[ch.length];
		            int k=-1,notUnique=0;
		            for(int i=0;i<ch.length;i++)
		            {
		              // int pos=i;
		                
		                for(int j=i+1;j<ch.length;j++)    //javasarava  o/p: j, s 
		                {
		                        if(ch[i]==ch[j])
		                        {
		                            System.out.println("ch[i] = "+ ch[i]);
		                            notUnique=1;
		                            break;
		                        }
		                }
		                System.out.println();
		                
		                if(notUnique==0)
		                {
		                    unique[++k]=ch[i];
		                }
		                else
		                notUnique=0;
		            }
		            
		            if(k==-1)
		            System.out.println("no unique characters");
		            else
		            {
		                System.out.println("Unique characters:");
		                for(int i=0;i<k;i++)
		                System.out.println(unique[i]);
		            }
		        }
		    }

