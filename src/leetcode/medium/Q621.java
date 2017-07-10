package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q621 {
	public static int taskScheduler2(char[] tasks,int n){
		int count=0;
		int[][] record =new int[26][2];
		for(int i=0;i<26;i++){
			record[i][0]=0;
			record[i][1]=0;
		}
		for(char ch:tasks){
			record[ch-'A'][0]++;
		}
		List<Integer> scheduler =new ArrayList<Integer>();
		int done=0;
		while(done==0){
			done=1;
			for(int i=0;i<26;i++){
				if(record[i][0]>0){
					done=0;
					int p=0;
					int cool=0;
					for(int j=0;j<26;j++){
						if(record[j][0]>0&&record[j][1]==0){
							p=j;
							cool=1;
							for(int k=p;k<26;k++){
								if(record[k][0]>record[p][0]&&record[k][1]==0){
									p=k;
								}
							}
							break;
						}							
					}
					if(cool==1){
						scheduler.add(p);
						record[p][0]--;
						for(int j=0;j<26;j++){
							if(record[j][1]>0)
								record[j][1]--;
						}
						record[p][1]=n;
						count++;
					}
					else{
						scheduler.add(-1);
						count++;
						for(int j=0;j<26;j++){
							if(record[j][1]>0)
								record[j][1]--;
						}
					}					
				}				
			}
		}
		for(int s:scheduler){
			if(s==-1)
				System.out.print('_');
			else
				System.out.print((char)(s+'A'));
		}
		return count;
	}
	
	public static int taskScheduler(char[] tasks,int cool){
		int count=0;
		int[][] record =new int[26][2];
		for(int i=0;i<26;i++){
			record[i][0]=0;
			record[i][1]=0;
		}
		for(char ch:tasks){
			record[ch-'A'][0]++;
		}
		List<Integer> scheduler =new ArrayList<Integer>();
		
		int done=0;
		while(done==0){
			done=1;	
			for(int i=0;i<26;i++){
				
				if(record[i][0]>0){
					int p=i;
					for(int j=p;j<26;j++){
						if(record[j][0]>record[p][0])
							p=j;
					}
					int flag=0;
					while(flag==0){
						if(record[p][1]==0){
							scheduler.add(p);
							record[p][0]--;
							for(int[] r:record){
								if(r[1]>0)
									r[1]--;
							}
							record[p][1]=cool;
							count++;
							flag=1;
						}
						else{
							for(int j=0;j<26;j++){
								if(record[j][1]==0 && record[j][0]>0){
									int p2=j;
									for(int k=p2;k<26;k++){
										if(record[k][0]>record[p2][0]&&record[k][1]==0)
											p2=k;
									}
									scheduler.add(p2);
									record[p2][0]--;
									for(int[] r:record){
										if(r[1]>0)
											r[1]--;
									}
									record[p2][1]=cool;
									count++;
									flag=1;
									break;
								}
							}
							if(flag==0){
								scheduler.add(-1);
								for(int[] r:record){
									if(r[1]>0)
										r[1]--;
								}
								count++;
							}
						}
//						System.out.println(flag);
					}
					done=0;
					i=-1;
				}
			}
//			System.out.println(done);
		}
		for(int s:scheduler){
			if(s==-1)
				System.out.print('_');
			else
				System.out.print((char)(s+'A'));
		}

		return count;
	}

}
