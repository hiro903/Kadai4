import java.util.Arrays;
import java.util.List;

public class Ri {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("りんご", "バナナ", "いちご", "オレンジ", "パイナップル");

        List<String> filteredAndMappedFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("い"))  // 中間操作: "い" で始まる要素をフィルタリング
                .map(fruit -> fruit.toUpperCase())         // 中間操作: 要素を大文字に変換
                .toList();                                 // 終端操作: 結果をリストに収集

        System.out.println("処理結果: " + filteredAndMappedFruits);
    }
}
