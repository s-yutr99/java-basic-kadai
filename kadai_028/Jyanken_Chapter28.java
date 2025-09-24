package kadai_028;

import java.util.Scanner;

public class Jyanken_Chapter28 {
    private Scanner scanner = new Scanner(System.in);
  

   
    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String myChoice = scanner.next();           
        if (myChoice == null) myChoice = "";
        myChoice = myChoice.trim().toLowerCase();     
       
        
        while (!myChoice.equals("r") && !myChoice.equals("s") && !myChoice.equals("p")) {
            System.out.println("入力が不正です。r, s, p のいずれかを入力して Enter を押してください:");
            myChoice = scanner.next();
            if (myChoice == null) myChoice = "";
            myChoice = myChoice.trim().toLowerCase();
        }
        return myChoice;
    }

    
    public String getRandom() {
        int index = (int)Math.floor(Math.random() * 3);
        String[] hands = {"r", "s", "p"};
        return hands[index];
    }

    public void playGame() {
        String myChoice = getMyChoice();
        String enemyChoice = getRandom();

        String myHand = convertHand(myChoice);
        String enemyHand = convertHand(enemyChoice);

        System.out.println("自分の手は" + myHand + ", 対戦相手の手は" + enemyHand);

        if (myChoice.equals(enemyChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && enemyChoice.equals("s")) ||
                   (myChoice.equals("s") && enemyChoice.equals("p")) ||
                   (myChoice.equals("p") && enemyChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }


    private String convertHand(String hand) {
        switch (hand) {
            case "r": return "グー";
            case "s": return "チョキ";
            case "p": return "パー";
            default:  return "不明";
        }
    }
}
