// Implement Simple Queue using array that performs following operations: INSERT, DELETE, DISPLAY

import java.util.*;
class queueDemo{
	public static void main(String[] args){
		queue q=new queue();
		Scanner sc=new Scanner(System.in);
		
		
		int n;

		while(true){
			System.out.print("Enter 1 for equeue \nEnter 2 for dqueue \nEnter 3 for display\n");
		
			int op=sc.nextInt();

			switch(op){
				case 1:
					System.out.print("Enter Number: ");
					n=sc.nextInt();
					q.equeue(n);
					break;

				case 2:
					System.out.println("deleted element from queue: "+q.dqueue());
					
					break;

				case 3:
					q.display();
					break;
			}

		}
		
	}
	
	
}
class queue{
	int[] arr=new int[5];
	int rear=-1;
	int front=-1;

	public  void equeue(int n){
		if(rear>5 && front==0){
			System.out.println("Queue overflow");
		}
		else{
			if(rear==-1){
				front=0;
			}
			rear++;
			arr[rear]=n;
		}
	}

	public  int dqueue(){
		if(front==-1){
			System.out.println("Queue Is Empty");
		}	
		else{
			if(front>4){
				System.out.println("Queue Overflow");
			}
			else{
				front++;
				return arr[front-1];
			}
		}
		return 0;
	}

	public  void display(){
		
		if(front>rear){

			for(int i=front;i<arr.length;i++){
				System.out.print(arr[i]+", ");
			}
			for(int j=0;j<=rear;j++){
				System.out.print(arr[j]+", ");
			}
			
		}

		else{

			for(int i=front;i<=rear;i++){
				System.out.print(arr[i]+", ");
			}

		}
		System.out.println("");
	}
}