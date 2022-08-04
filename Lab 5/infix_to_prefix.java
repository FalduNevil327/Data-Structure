// Implement a program to convert in-fix notation to pre-fix notation using stack.


import java.util.Scanner;

public class infix_to_prefix{

	static infix_to_prefix obj = new infix_to_prefix();
	static int top=-1;
	char [] stack = new char[100];

	public static int precedence(char c){
		switch(c){
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
		}
		return c;
	}

	public void push(char c){
		int x;
		if(top>=100){
			System.out.println("Stack Overflow.");
		}
		else{
			top++;
			stack[top]=c;	
		}
	}

	public char pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
			return 0;
		}
		return stack[top--];
	}

	public char peek(){
		if(top==-1){
			System.out.println("Stack Underflow");
			return 0;	
		}
		else{
			return stack[top];
		}
	}

	public String toPostfix(String infix)
	{
		
			char symbol;
			String postfix="";
			
			for(int i=0;i<infix.length();i++)
			{
				symbol = infix.charAt(i);

				if(Character.isLetter(symbol))
					postfix=postfix+symbol;
				else if(symbol=='(')
				{
					obj.push(symbol);
				}
				else if(symbol==')')
				{
					while(obj.peek()!='(')
					{
						postfix=postfix+obj.pop();
					}
					obj.pop();
				}
				else
				{
					while(top!=-1 && !(obj.peek()=='(') && precedence(symbol)<=precedence(obj.peek()))
					{
						postfix=postfix+obj.pop();
					}
					obj.push(symbol);
				}
			}
			while(top!=-1)
			{
				postfix=postfix+obj.pop();  
			}
			return postfix;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String infix="";

		System.out.println("Enter Expression: ");
		String str = sc.nextLine();

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='('){
				infix+=')';
			}
			else if(str.charAt(i)==')'){
				infix+='(';
			}
			infix+=str.charAt(i);

        }
        
        String postfix=obj.toPostfix(infix);
        String prefix="";
        
        for(int i=postfix.length()-1;i>=0;i--){
            prefix+=postfix.charAt(i);
        }
		System.out.println("Prefix expression is: "+prefix);
        
        

	}
}