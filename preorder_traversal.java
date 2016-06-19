class tree
{
	class node
	{
		int data;
		node left = null;
		node right =null;
		node(int data)
		{
			this.data = data;
		}
		
	}
	node tree_parent;
	public node add(int inputdata, node tree_parent)
	{ 
		tree_parent = this.tree_parent;
		
		if(this.tree_parent==null)
		{
			this.tree_parent = new node(inputdata);
			
		}
		
		else{
			
			if(inputdata>= tree_parent.data)
			{
				
				tree_parent.left = add(inputdata,tree_parent.left);
			}
			else
			{
			   tree_parent.right = add(inputdata,tree_parent.right);
		    }
		}
		 return tree_parent;
		
}
	public void treetraversal(node parent_tree)
	{
		parent_tree = this.tree_parent;
		if(parent_tree != null)
		{
			System.out.println("hello");
			System.out.println(parent_tree.data);
			treetraversal(parent_tree.left);
			treetraversal(parent_tree.right);
		}
	}
}
public class preorder_traversal {
public static void main(String[] args)
{
	
	tree newtree = new tree();
	newtree.add(2,newtree.tree_parent);
	newtree.add(4,newtree.tree_parent);
	newtree.add(8,newtree.tree_parent);
	newtree.add(1,newtree.tree_parent);
	newtree.add(0,newtree.tree_parent);
	newtree.add(10,newtree.tree_parent);
	
	newtree.treetraversal(newtree.tree_parent);
}
}
