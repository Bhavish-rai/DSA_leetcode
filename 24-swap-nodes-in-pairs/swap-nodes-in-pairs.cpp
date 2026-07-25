/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        ListNode* sec;
        ListNode* temp = head;
        if(head==NULL || head->next==NULL)
            {
                return head;
            }
        sec=head->next;
        
        while(head->next!=NULL && head!=NULL)
        {   int t=0;
            t=head->val;
            head->val=sec->val;
            sec->val=t;
            head=head->next;
            head=head->next;
            if(head==NULL)
            {
                break;
            }
            sec=head->next;

        }
        return temp;
    }
};