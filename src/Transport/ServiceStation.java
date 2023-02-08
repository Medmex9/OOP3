package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    public Queue <Auto<?>> queue = new LinkedList<>();
    public void AllAuto(Auto<?> auto) {
        if (auto instanceof Bus) {
            System.out.println("Автобусы не нуждаются в обслуживании");
        }
        else queue.add(auto);
    }
    public void makeAService() {
        Auto<?> auto = queue.poll();
        if(auto != null) {
            System.out.println("Нужно провести техническое обслуживание " + auto.getBrand() + auto.getModel() );
        }

    }

}
