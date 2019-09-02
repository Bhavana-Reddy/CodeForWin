

public class ModifyString {
	public static void main(String[] args) {
		String str = "aaabbaaccd";
		char[] arr = str.toCharArray();
		
		for(int i =0 ; i < str.length();i++) {
			int j = i+1;
			if(j == str.length()) {
				break;
			}
			if(arr[i] == arr[j]) {
				arr[i] = ' ';
				arr[j] = ' ';
			}
		}
		
		String newStr = String.valueOf(arr);
		System.out.println(newStr.replaceAll(" ", ""));
//		Map<Character,Integer> oMap = new HashMap<Character, Integer>();
		
//		for(int i=0;i<str.length();i++) {
//			if(oMap.containsKey(arr[i])) {
//				int cnt = oMap.get(arr[i]);
//				oMap.put(arr[i], ++cnt);
//			}else {
//				oMap.put(arr[i], 1);
//			}
//		}
//		System.out.println(oMap);
//		for(Character i : oMap.keySet()) {
//			int val = oMap.get(i);
//			if(val%2!=0) {
//				System.out.print(i);
//			}
//		}
//	}
}
}
