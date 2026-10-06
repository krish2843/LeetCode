int largestRectangleArea(int* heights, int heightsSize) {

    int* stack = malloc(heightsSize * sizeof(int));

    int top = -1;
    int maxArea = 0;

    for (int i = 0; i <= heightsSize; i++) {

        int current = (i == heightsSize)
                       ? 0
                       : heights[i];

        while (top >= 0 &&
               current < heights[stack[top]]) {

            int height = heights[stack[top--]];

            int width;

            if (top == -1)
                width = i;
            else
                width = i - stack[top] - 1;

            int area = height * width;

            if (area > maxArea)
                maxArea = area;
        }

        if (i < heightsSize)
            stack[++top] = i;
    }

    free(stack);

    return maxArea;
}