import java.util.Scanner;

class Stack1{

	int arr[];
	int tos = -1;
	int length = 0;
	
	void assign(int length){
		this.length = length;
		this.arr = new int[length];
		for(int i = 0; i<length; i++)
			this.arr[i] = 0;

		System.out.println("Stack: ");
		for(int i = 0; i<length; i++)
			System.out.print(this.arr[i]+"\t");
		System.out.println();
	}

	void pop(){
		System.out.println();
		if(tos == -1)
			System.out.println("Stack Underflow");
		else{
			this.arr[tos] = 0;
			tos--;
		}
	}

	void push(int n){
		System.out.println();
		if(tos>=length-1)
			System.out.println("Stack Overflow");
		else{
			tos++;
		    this.arr[tos] = n;
		}
	}

	void display(){
		System.out.println("Stack: ");
		    for(int i = 0; i<length; i++)
			    System.out.print(this.arr[i]+"\t");
		    System.out.println();
	}
}


class Stack{
	public static void main(String args[]){
		
		Stack1 obj = new Stack1();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stack size: ");
		int size = sc.nextInt();
		
		obj.assign(size);
		System.out.println();
		int ch = 0;

		while(ch != 4){
			System.out.println();
			System.out.println("Enter your choice: \n1.Push\n2.Pop\n3.Display\n4.exit");
		    ch = sc.nextInt();

		switch(ch){
			case 1:
			    System.out.println("Enter element:");
			    int i = sc.nextInt();
			    obj.push(i);
			    break;

			case 2:
			    obj.pop();
			    break;

			case 3:
			    obj.display();
			    break;
		}

		}
		obj.display();
		
	}

}
