
public class StackImplementationUsingArrays {
	
		int top;
		int max = 1000;
		int a[] = new int[max];
		StackImplementationUsingArrays() {
			top = -1;
		}
	public static void main(String[] args) {
		StackImplementationUsingArrays sn = new StackImplementationUsingArrays();
		boolean flag = sn.isEmpty();
		System.out.println(flag);
		sn.push(10);
//		sn.push(20);
//		sn.push(30);
		
		System.out.println("The popped element is -" +sn.pop());
		System.out.println("The popped element is -" +sn.pop());
	}
	private int pop() {
		int ele = -1;
		if(top<0) {
			System.out.println("The stack is empty, its an underflow condition");
			return ele;
		}
		ele = a[top] ;
		top = top-1;
		return ele;
	}
	private void push(int data) {
		if(top>=max-1) {
			System.out.println("The stack is full, its an overflow condition");
		}else {
			top = top+1;
			a[top] = data;
			System.out.println("the pushed element is - "+a[top]);
		}
		
	}
	private boolean isEmpty() {
		if(top<0) {
			return true;
		}
		return false;
	}
}
