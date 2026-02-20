/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    // Base case: if the list is empty, return NULL
    if (!head) return NULL;
    
    // Create a dummy node that points to the head
    // Why? This handles the case where the head itself is a duplicate
    // Without it, we'd need special logic to handle removing the head
    struct ListNode dummy;
    dummy.next = head;
    
    // 'prev' points to the last node that we know is NOT a duplicate
    // It starts at dummy so we can modify the list from the beginning
    struct ListNode *prev = &dummy;
    
    // Traverse the list using 'head' as our current pointer
    while (head) {
        
        // Check if current node is the start of a duplicate sequence
        // We need both: head->next exists AND values are equal
        if (head->next && head->val == head->next->val) {
            
            // Store the duplicate value we need to skip
            int dup = head->val;
            
            // Skip ALL nodes with this duplicate value
            // This loop continues until we find a node with a different value
            // or reach the end of the list (head becomes NULL)
            while (head && head->val == dup) {
                head = head->next;
            }
            
            // Now 'head' points to the first node after all duplicates
            // Connect 'prev' directly to this node, effectively removing all duplicates
            // Note: 'prev' doesn't move - it stays at the last confirmed non-duplicate
            prev->next = head;
            
        } else {
            // Current node is NOT a duplicate (no next node or different value)
            // This node is safe to keep, so we move 'prev' forward
            prev = head;
            
            // Move to the next node to continue checking
            head = head->next;
        }
    }
    
    // Return dummy.next, which points to the new head of the modified list
    // (The original head might have been removed if it was a duplicate)
    return dummy.next;
}


/* Original: 1 → 2 → 2 → 3 → 4 → 4 → 5

Step-by-step:

Initial:
dummy → 1 → 2 → 2 → 3 → 4 → 4 → 5
prev=dummy, head=1

Step 1: head=1 (no duplicate)
dummy → 1 → 2 → 2 → 3 → 4 → 4 → 5
        prev  head

Step 2: head=2 (DUPLICATE found!)
- Store dup=2
- Skip all 2's: head moves to 3
- Connect prev(1) to head(3)
dummy → 1 ─────→ 3 → 4 → 4 → 5
        prev     head

Step 3: head=3 (no duplicate)
dummy → 1 → 3 → 4 → 4 → 5
            prev head

Step 4: head=4 (DUPLICATE found!)
- Store dup=4
- Skip all 4's: head moves to 5
- Connect prev(3) to head(5)
dummy → 1 → 3 ─────→ 5
            prev     head

Step 5: head=5 (no duplicate)
dummy → 1 → 3 → 5
                prev head

Step 6: head=NULL (end of list)

Final Result: 1 → 3 → 5 */