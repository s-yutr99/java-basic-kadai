package kadai_028;

import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    // 自分のじゃんけんの手を入力する（小文字化・余白除去・バリデーション）
    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String myChoice = scanner.next();               // next() を使う
        if (myChoice == null) myChoice = "";
        myChoice = myChoice.trim().toLowerCase();      // 空白除去 + 小文字化

        // r, s, p 以外が来たら再入力を促す（安全策）
        while (!myChoice.equals("r") && !myChoice.equals("s") && !myChoice.equals("p")) {
            System.out.println("入力が不正です。r, s, p のいずれかを入力して Enter を押してください:");
            myChoice = scanner.next();
            if (myChoice == null) myChoice = "";
            myChoice = myChoice.trim().toLowerCase();
        }
        return myChoice;
    }

    // 対戦相手の手を乱数で選ぶ
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int index = random.nextInt(hands.length);
        return hands[index];
    }

    // じゃんけんを行う
    public void playGame() {
        String myChoice = getMyChoice();
        String enemyChoice = getRandom();

        String myHand = convertHand(myChoice);
        String enemyHand = convertHand(enemyChoice);

        // 出力（ユーザがコンソールへ入力した行（例: p）は Eclipse がそのまま表示します）
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

    // r,s,p を日本語に変換
    private String convertHand(String hand) {
        switch (hand) {
            case "r": return "グー";
            case "s": return "チョキ";
            case "p": return "パー";
            default:  return "不明";
        }
    }
}
