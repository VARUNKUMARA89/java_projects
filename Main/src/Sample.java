import java.util.*;

class Nodee {
    int data;
    Nodee left;
    Nodee right;

    public Nodee(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


class Bst{
    public Nodee root;

    public Bst(){
        root = null;
    }

    public Nodee insert(Nodee node, int data){
        Nodee newNode = new Nodee(data);
        if(root==null){
            root=newNode;
            return root;
        }
        if(node== null){
            node = newNode;
            return node;
        }
        else {
            if(data>node.data){
                node.right=insert(node.right,data);
            }
            if(data<node.data){
                node.left=insert(node.left,data);
            }

        }
        return node;
    }

    public Nodee minNode(Nodee root) {
        if (root.left != null)
            return minNode(root.left);
        else
            return root;
    }


    public Nodee deleteNode(Nodee node, int value) {
        if(node == null){
            return null;
        }
        else {
            if(value < node.data)
                node.left = deleteNode(node.left, value);
            else if(value > node.data)
                node.right = deleteNode(node.right, value);
            else {
                if(node.left == null && node.right == null)
                    node = null;

                else if(node.left == null) {
                    node = node.right;
                }
                else if(node.right == null) {
                    node = node.left;
                }
                else {
                    Nodee temp = minNode(node.right);
                    node.data = temp.data;
                    node.right = deleteNode(node.right, temp.data);
                }
            }
            return node;
        }
    }

    public void inorderTraversal(Nodee node) {
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {

            if(node.left!= null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if(node.right!= null)
                inorderTraversal(node.right);

        }
    }

    void levelOrder(Nodee root) {
        if(root == null)
            return;

        Queue<Nodee> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Nodee curr = q.poll();

            if (curr == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    System.out.println();
                }
            } else {
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);

                System.out.print(curr.data + " ");
            }
        }
    }

    Nodee searchAncestor(Nodee root, int p, int q){
        if((p < root.data && q > root.data) || (p > root.data && q < root.data)){
            return root;
        }else if ((p < root.data && q < root.data)){
            return searchAncestor(root.left, p, q);
        }else if ((p > root.data && q > root.data)){
            return searchAncestor(root.right, p, q);
        }
        return root;
    }
}
class Sample  {
    public static void main(String[] args) {

        Bst bt = new Bst();
        bt.insert(bt.root,13);
        bt.insert(bt.root,7);
        bt.insert(bt.root,22);
        bt.insert(bt.root,4);
        bt.insert(bt.root,15);
        bt.insert(bt.root,25);
        bt.insert(bt.root,2);
        bt.insert(bt.root,9);
        bt.insert(bt.root,14);
        bt.insert(bt.root,17);
        bt.insert(bt.root,27);

        System.out.println();
        Nodee n = bt.searchAncestor(bt.root, 7, 27);
        System.out.println(n.data);


    }
}
