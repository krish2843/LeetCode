struct ListNode* reverseKGroup(struct ListNode* head, int k) {

    struct ListNode dummy;
    dummy.next = head;

    struct ListNode* groupPrev = &dummy;

    while (1) {

        struct ListNode* kth = groupPrev;

        for (int i = 0; i < k && kth != NULL; i++)
            kth = kth->next;

        if (kth == NULL)
            break;

        struct ListNode* groupNext = kth->next;

        struct ListNode* prev = groupNext;
        struct ListNode* curr = groupPrev->next;

        while (curr != groupNext) {

            struct ListNode* next = curr->next;

            curr->next = prev;
            prev = curr;
            curr = next;
        }

        struct ListNode* temp = groupPrev->next;

        groupPrev->next = kth;
        groupPrev = temp;
    }

    return dummy.next;
}