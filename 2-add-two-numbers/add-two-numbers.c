#include <stdlib.h>

int getlastdigit(int n){
    return n % 10;
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    int c1 = 0, c2 = 0;
    struct ListNode* p = l1;
    struct ListNode* q = l2;

    while(p != NULL){ p = p->next; c1++; }
    while(q != NULL){ q = q->next; c2++; }

    int* arr1 = (int*)malloc(c1 * sizeof(int));
    int* arr2 = (int*)malloc(c2 * sizeof(int));

    p = l1; q = l2;
    for(int i = 0; i < c1; i++){ arr1[i] = p->val; p = p->next; }
    for(int i = 0; i < c2; i++){ arr2[i] = q->val; q = q->next; }

    int size = (c1 > c2) ? c1 : c2;
    int* result = (int*)malloc((size + 1) * sizeof(int));

    int carry = 0;
    for(int i = 0; i < size; i++){
        int a = (i < c1) ? arr1[i] : 0;
        int b = (i < c2) ? arr2[i] : 0;

        int sum = a + b + carry;
        carry = sum / 10;
        result[i] = getlastdigit(sum);
    }

    int finalSize = size;
    if(carry > 0){
        result[size] = carry;
        finalSize = size + 1;
    }

    struct ListNode* dummy = (struct ListNode*)malloc(sizeof(struct ListNode));
    dummy->next = NULL;
    struct ListNode* cur = dummy;

    for(int i = 0; i < finalSize; i++){
        struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
        newNode->val = result[i];
        newNode->next = NULL;
        cur->next = newNode;
        cur = cur->next;
    }

    free(arr1);
    free(arr2);
    free(result);

    return dummy->next;
}