package temp;

public class Rectangle {
    public static void main(String[] args) {
        Rect rect = new Rect(5, 10, Color.RED);// �ǤJColor����GREEN����
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

        // �@���k
        public String getCode() {
            return this.code;
        }

        // ���F�ܽd�ӥܽd���R�A��k
        public static String getCode(Color color){
            return color.code;
        }
    }

    public static class Rect {

        private final int width;
        private final int height;
        private final Color color;// �w�qColor���O���ܼ�

        public Rect(int width, int height, Color color) {
            this.width = width;
            this.height = height;
            this.color = color;
        }
    }
}
