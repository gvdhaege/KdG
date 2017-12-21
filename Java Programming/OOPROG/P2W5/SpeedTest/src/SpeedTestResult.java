
public class SpeedTestResult {
    private long arrayListTime;
    private long linkedListTime;
    private String testType;
    private int testSize;

    public  SpeedTestResult(String typeOfTest, int sizeOfTest, long timeElapsedForArrayList, long timeElapsedForLinkedList){
        this.arrayListTime = timeElapsedForArrayList;
        this.linkedListTime = timeElapsedForLinkedList;
        this.testType = typeOfTest;
        this.testSize = sizeOfTest;
    }

    @Override
    public String toString(){
        StringBuilder result  = new StringBuilder();
        result.append(String.format("\nTest %s bij een lijst van %d elementen:\n", this.testType, this.testSize));
        result.append(String.format("ArrayList: %3d ms <=> LinkedList: %3d ms ==> %s wint!",
                                                this.arrayListTime,
                                                this.linkedListTime,
                                                this.arrayListTime > this.linkedListTime ? "LinkedList" : "ArrayList"));
        return result.toString();
    }
}
