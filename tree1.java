
public class tree1 {

	 class node
	 {
		 node left;
		 node right;
		 int data;
	 }
	node parent = null;
	node left_child = null;
	node right_child = null;
	
	 public void binarytree(int[] arr, int root)
	 {
		 parent.data = root;
		 parent.left = left_child;
	 }
	
	
	 public static void main(String[] args)
	 {
		 int[] arr = {4,5,2,1};
		 tree1 tree = new tree1();
		 int root;
		 root = 2;
		 tree.addtree(arr,root);
		 
	 }
}


