package com.ustglobal.collection.sorting;
import java.util.Stack;
public class StackC {
public static void main(String[] args) {
Stack<Integer> s = new Stack();
s.add(23);
s.add(33);
s.add(34);
System.out.println("Using get()-----------");
for(int i=0;i<s.size();i++) {
	System.out.println(s.get(i));
}
int j = s.size();//use it otherwise size is decrease and calculation is not proper
System.out.println("Using pop()-----------");
for(int i=0;i<j;i++) {
	System.out.println(s.pop());
}
}
}
