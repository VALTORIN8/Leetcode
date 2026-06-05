int sumOfLeftLeaves(struct TreeNode* root) {
    if (!root) return 0;
    
    int sum = 0;
    
    // Check if left child is a leaf
    if (root->left && !root->left->left && !root->left->right)
        sum += root->left->val;
    else
        sum += sumOfLeftLeaves(root->left);
    
    // Always recurse right (no left leaves directly on right path)
    sum += sumOfLeftLeaves(root->right);
    
    return sum;
}