/******************************************************************************

                    Finding Maximum Breadth of the BST

*******************************************************************************/

public class MaxBreadth
{
    
    public static int traverseRight(Node root){
        if(root==null)
            return 0;
        return Math.max(traverseRight(root.right)+1,traverseRight(root.left)-1);
    }
    
    public static int traverseLeft(Node root){
        if(root==null)
            return 0;
        return Math.max(traverseLeft(root.right)-1,traverseLeft(root.left)+1);
    }
    
    public static int verticalWidth(Node root) {
        if(root==null)
            return 0;
        int right=traverseRight(root);
        int left=traverseLeft(root);
        return left+right-1;
    }
    
}
