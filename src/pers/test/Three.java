package pers.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int num = 0 ;
		System.out.print("������һ���ж�����:");
		num = scanner.nextInt();
		scanner.close();
		for(int i = 1 ; i <= num; i++){
			list.add(i);
		}
		getItem(list,1);
	}
	
	public static void getItem(List<Integer> list,int index){
		List<Integer> tempList = new ArrayList<Integer>();
		if(list.size()==1){
			System.out.println("ʣ���һ������ԭ���ĵ�" + list.get(0) + "λ");
			return ;
		}
		for(int i = 0 ; i < list.size() ; i++){
			if((index++) % 3!=0){
				tempList.add(list.get(i));
			}
		}
		getItem(tempList,index%3);
	}

}
