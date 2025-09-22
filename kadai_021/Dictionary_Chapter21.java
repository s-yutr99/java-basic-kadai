package kadai_021;

import java.util.HashMap;


public class Dictionary_Chapter21 {
	
	private HashMap<String,String> fruitMap;
		// TODO 自動生成されたメソッド・スタブ
	
	public Dictionary_Chapter21() {
		fruitMap = new HashMap<String,String>();
		fruitMap.put("apple","りんご");
	    fruitMap.put("peach","桃");
	    fruitMap.put("banana","バナナ");
	    fruitMap.put("lemon","レモン");
	    fruitMap.put("pear","梨");
	    fruitMap.put("kiwi","キウィ");
	    fruitMap.put("strawberry","いちご");
	    fruitMap.put("grape","ぶどう");
	    fruitMap.put("muscat","マスカット");
	    fruitMap.put("cherry","さくらんぼ");
	    
	}
	
	public String search(String word) {
		if (fruitMap.containsKey(word)) {
			return word + "の意味は" + fruitMap.get(word);
		} else {
			return word + "辞書には存在しません";
		}
	}
	
}


