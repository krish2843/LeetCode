struct ListNode* mergeTwo(struct ListNode* a,
                           struct ListNode* b) {

    struct ListNode dummy;
    struct ListNode* current = &dummy;

    while(a != NULL && b != NULL) {

        if(a->val < b->val) {
            current->next = a;
            a = a->next;
        }
        else {
            current->next = b;
            b = b->next;
        }

        current = current->next;
    }

    if(a != NULL)
        current->next = a;
    else
        current->next = b;

    return dummy.next;
}

struct ListNode* mergeKLists(struct ListNode** lists,
                             int listsSize) {

    if(listsSize == 0)
        return NULL;

    struct ListNode* result = NULL;

    for(int i = 0; i < listsSize; i++)
        result = mergeTwo(result, lists[i]);

    return result;
}