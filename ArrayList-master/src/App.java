import java.util.ArrayList;

public class App{

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add("Ankara");
        arrayList.add("İzmir");
        arrayList.add("Antalya");
        arrayList.add("İstanbul");

        System.out.println(arrayList.get(5)); // 5.index'i yani 6.elemanı ekranda bize gösterir

    }
}
