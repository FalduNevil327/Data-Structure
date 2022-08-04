// Write a program for evaluation of pre-fix Expression using Stack.

	import java.util.*;
	class evalution_prefix{

		static evalution_prefix obj=new evalution_prefix();
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
					op1=obj.pop();
					op2=obj.pop();
					value=op1+op2;
					obj.push(value);
					break;

				case 45:
					op1=obj.pop();
					op2=obj.pop();
					value=op1-op2;
					obj.push(value);
					break;

				case 42:
					op1=obj.pop();
					op2=obj.pop();
					value=op1*op2;
					obj.push(value);
					break;

				case 47:
					op1=obj.pop();
					op2=obj.pop();
					value=op1/op2;
					obj.push(value);
					break;
			}
		}

		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);

			System.out.print("enter postfix expression: ");
			String str=sc.nextLine();

			for(int i=str.length()-1;i>=0;i--){
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