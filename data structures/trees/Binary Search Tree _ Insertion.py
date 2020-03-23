class Node:
    def __init__(self, info):
        self.info = info  
        self.left = None  
        self.right = None 
        self.level = None 

    def __str__(self):
        return str(self.info) 

def preOrder(root):
    if root == None:
        return
    print (root.info, end=" ")
    preOrder(root.left)
    preOrder(root.right)
    
class BinarySearchTree:
    def __init__(self): 
        self.root = None

#Node is defined as
#self.left (the left child of the node)
#self.right (the right child of the node)
#self.info (the value of the node)

    def insert(self, val):
        #Enter you code here.

        node = self.root
        if not node:
            newNode = Node(val)
            self.root = newNode
        while node:
            if val == node.info:
                break
            elif val > node.info:
                if node.right:
                    node = node.right
                else:
                    newNode = Node(val)
                    node.right = newNode
                    break
            else:
                if node.left:
                    node = node.left
                else:
                    newNode = Node(val)
                    node.left = newNode
                    break
    

tree = BinarySearchTree()
t = int(input())

arr = list(map(int, input().split()))

for i in range(t):
    tree.insert(arr[i])

preOrder(tree.root)
