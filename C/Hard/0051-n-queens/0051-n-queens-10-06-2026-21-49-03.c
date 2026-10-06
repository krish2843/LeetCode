void solve(int row, int n, char** board,
           int* cols, int* diag1, int* diag2,
           char*** result, int* returnSize,
           int* returnColumnSizes) {

    if (row == n) {

        result[*returnSize] = malloc(n * sizeof(char*));

        for (int i = 0; i < n; i++)
            result[*returnSize][i] = strdup(board[i]);

        returnColumnSizes[*returnSize] = n;
        (*returnSize)++;

        return;
    }

    for (int col = 0; col < n; col++) {

        if (cols[col] ||
            diag1[row - col + n - 1] ||
            diag2[row + col])
            continue;

        board[row][col] = 'Q';

        cols[col] = 1;
        diag1[row - col + n - 1] = 1;
        diag2[row + col] = 1;

        solve(row + 1, n, board,
              cols, diag1, diag2,
              result, returnSize,
              returnColumnSizes);

        board[row][col] = '.';

        cols[col] = 0;
        diag1[row - col + n - 1] = 0;
        diag2[row + col] = 0;
    }
}

char*** solveNQueens(int n, int* returnSize,
                     int** returnColumnSizes) {

    char*** result = malloc(10000 * sizeof(char**));

    *returnColumnSizes = malloc(10000 * sizeof(int));

    *returnSize = 0;

    char** board = malloc(n * sizeof(char*));

    for (int i = 0; i < n; i++) {

        board[i] = malloc((n + 1) * sizeof(char));

        for (int j = 0; j < n; j++)
            board[i][j] = '.';

        board[i][n] = '\0';
    }

    int cols[n];
    int diag1[2 * n - 1];
    int diag2[2 * n - 1];

    memset(cols, 0, sizeof(cols));
    memset(diag1, 0, sizeof(diag1));
    memset(diag2, 0, sizeof(diag2));

    solve(0, n, board, cols, diag1, diag2,
          result, returnSize, *returnColumnSizes);

    return result;
}