public class Candidate {
    private int codeNumber;
    private String name;
    private String address;
    private int priorityArea;

    public Candidate(int codeNumber, String name, String address, int priorityArea) {
        this.codeNumber = codeNumber;
        this.name = name;
        this.address = address;
        this.priorityArea = priorityArea;
    }

    public int getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "codeNumber=" + codeNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityArea=" + priorityArea ;
    }
}
