int evalRPN(char** tokens, int tokensSize) {
    int stack[tokensSize];
    int top = -1;

    for(int i = 0; i < tokensSize; i++) {

        char* token = tokens[i];

        if(token[0] >= '0' && token[0] <= '9' ||
           token[0] == '-' && token[1] != '\0') {

            stack[++top] = atoi(token);
        }
        else {
            int b = stack[top--];
            int a = stack[top--];

            if(token[0] == '+')
                stack[++top] = a + b;

            else if(token[0] == '-')
                stack[++top] = a - b;

            else if(token[0] == '*')
                stack[++top] = a * b;

            else if(token[0] == '/')
                stack[++top] = a / b;
        }
    }

    return stack[top];
}