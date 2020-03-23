""" Node is defined as
class node:
  def __init__(self, data):
      self.data = data
      self.left = None
      self.right = None
"""
def inorder_traverse(root):
    if not root:
        return []
    stack = []
    stack.append(root)
    result = []
    node = root
    while stack:
        if node:
            stack.append(node)
            node = node.left
        else:
            node = stack.pop(len(stack)-1)
            result.append(node.data)
            node = node.right
    return result
            
            
def check_binary_search_tree_(root):
    leftSubTree = inorder_traverse(root.left)
    rightSubTree = inorder_traverse(root.right)
    check = True
    for i in leftSubTree:
        if i >= root.data:
            check = False
            break
    if not check:
        return check
    else:
        for i in rightSubTree:
            if i <= root.data:
                check = False
                break
        if not check:
            return check
        else:
            if root.left:
                check = check_binary_search_tree_(root.left)
            if not check:
                return check
            else:
                if root.right:
                    check = check_binary_search_tree_(root.right)
                return check
