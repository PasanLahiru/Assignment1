public class Tree {
	Object[] array;
	static int root = 0;
	
	public Tree() {
		array = new Object[10];
	}
	
	public boolean empty() {
		return (array[1] == null);
	}
	
	public int left(int i) {
		return 2*i;
	}
	
	public int right(int i) {
		return 2*i + 1;
	}
	
	public int parent(int i) {
		return i/2;
	}
	
	public Object getCargo(int i,Object obj) {
		if(i < 0 || i >= array.length) {
			return null;
		} 
			return array[i];
	}
	
	public void setCargo(int i,Object obj) {
		if(i < 0 || i >= array.length) {
			return ;
		} 
			array[i] = obj;
	}
	
	public void printTree() {
		for(int  i=0; i<10; i++){
			if(array[i] != null){
				System.out.print(array[i] + " ");
			}
		}
	}

/*	public void printPreorder(int i) {
		if(getCargo (i) == null) return;
		System.out.println(getCargo (i));
		printPreorder (left (i));
		printPreorder (right (i));
	}	**/
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		int root = 1;
		tree.setCargo(root, "cargo for root");
		tree.left(2);
		tree.printTree();
	}
	
}