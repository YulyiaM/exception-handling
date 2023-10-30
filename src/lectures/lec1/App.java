package lectures.lec1;

import java.io.File;

public class App {
    public static void main(String[] args) {
        //System.out.println(getFileSize(new File("/t")));
        //System.out.println(divide(10, 0));
        a();
    }

    public static void a(){ //в exception - stack-trace - источник ошибки всегда сверху списка ошибок (конечная точка)
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }
    public static int divide(int a1, int a2) {
//        if (a2 == 0) {
//            return -1;
//        }
        return a1 / a2;
    }

    public static long getFileSize(File file) { // функция статическая, чтобы не писать доп. класс для инициализации
        if (!file.exists()) {                    // размер файла всегда в long во встроенных библиотеках
            return -1L;
        }
        return file.length();
    }
}
