package ex;
public class Main {
    public static void main(final String[] args) {
        int a = 5;
        int b = 3;
        // *** �ϥΰΦW�������O�Ы� ��{ Comparator �����O �����
        Comparator comparator = new Comparator() {// �Ыث᪺��ҧڭ̨ϥ�Comparator���ܼƦs��
            @Override
            public int compareTo(int a, int b) {
                return a - b;
            }
        };
        System.out.println(comparator.compareTo(a, b));// �q�L�ܼƽեθӹ�Ҥ���compareTo��k
        
        // �]�i�H�ЫإX�Ӫ����I�s��k�å��(�S���ݭn���ƧQ�Ϊ����p)
        System.out.println(new Comparator() {
                    @Override
                    public int compareTo(int a, int b) {
                        return b-a;
                    }
                }.compareTo(a, b)
        );
    }
}
