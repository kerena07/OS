package OS;

public class os_main {
public static void main(String[] args) {
// TODO Auto-generated method stub
os thread[] = new os[10];
 for(int i=0;i<10;i++){
 thread[i] = new os(i+1);
 thread[i].start();
 }
}
}