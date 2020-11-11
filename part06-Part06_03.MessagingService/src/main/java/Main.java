
public class Main {

    public static void main(String[] args) {

        MessagingService ms = new MessagingService();
        
        Message m1 = new Message("Simke", "Cao");
        Message m2 = new Message("Baki", "Cao");
        
        ms.add(m1);
        ms.add(m2);
        
        System.out.println(ms.getMessages());
    
    }
    
}