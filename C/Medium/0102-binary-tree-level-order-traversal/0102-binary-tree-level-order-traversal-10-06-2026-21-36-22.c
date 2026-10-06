int** levelOrder(struct TreeNode* root, int* returnSize,
                 int** returnColumnSizes) {

    if(root == NULL) {
        *returnSize = 0;
        return NULL;
    }

    int** ans = malloc(2000 * sizeof(int*));
    *returnColumnSizes = malloc(2000 * sizeof(int));

    struct TreeNode* queue[2000];

    int front = 0;
    int rear = 0;
    int level = 0;

    queue[rear++] = root;

    while(front < rear) {

        int size = rear - front;

        ans[level] = malloc(size * sizeof(int));
        (*returnColumnSizes)[level] = size;

        for(int i = 0; i < size; i++) {

            struct TreeNode* node = queue[front++];

            ans[level][i] = node->val;

            if(node->left != NULL)
                queue[rear++] = node->left;

            if(node->right != NULL)
                queue[rear++] = node->right;
        }

        level++;
    }

    *returnSize = level;

    return ans;
}