import java.util.ArrayList;
/*
 * ADT ที่เก็บ Integer แบบไม่ซ้ำกันและเรียงลำดับ
 */
public class Integerset {
    ArrayList<Integer> Numbers ; //Rep
    //Integer ต้องเรียงจากน้อยไปมาก ห้ามมีnull หรือ ตัวเลขซ้ำ

    // AF(Integer) = เซตของตัวเลขทั้งหมดที่อยู่ใน Integer
    // RI = 1.ตัวเลขต้องเรียงจากน้อยไปมาก
    //      2.ตัวเลขห้ามซ้ำ และ ห้ามว่าง
    public Integerset(){
        Numbers = new ArrayList<>();
        CheckRep();
    }
    private void CheckRep(){
        if(Numbers==null)
            throw new RuntimeException("Number is null");
        if(Numbers.size()>1){
            for(int i=0;i<Numbers.size() -1;i++ ){
                if(Numbers.get(i)>=Numbers.get(i+1))
                    throw new RuntimeException("error sort");
            }
        }
    }
    /**
     * @param x ตัวอักษรที่ต้องการเพิ่ม
     */
    public void add(Integer x){
        if(!Numbers.contains(x) && Numbers !=null && x !=null){
            if(Numbers.size()==0){
                Numbers.add(x);

            }else{
                if(x < Numbers.get(0)){
                    Numbers.add(0,x);
                } else {
                for(int i=0; i<Numbers.size(); i++){
                    if(i==Numbers.size()-1){
                        Numbers.add(x);
                        break;
                    }
                    if(Numbers.get(i)<x && x<Numbers.get(i+1)){
                        Numbers.add(i+1,x);
                        break;
                    }
                }
            }
        }
    }
        CheckRep();
    }
    public void remove(Integer x){
        Numbers.remove(x);
        CheckRep();
    }
    public boolean contains(Integer x){
        return Numbers.contains(x);

    }
    public int size(){
        return Numbers.size();
    }
    
    public String toString(){
        if(Numbers.isEmpty()){
            return "{}";
        }
        StringBuilder sb=new StringBuilder("{");
        for(int i=0; i < Numbers.size(); i++){
            sb.append(Numbers.get(i));
            if(i<Numbers.size() - 1){
                sb.append(", ");
            }
        }
        sb.append("}");
        return Numbers.toString();
        
    }
    
}
