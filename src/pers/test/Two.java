package testdemo.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ����һ�����������飬�������и���Ԫ����ϳ�һ�����������Ͻ�������Ǹ�����
 * @author Noedge
 *
 */
public class Two {
	public static void main(String[] args) {
		int [] arr = {9,3,32,33,303,34}; 	//93433332303
		System.out.println(getItem(arr));
	}
	public static String getItem(int [] arr){//����arr��ȡ��������
		String [] strArr = new String[arr.length];
		Map<String,String> map = new HashMap<String,String>();
		int maxLen = 0;
		for(int i = 0 ; i < strArr.length ; i++){
			strArr[i] = String.valueOf(arr[i]);
			if(strArr[i].length() > maxLen){
				maxLen = strArr[i].length();
			}
		}
		String[] strArrb = new String[arr.length];
		for(int i = 0 ;i < strArrb.length ; i++){
			strArrb[i] = strArr[i];
			int strLen = strArr[i].length();
			String s = strArr[i].substring(strLen-1,strLen);
			for(int j = 0 ; j < maxLen - strLen ; j++){
				strArrb[i] += s ;
			}
			if(map.containsKey(strArrb[i])){
				strArrb[i] +="_" + i ;
			}
			map.put(strArrb[i], strArr[i]);				
		}
		Arrays.sort(strArrb);
		String res = "";
		for(int i = strArrb.length-1 ; i >= 0 ; i--){
			res += map.get(strArrb[i]);
		}
		return res;
	}
}
