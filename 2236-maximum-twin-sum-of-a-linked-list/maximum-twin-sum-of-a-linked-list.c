/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int pairSum(struct ListNode* head) {
    int count=0;
    struct ListNode* p=head;
    while(p!=NULL){
        count++;
        p=p->next;
    }
    int arr[count];
    p=head;
    for(int i=0;i<count;i++){
        arr[i]=p->val;
        p=p->next;
    }
    int maxSum = 0;  
    for(int i = 0; i < count/2; i++) {  
        int currentSum = arr[i] + arr[count-1-i];
        if(currentSum > maxSum) {
            maxSum = currentSum;
        }
    }
    return maxSum;
}