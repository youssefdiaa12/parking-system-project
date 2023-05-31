import java.text.ParseException;

public class parking_functtion {
    void display() throws ParseException {

            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    for (int j = 0; j < 10; j++) {
                        if (entryGate.arr[j] == 1) {
                            System.out.print("the available slots are [");
                            break;
                        } else if (j == 9) {
                            System.out.println("there is no empty slot or the available slots are not suitable");
                            return;
                        }
                    }
                }
                if (entryGate.arr[i] != 1) {
                    System.out.print("the slot place is ["+(i+1) + "] ");
                    System.out.print("the slot width is "+entryGate.width_car.get(i)+", ");
                    System.out.print("the slot depth is "+entryGate.depth_car.get(i)+", ");
                }
            }
            System.out.println("]");
        }
    }

