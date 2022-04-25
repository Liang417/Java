package temp;

public class Rectangle {
    public static void main(String[] args) {
        Rect rect = new Rect(5, 10, Color.RED);// 傳入Color中的GREEN元素
        System.out.println(rect.color);
       
    }

    public enum Color {
        GREEN("#00FF00"),
        BLUE("#0000FF"),
        RED("#FF0000");

        private final String code;

        private Color(String code) {
            this.code = code;
        }

        // 一般方法
        public String getCode() {
            return this.code;
        }

        // 為了示範而示範的靜態方法
        public static String getCode(Color color){
            return color.code;
        }
    }

    public static class Rect {

        private final int width;
        private final int height;
        private final Color color;// 定義Color類別的變數

        public Rect(int width, int height, Color color) {
            this.width = width;
            this.height = height;
            this.color = color;
        }
    }
}
