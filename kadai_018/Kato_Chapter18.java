package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyname = "加藤";
	public String givenName = "";
	public String address = "東京都中野区⚪×";
	
	public void commonlntroduce() {
		System.out.println("住所は" + address + "です");
	}
	
	abstract  void eachIntroduce();
	
	public void execIntroduce() {
		System.out.println("名前は" + familyname + givenName + "です");
		commonlntroduce();
		eachIntroduce();
	}
}