import java.io.*;
public class main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[8001]; // 범위 -4000 ~ 4000
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			int num = Integer.parseInt(br.readLine());
			sum += num;
			arr[num + 4000]++;
		}
		int mid = 0;
		int mode = 0;
		int freq = 0;
		int maxfreq = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		boolean swp = false;
		boolean midd = false;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != 0)
			{
				if(freq < n/2 + 1)
				{
					freq += arr[i];
					if(freq >= n/2 + 1)//중간값
					{
						if(!midd)
						{
							mid = i - 4000;
							midd = true;
						}
					}
				}
				if(arr[i] > maxfreq)
				{
					mode = i - 4000;
					maxfreq = arr[i];
					swp = false;
				}
				else if(arr[i] == maxfreq)
				{
					if(mode < i - 4000 && swp == false)
					{
						swp = true;
						mode = i - 4000;
					}
				}
				if(i > max)
				{
					max = i;
				}
				if(i < min)
				{
					min = i;
				}
			}
		}
		float avg = (float)sum / n;
		System.out.println(Math.round(avg));
		System.out.println(mid);
		System.out.println(mode);
		System.out.println(max - min);
	}

}
