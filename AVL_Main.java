/* 

AVL

*/

import java.util.Scanner;
import java.util.Stack;


class node
{
	String custnm;
	int tele;	
	node left;
	node right;
	
	node(String cn,int t)
	{
		custnm=cn;
		tele=t;
		left=null;
		right=null;
	}
	
}

class AVL
{
	Scanner sc=new Scanner(System.in);
	node root,temp;
	int bal;
	
	AVL()
	{
		root=null;
	}
	
	
	void create()
	{
		char ch;
		Scanner sc= new Scanner(System.in);
		
		do
		{
			
			System.out.print("Enter the customer name: ");
			String custnm=sc.next();

			System.out.print("Enter the telephone number: ");
			int tele=sc.nextInt();
			
			root=insert(root,custnm,tele);
			
			System.out.println("Do you want to continue creating? (Y/N) ");
			ch=sc.next().charAt(0);
			
		}while(ch=='y'||ch=='Y');
	}
	
	
	
	node insert(node lroot,String custnm,int tele)
	{
		
		if(lroot==null)
		{
			return new node(custnm,tele);
			
		}
		if(custnm.compareTo(lroot.custnm)<0)
		{
			lroot.left=insert(lroot.left,custnm,tele);
		}
		else if(custnm.compareTo(lroot.custnm)>0)
		{
			lroot.right=insert(lroot.right,custnm,tele);
		}

		

		int bf=BF(lroot);

		
		if((bf>1)&&(custnm.compareTo(lroot.left.custnm)<0))
		{
			return LL(lroot);				
		}
		if((bf<-1)&&(custnm.compareTo(lroot.right.custnm)>0))
		{
			return RR(lroot);				
		}

		if((bf>1)&&(custnm.compareTo(lroot.left.custnm)>0))
		{
			return LR(lroot);				
		}

		if((bf<-1)&&(custnm.compareTo(lroot.right.custnm)<0))
		{
			return RL(lroot);				
		}
	
	
		return lroot;
		
	}
	
	
	node LL(node lroot)
	{
		System.out.println("------> LL rotation");
		node x=lroot.left;
		node t2=x.right;

		x.right=lroot;
		lroot.left=t2;
		
		return x;
	}
	
	node RL(node lroot)
	{
		System.out.println("-->RL rotation :");
		lroot.right=LL(lroot.right);
		node x=RR(lroot);
		
		return x;
	}
	
	node RR(node lroot)
	{
		System.out.println("------> RR rotation");
		node x=lroot.right;
		node t2=x.left;

		x.left=lroot;
		lroot.right=t2;
		
		return x;
	}
	
	node LR(node lroot)
	{
		System.out.println("--> LR rotation :");
		lroot.left=RR(lroot.left);
		node x=LL(lroot);
			
		return x;
	}
	
			
	int height(node lroot)
	{

		if(lroot==null)
			return 0;
		else
		{
			int l=height(lroot.left);
			int r=height(lroot.right);
			
			return (((l>r)?l:r)+1);
		}
	}
	
	
	int BF(node lroot)
	{
		
		if(lroot==null)
			return 0;
		
		return height(lroot.left)-height(lroot.right);
	}
	
	
	void display()
	{
	   
	    node ptr=root;
		Stack<node> s=new Stack<node>();
		
		System.out.println("-----------------------------------------");
		System.out.println("Customer name\t\t Telephone no.");
		System.out.println("-----------------------------------------\n");
		while(true)
		{
			while(ptr!=null)
			{
				s.push(ptr);
				ptr=ptr.left;
			}
			
			if(s.isEmpty())
				break;
			
			ptr=s.pop();
			System.out.println(ptr.custnm+"\t\t\t"+ptr.tele);
			ptr=ptr.right;			
			
		}
	   
		System.out.println("-----------------------------------------\n");
		System.out.println("\nHeight of tree = "+height(root));
	}

}

public class AVL_Main
{
	public static void main(String args[])
	{
		
		AVL tree=new AVL();
		
		int ch;
		Scanner sc=new Scanner(System.in);
		tree.create();
		
		do
		{
			System.out.println("");
			System.out.println("\n=====MENU=====");
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Exit");
			System.out.println("==============\n");
			 
			
			System.out.println("Enter your choice : ");
			ch=sc.nextInt();
			System.out.println("");
			switch(ch)
			{

				  case 1:
				     tree.create();
				     break;
				  case 2:
				      tree.display();
				      break;		  
				  
			}
		
		}while(ch>0&&ch<3);

		
		
	}
}


/*


OUTPUT:

Enter the customer name: easter
Enter the telephone number: 908756432
Do you want to continue creating? (Y/N)
y
Enter the customer name: gita
Enter the telephone number: 890564321
Do you want to continue creating? (Y/N)
y
Enter the customer name: barry
Enter the telephone number: 980778908
Do you want to continue creating? (Y/N)
n


=====MENU=====
1.Insert
2.Display
3.Exit
==============

Enter your choice :
2

-----------------------------------------
Customer name          Telephone no.
-----------------------------------------

barry                   980778908
easter                  908756432
gita                    890564321
-----------------------------------------


Height of tree = 2


=====MENU=====
1.Insert
2.Display
3.Exit
==============

Enter your choice :
1

Enter the customer name: dim
Enter the telephone number: 890432456
Do you want to continue creating? (Y/N)
n


=====MENU=====
1.Insert
2.Display
3.Exit
==============

Enter your choice :
2

-----------------------------------------
Customer name          Telephone no.
-----------------------------------------

barry                   980778908
dim                     890432456
easter                  908756432
gita                    890564321
-----------------------------------------


Height of tree = 3


=====MENU=====
1.Insert
2.Display
3.Exit
==============

Enter your choice :
1

Enter the customer name: chhanam
Enter the telephone number: 908765457
-->RL rotation :
------> LL rotation
------> RR rotation
Do you want to continue creating? (Y/N)
n


=====MENU=====
1.Insert
2.Display
3.Exit
==============

Enter your choice :
2

-----------------------------------------
Customer name          Telephone no.
-----------------------------------------

barry                   980778908
chhanam                 908765457
dim                     890432456
easter                  908756432
gita                    890564321
-----------------------------------------


Height of tree = 3


=====MENU=====
1.Insert
2.Display
3.Exit
==============

Enter your choice :
3


*/
