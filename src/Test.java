import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("装备一", 1);
        map.put("装备二", 2);
        map.put("装备三", 3);

        // 模拟抽奖 600 次
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < 600; i++) {
            String tmp = luckyDraw(map);
            if (tmp.equals("装备一")) count1++;
            else if (tmp.equals("装备二")) count2++;
            else if (tmp.equals("装备三")) count3++;
        }
        System.out.println("抽到装备一: " + count1);
        System.out.println("抽到装备二: " + count2);
        System.out.println("抽到装备三: " + count3);
    }

    /**
     * 进行一次抽奖活动
     *
     * @param map 奖池
     * @return 具体抽到的装备
     */
    public static String luckyDraw(HashMap<String, Integer> map) {

        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }

        int random = getRandom(sum);
        sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
            if (sum >= random) return key;
        }
        return null;
    }

    /**
     * 生成 1-max 之间的一个随机数
     *
     * @param max 最大的数值
     * @return 生成的随机数
     */
    public static int getRandom(int max) {
        return 1 + (int) (Math.random() * max);
    }


}
