package OS;

public class os extends Thread {
private int id;

 public os(int i){
 id = i;
 }
 public long getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
 }
 public void run(){
 System.out.println("Thread: " + getId() + " created");
 }
}



