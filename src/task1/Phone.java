package task1;

public class Phone {

    long number;
    String model;
    int weight;
    public void receiveCall(String name) {
        System.out.printf("%s is ringing to %d\n", name, number);
    }

    public void receiveCall(String name, long number) {
        System.out.printf("%s with number %d is ringing to %d\n", name, number, this.number);
    }

    public void sendMessage(long...numbers) {
        StringBuilder sb = new StringBuilder();
        for(long i : numbers) {
            sb.append(i).append(", ");
        }
        String numbers1 = sb.toString().trim();
        numbers1 = numbers1.substring(0, numbers1.length()-1);
        System.out.printf("%s is sending messages to %s\n", this.number, numbers1);
    }

    public Phone(long number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
