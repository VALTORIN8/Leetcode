// --- Helper 1: Find the middle node (slow/fast pointer) ---
struct ListNode* findMiddle(struct ListNode* head) {
    struct ListNode* slow = head;
    struct ListNode* fast = head->next; // offset by 1 so left half is smaller

    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }
    return slow; // slow is at the END of left half
}

// --- Helper 2: Merge two sorted lists ---
struct ListNode* merge(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode dummy;   // temp node to avoid null checks
    struct ListNode* tail = &dummy;
    dummy.next = NULL;

    while (l1 != NULL && l2 != NULL) {
        if (l1->val <= l2->val) {
            tail->next = l1;
            l1 = l1->next;
        } else {
            tail->next = l2;
            l2 = l2->next;
        }
        tail = tail->next;
    }

    // attach remaining nodes
    tail->next = (l1 != NULL) ? l1 : l2;

    return dummy.next;
}

// --- Main: Merge Sort ---
struct ListNode* sortList(struct ListNode* head) {
    // Base case: 0 or 1 node → already sorted
    if (head == NULL || head->next == NULL)
        return head;

    // Step 1: Find middle
    struct ListNode* mid = findMiddle(head);

    // Step 2: Split — cut the list into two halves
    struct ListNode* rightHalf = mid->next;
    mid->next = NULL; // ✂️ cut here

    // Step 3: Recurse + Merge
    struct ListNode* left  = sortList(head);
    struct ListNode* right = sortList(rightHalf);

    return merge(left, right);
}
