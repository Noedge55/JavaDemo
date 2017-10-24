package pers.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 有n个人(1到n号)围成一个圈，从第1号按顺序报数(1-3)，每报数为3的人从队伍去除，下个人继续从1开始报数，问最后剩下的那个人原来排在第几位
 * 博客地址：http://blog.csdn.net/noedge/article/details/78309987
 * @author Noedge
 * 
 */

public class Three {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int num = 0 ;
		System.out.print("请输入一共有多少人:");
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
			System.out.println("剩余的一个人是原来的第" + list.get(0) + "位");
			return ;
		}
		for(int i = 0 ; i < list.size() ; i++){
			if((index++) % 3!=0){
				tempList.add(list.get(i));
			}
		}
		getItem(tempList,index % 3);
	}

}
