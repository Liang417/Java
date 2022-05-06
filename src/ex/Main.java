package ex;
public class Main {
    public static void main(final String[] args) {
        int a = 5;
        int b = 3;
        // *** 使用匿名內部類別創建 實現 Comparator 的類別 的實例
        Comparator comparator = new Comparator() {// 創建後的實例我們使用Comparator的變數存取
            @Override
            public int compareTo(int a, int b) {
                return a - b;
            }
        };
        System.out.println(comparator.compareTo(a, b));// 通過變數調用該實例中的compareTo方法
        
        // 也可以創建出來直接呼叫方法並丟棄(沒有需要重複利用的情況)
        System.out.println(new Comparator() {
                    @Override
                    public int compareTo(int a, int b) {
                        return b-a;
                    }
                }.compareTo(a, b)
        );
    }
}
