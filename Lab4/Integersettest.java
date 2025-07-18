public class Integersettest {
    public static void main(String[] args) {
        System.out.println("--- Starting CharSet Manual Tests ---");
        int passed = 0;
        int failed = 0;

        //Case1: การสร้าง การเพิ่ม การเรียงลำดับ
        Integerset a=new Integerset();
        a.add(50);
        a.add(70);
        a.add(40);
        a.add(60);
        String s="[40, 50, 60, 70]";
        if(a.toString().equals(s)){
        System.out.println("Passed");
        passed++;
        }else{
        System.out.println("Failed"+a.toString());
        failed++;
    }
    //Case2: การลบข้อมูล
    System.out.println("\n--- Testing remove() ---");
    a.remove(50);
    s = "[40, 60, 70]";
    if(a.toString().equals(s)){
        System.out.println("Passed");
        passed++;
    }else{
         System.out.println("Failed"+a.toString());
         failed++;
    }

    //Case3 การเพิ่มข้อมูลที่ซับซ้อนมากขึ้น
    System.out.println("\n--- Testing adding duplicates ---");
    a.add(40); //40 มีค่าซ้ำแล้ว
    if (a.size() == 3){
        System.out.println("Passed");
        passed++;
    }else{
        System.out.println("Failed"+a.size());
        failed++;
    }

    //Case4 การตรวจสอบข้อมูล
    System.out.println("\n--- Testing contains() ---");
    if (a.contains(40) && !a.contains(50)) {
        System.out.println("Passed");
        passed++;
    }else{
        System.out.println("Failed");
        failed++;
    }

    //สรุปผล
    System.out.println("\n-------------------------------");
    System.out.println("---- Test Summary ----");
    System.out.println("Passed: "+passed+", Failed: "+failed);
    if (failed == 0){
        System.out.println("All passed!!!");
    }else{
        System.out.println("Some tests failed");
    }

}
}
