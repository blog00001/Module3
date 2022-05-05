class stackapp{
static int stack[] = new int[10];
static int top1=-1;
static int top2=stack.length;

public static boolean isEmpty1()
{
	if(top1<0)
	{
		return true;
	}
	return false;	
}

public static boolean isEmpty2()
{
	if(top2>(stack.length-1))
	{
		return true;
	}
	return false;
}

public static boolean push1(int data)
{
	top1++;
	stack[top1]=data;
	return true;
}

public static boolean push2(int data)
{
	top2--;
	stack[top2]=data;
	return true;
}

public static int pop1()
{
	int temp1 =stack[top1--];
	System.out.println("Popped elemwnt from stack is "+temp1);
	return temp1;
}

public static int pop2()
{
	int temp2 =stack[top2++];
	System.out.println("Popped elemwnt from stack is "+temp2);
	return temp2;
}
public static void main(String[] args)
{
	push1(5);
	push2(10);
	push2(15);
	push1(11);
	push2(7);
	push2(40);
	pop1();
	pop2();
	
}
}