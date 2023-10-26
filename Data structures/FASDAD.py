class Node:
    def __init__(self,data):
        self.data = data
        self.ref = None

class linkedList:
    def __init__(self):
        self.head = None

    def print_LL(self):
        if self.head is None:
            print("linked list is empty")
        else:
            n=self.head
            while n is not None:
                print(n.data,"-->",end="")
                n=n.ref
                
    def add_begin(self,data):
        new_node = Node(data)
        new_node.ref = self.head
        self.head = new_node

    def add_end(self,data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
        else:
            n = self.head
            while n.ref is not None:
                n = n.ref
            n.ref = new_node

    def add_after(self,data,x):
        new_node = Node(data)
        n=self.head
        while n is not None:
            if x==n.data:
                new_node.ref=n.ref
                n.ref = new_node
                break
            n = n.ref
        if n is None:
            print("element not present in list")
        else:pass

    def add_before(self,data,x):
        new_node = Node(data)

        n=self.head
        if self.head.data==x:
            new_node.ref=self.head
            self.head=new_node
            return
        while n is not None:
            if n.data==x:
                q.ref=new_node
                new_node.ref=n
                break 
            else:
                q=n
                n=n.ref

    def LL_empty(self,data):
        new_node=Node(data)
        if self.head is None:
            self.head=new_node
        else:print("List is not empty")

    def del_begin(self):
        if self.head is not None:
            self.head=self.head.ref
        else:print("This is not the head of the ll")

    def del_end(self):
        n=self.head
        if n is not None:
            while n.ref.ref is not None:
                n=n.ref
            n.ref=None
        else:print("Linkedd list is empty")

    def del_value(self,x):
        n=self.head
        if n is not None and n.data!=x:
            while n.ref.data != x:
                n=n.ref
            n.ref=n.ref.ref
        elif n.data==x:
            self.head=self.head.ref
        else:print("Elemeant not in list")
    
LL1 = linkedList()
LL1.add_begin(10)
LL1.add_begin(5)
LL1.add_end(500)
LL1.add_end(789)
LL1.print_LL()
print()
#LL1.add_before(400,789)
#LL1.add_after(6,5)
#LL1.LL_empty(45)
#LL1.add_after(123,789)
#LL1.add_before(1,5)
LL1.del_value(99)


LL1.print_LL()
