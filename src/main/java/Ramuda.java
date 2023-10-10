import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ramuda {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "strawberry", "orange", "pineapple");

        List<String> filteredAndMappedFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("b"))  // 中間操作: "b" で始まる要素をフィルタリング
                .map(fruit -> fruit.toUpperCase())         // 中間操作: 要素を大文字に変換
                .collect(Collectors.toList());             // 終端操作: 結果をリストに収集

        System.out.println("処理結果: " + filteredAndMappedFruits);
    }
}
