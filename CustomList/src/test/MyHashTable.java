package test;

import java.util.ArrayList;




	public class MyHashTable extends CustomList{
		//лист дэхь элементүүдийн нийлбэрийг олох
		public int sum(CustomList<Integer> sa)
		{
			int sum = 0;
			for(int i = 0 ; i<sa.size();i++)
			{
				sum = sum+(int)sa.get(i);
			}
			return sum;
		}
		//лист дэх элементүүдийн дундажийг олох
		public double average(CustomList<Integer> sa)
		{
			return 1.0*sum(sa)/sa.size();
		}
		//листээс хамгийн их элементийг олох
		public int max(CustomList<Integer> sa)
		{
			int max = (int)sa.get(0);
			for (int i =0; i<sa.size();i++)
			{
				if(max<(int)sa.get(i))
				{
					max = (int)sa.get(i);
				}
			}
			return max;
		}
		//листээс хамгийн бага элементийг олох
		public int min(CustomList<Integer> sa)
		{
			int min = (int)sa.get(0);
			for (int i =0; i<sa.size();i++)
			{
				if(min>(int)sa.get(i))
				{
					min = (int)sa.get(i);
				}
			}
			return min;
		}
		//лист дэх тэгш тоонуудыг олох 
		public void even(CustomList<Integer> sa)
		{
			System.out.println(" ");
			for (int i = 0;i<sa.size();i++)
			{
				if ((int)sa.get(i)%2 ==0)
				{
					System.out.print((int)sa.get(i)+" ");
				}
				

		

			}
			
		}
		//лист дэх сондгой элементүүдийг олох q52
		public void odd(CustomList<Integer> sa)
		{
			System.out.println(" ");
			for (int i = 0;i<sa.size();i++)
			{
				if ((int)sa.get(i)%2 !=0)
				{
					System.out.print((int)sa.get(i)+" ");
				}
				

		

			}
			
		}
		public static void main(String [] args)
		{
			MyHashTable mb = new MyHashTable();
		
			CustomList<Integer> numbers = new CustomList<Integer>();
			numbers.add(3);
			numbers.add(43);
			numbers.add(56);
			numbers.add(5);
			numbers.add(8);


			numbers.print();
			System.out.println(	mb.min(numbers));
			System.out.println(	mb.max(numbers));
			System.out.println(mb.average(numbers));
			System.out.println(	mb.sum(numbers));
			
		mb.even(numbers);
		mb.odd(numbers);

			
			
		}

	}
