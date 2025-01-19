class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        helper(root, li);
        return li;
    }
    public void helper(TreeNode root, List<Integer> li){
        if(root==null){
            return;
        }
        helper(root.left,li);
        helper(root.right,li);
        li.add(root.val);
    }
}