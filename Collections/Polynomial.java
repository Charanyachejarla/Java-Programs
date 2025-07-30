
class ListNode{
    int coef;
    int exp;
    ListNode next;
    ListNode(int coef,int exp){
        this.coef=coef;
        this.exp=exp;
        this.next=null;
    }
}
class list{

    
    void display(ListNode head){
        if(head==null){
            System.out.println("0");
            return;
        }
        ListNode temp=head;;
        while(temp!=null){
            if(temp.coef!=0){
                if(temp.coef>0 && temp!=head){
                    System.out.print("+");
                }
                System.out.print(temp.coef+"x^"+temp.exp);
            }
            temp=temp.next;
        }
        
    }
    ListNode insert(int coef,int exp, ListNode head){
        ListNode newnode=new ListNode(coef,exp);
        if(head==null || head.exp<exp){
            newnode.next=head;
            head=newnode;
            return head;
        }
        ListNode temp=head;
        while(temp.next!=null && temp.next.exp>=exp){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
     ListNode add(ListNode p1,ListNode p2, ListNode res )
     {
        int sum_coeff=0;
        while(p1!=null && p2!=null)
        {
            if(p1.exp==p2.exp)
            {
                sum_coeff=p1.coef+p2.coef;
                if(sum_coeff!=0)
                {
                    res=insert(sum_coeff,p1.exp,res);
                }
                p1=p1.next;
                p2=p2.next;
            }
            else if(p1.exp>p2.exp)
            {
                res=insert(p1.coef,p1.exp,res);
                p2=p2.next;
            }
            
            else{
                res=insert(p2.coef,p2.exp,res); p2=p2.next;
            }
           
        }
        while(p1!=null)
        {
            res=insert(p1.coef,p1.exp,res);
            p1=p1.next;
        }
        while(p2!=null)
        {
            res=insert(p2.coef,p2.exp,res);
            p2=p2.next;
        }
        return res;
     }
      ListNode sub(ListNode p1,ListNode p2, ListNode res )
     {
        int sum_coeff=0;
        while(p1!=null && p2!=null)
        {
            if(p1.exp==p2.exp)
            {
                sum_coeff=p1.coef-p2.coef;
                if(sum_coeff!=0)
                {
                    res=insert(sum_coeff,p1.exp,res);
                }
                p1=p1.next;
                p2=p2.next;
            }
            else if(p1.exp>p2.exp)
            {
                res=insert(p1.coef,p1.exp,res);
                p2=p2.next;
            }
            
            else{
                res=insert(p2.coef,p2.exp,res); p2=p2.next;
            }
           
        }
        while(p1!=null)
        {
            res=insert(p1.coef,p1.exp,res);
            p1=p1.next;
        }
        while(p2!=null)
        {
            res=insert(p2.coef,p2.exp,res);
            p2=p2.next;
        }
        return res;
     }
}
class Polynomial {
    public static void main(String[] args){
        list ob=new list();
       
        ListNode head1=null;
        ListNode head2=null;
        head1=ob.insert(3,2,head1);
        head1=ob.insert(4,1,head1);
       head1= ob.insert(1,0,head1);
      
         head2=  ob.insert(3,2,head2);
       head2= ob.insert(4,1,head2);
        head2=ob.insert(1,0,head2);
     
        ob.display(head1);
        System.out.println();
        ob.display(head2);
        ListNode res=null;
        res=ob.add(head1,head2,res);
        System.out.println();
        ob.display(res);
          ListNode res1=null;
        res1=ob.sub(head1,head2,res1);
        System.out.println();
        ob.display(res1);
    }
}