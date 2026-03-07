struct ListNode* partition(struct ListNode* head, int x) {
    // Two dummy nodes to start the two lists
    struct ListNode lessDummy, greaterDummy;
    lessDummy.next = NULL;
    greaterDummy.next = NULL;

    // Pointers to the current end of the two lists
    struct ListNode* less = &lessDummy;
    struct ListNode* greater = &greaterDummy;

    while (head != NULL) {
        if (head->val < x) {
            less->next = head;
            less = less->next;
        } else {
            greater->next = head;
            greater = greater->next;
        }
        head = head->next;
    }

    // Important: end the greater list to avoid cycles
    greater->next = NULL;

    // Connect the "less" list to the "greater" list
    less->next = greaterDummy.next;

    return lessDummy.next;
}