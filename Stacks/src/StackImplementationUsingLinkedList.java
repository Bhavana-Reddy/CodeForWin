
public class StackImplementationUsingLinkedList {
	class StackNode{
		int data;
		StackNode next;
		StackNode(int d){
			data = d;
		}
		
	}
	StackNode root; 
  public static void main(String[] args) {
	  StackImplementationUsingLinkedList sll = new StackImplementationUsingLinkedList();
	  System.out.println(sll.isEmpty());
	  sll.push(10);
	  sll.push(20);
	  System.out.println("Checking if the stack is empty or not - "+sll.isEmpty());
	  
	  System.out.println("the poped element is -"+sll.pop());
	  
  }
  private int pop() {
	// TODO Auto-generated method stub
	  int popEle =-1;
	  if(root==null) {
		  System.out.println("The stack is Empty, cant pop elements");
		  return popEle;
	  }
	 // System.out.println("Now the root element before popping is - "+root.data);
	  popEle = root.data;
	  root = root.next;
	  //System.out.println("Now the root element after popping is - "+root.data);
	return popEle;
}
private boolean isEmpty() {
	// TODO Auto-generated method stub
	  if(root==null) {
		  return true;
	  }
	return false;
}
public void push(int i) {
	StackNode newNode = new StackNode(i);
	if(root==null) {
		root = newNode;
	}else {
		newNode.next = root;
		root = newNode;
	}
	System.out.println("The pushed element is - "+root.data);//+" the value of root.data is - "+root.data+" The value of i is - "+i);
  }
  
  
}
