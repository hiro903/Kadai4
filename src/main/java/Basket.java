import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {
    public static void main(String[] args) {
        // 文字列のリストを作成
        List<String> fruits = Arrays.asList("りんご", "バナナ", "オレンジ", "いちご", "ぶどう");

        // リスト内の要素をフィルタリングし、新しいリストを作成
        List<String> filteredFruits = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.startsWith("い")) {
                filteredFruits.add(fruit);
            }
        }

        // フィルタリングされた結果を表示
        System.out.println("フィルタリングされた果物: " + filteredFruits);
    }
}
