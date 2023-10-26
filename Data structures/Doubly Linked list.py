class Node:
    def __init__(self,data):
        self.pref=None
        self.nref=None
        self.data = data

class Doubly_linked_list:
    def __init__(self):
        self.head=None

    def print_LL(self):
        if self.head is None:
            print("List is empty")

        else:
            n=self.head
            while n is not None:
                print(n.data,"-->",end="")
                n=n.nref

    def print_LL_rev(self):
        if self.head is None:
            print("this is an EMmpty list")

        else:
            n=self.head
            while n.nref is not None:
                n=n.nref
            while n is not None:
                print(n.data,"<--",end="")
                n=n.pref
                
    def insert_empty(self,data):
        if self.head is None:
            new_node = Node(data)
            self.head = new_node
        else:
            print("This list is not empty to insert")

    def add_begin(self, data):
        new_node=Node(data)
        if self.head is not None:
            new_node.nref=self.head
            self.head.pref=new_node
            self.head=new_node
        else:
            self.head=new_node

    def add_end(self,data):
        new_node = Node(data)
        if self.head is not None:
            n=self.head
            while n.nref is not None:
                n=n.nref
            n.nref=new_node
            new_node.pref=n
        else:
            self.head=new_node

    def add_after(self,data,x):
        if self.head is not None:
            new_node=Node(data)
            n=self.head
            while n is not None:
                if x==n.data:
                    break
                n=n.nref
            if n is not None:
                if n.nref is not None:    
                    n.nref.pref=new_node
                    new_node.nref=n.nref
                n.nref=new_node
                new_node.pref=n
            else:print("node is not in list")
        else:print("the list is empty")

    def add_before(self,data,x):
        if self.head is not None:
            n=self.head
            while n is not None:
                if x==n.data:
                    break
                n=n.nref
            if n is not None:
                new_node=Node(data)
                if n.pref is not None:
                    n.pref.nref=new_node
                    new_node.pref=n.pref
                else:self.head=new_node
                new_node.nref=n
                n.pref=new_node
            else:print("element is not in list")
        else:print("list is empty")

    def del_begin(self):
        if self.head is None:
            print("List is empty")
        else:
            self.head=self.head.nref
            self.head.pref=None

    def del_end(self):
        if self.head is None:
            print("list is empty")
        elif self.head.nref is None:
            self.head=None
            print("There was only head present")
        else:
            n=self.head
            while n.nref.nref is not None:
                n=n.nref
            n.nref=None

    def del_val(self,x):
        if self.head is None:
            print("This is empty list")

        else:
            n=self.head
            if n.data==x and n.nref is None:
                self.head=None
                print("there was only one node")
                return
            if n.data==x:
                n.nref.pref=None
                self.head=n.nref
                return
            while n is not None:
                if n.data==x and n.nref is not None:
                    n.pref.nref, n.nref.pref=n.nref,n.pref
                    return
                elif n.data==x:
                    n.pref.nref=None
                    return
                n=n.nref
            print("Elemenat is not in list")
                    



DLL=Doubly_linked_list()

DLL.insert_empty(1)
DLL.add_begin(0)
DLL.add_end(3)
DLL.add_after(2,1)
DLL.add_before(-1,0)
#DLL.del_begin()
#DLL.del_end()
DLL.del_val(1)
print("__><__")
DLL.print_LL()
print()
DLL.print_LL_rev()
