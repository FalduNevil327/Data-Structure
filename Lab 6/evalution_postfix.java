// Write a program for evaluation of post-fix Expression using Stack.


import java.util.*;
class evalution_postfix{
	static evalution_postfix obj=new evalution_postfix();
	int[] stack=new int[100];
	static int top=-1;
	
	

	public void push(int c){
		if(top>=100){
			System.out.println("Stack Overflow.");
		}
		else{
			top++;
			stack[top]=c;
		}
	}

	public int pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
			return 0;
		}
		return stack[top--];
	}

	public void opr(int c){
		int op1,op2,value;
		switch(c){
			case 43:
				op2=obj.pop();
				op1=obj.pop();
				value=op1+op2;

				obj.push(value);
				break;

			case 45:
				op2=obj.pop();
				op1=obj.pop();
				value=op1-op2;

				obj.push(value);
				break;

			case 42:
				op2=obj.pop();
				op1=obj.pop();
				value=op1*op2;

				obj.push(value);
				break;

			case 47:
				op2=obj.pop();
				op1=obj.pop();
				value=op1/op2;

				obj.push(value);
				break;

		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("enter postfix expression: ");
		String str=sc.nextLine();

		for(int i=0;i<str.length();i++){
			int c=str.charAt(i);

			if(c==45 || c==43 || c==42 || c==47){
				obj.opr(c);
			}
			else{
				int temp=(int)c-48;
				obj.push(temp);
			}
		}
		System.out.print(obj.pop());

	}
}