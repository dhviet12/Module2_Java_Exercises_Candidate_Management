public class CandidateGroupC extends Candidate{
    private double subjectLiterature;
    private double subjectHistory;
    private double subjectGeography;

    public CandidateGroupC(int codeNumber, String name, String address, int priorityArea, double subjectLiterature, double subjectHistory, double subjectGeography) {
        super(codeNumber, name, address, priorityArea);
        this.subjectLiterature = subjectLiterature;
        this.subjectHistory = subjectHistory;
        this.subjectGeography = subjectGeography;
    }

    public double getSubjectLiterature() {
        return subjectLiterature;
    }

    public double getSubjectHistory() {
        return subjectHistory;
    }

    public double getSubjectGeography() {
        return subjectGeography;
    }

    @Override
    public String toString() {
        return super.toString() +", subjectLiterature= " + this.getSubjectLiterature() + ", subjectHistory= " +this.getSubjectHistory() + ", subjectGeography= "+ this.getSubjectGeography()+'}';
    }
}
