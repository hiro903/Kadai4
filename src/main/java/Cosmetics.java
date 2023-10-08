import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cosmetics {
    public static void main(String[] args) {
        // BasicCosmeticsオブジェクトのリストを作成
        List<BasicCosmetics> cosmeticsList = new ArrayList<>();
        cosmeticsList.add(new BasicCosmetics("ファンデーション", 5000, "素肌を美しく見せる"));
        cosmeticsList.add(new BasicCosmetics("グロス", 1000, "唇を彩る"));
        cosmeticsList.add(new BasicCosmetics("アイシャドウ", 3500, "目元に立体感を出す"));
        cosmeticsList.add(new BasicCosmetics("マスカラ", 1500, "まつげを長くする"));
        //cosmeticsList.add(new BasicCosmetics("ブラシ", 500, "メイクを均一に塗る"));

        // 価格が2000円未満のコスメティックをフィルタリング
        List<BasicCosmetics> affordableCosmetics = cosmeticsList.stream()
                .filter(cosmetic -> cosmetic.getPrice() < 2000)
                .collect(Collectors.toList());

        // フィルタリングされたコスメティックを表示
        System.out.println("2000円未満のコスメティック:");
        affordableCosmetics.forEach(cosmetic -> {
            System.out.println("商品名: " + cosmetic.getName());
            System.out.println("価格: " + cosmetic.getPrice() + "円");
            System.out.println("効果: " + cosmetic.getEffect());
            System.out.println();
        });
    }
}
