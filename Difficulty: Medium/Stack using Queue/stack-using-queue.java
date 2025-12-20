class myStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int x) {
        // Inserts an element x at the top of the stack
        if(!q1.isEmpty()) q1.add(x);
        else q2.add(x);
    }

    int pop() {
        // Removes an element from the top of the stack
        if(q1.isEmpty()&& q2.isEmpty()){
            return -1;
        }
        int t = -1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                t =q1.remove();
                if(q1.isEmpty()) break;
                q2.add(t);
            }
        }else{
            while(!q2.isEmpty()){
                t =q2.remove();
                if(q2.isEmpty()) break;
                q1.add(t);
            }
        }
        return t;
    }

    int top() {
        // Returns the top element of the stack
        // If stack is empty, return -1
        if(q1.isEmpty()&& q2.isEmpty()){
            return -1;
        }
        int t = -1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                t =q1.remove();
                q2.add(t);
            }
        }else{
            while(!q2.isEmpty()){
                t =q2.remove();
                q1.add(t);
            }
        }
        return t;
    }

    int size() {
        // Returns the current size of the stack
        if(q1.isEmpty()){
            return q2.size();
        }
        return q1.size();
    }
}
