class Sorting{
	static void sort(int arr[])
	{
		int low=0;
		int high=arr.length-1;
		int temp = arr[high];
		for(int i =arr.length-2;i>=low;i--)
		{
			if(temp<arr[i])
			{
				int j =i;
				j++;
				arr[j]=arr[i];	
				display(arr);
			}
			else{
				if(arr[i]<temp)
				{
					arr[++i]=temp;
				}
				display(arr);
				break;
			}
			
		}	
	}
	static void display(int arr[]){
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
public static void main(String[] args)
{
	int arr[]= {2,4,6,8,3};
	sort(arr);
}}