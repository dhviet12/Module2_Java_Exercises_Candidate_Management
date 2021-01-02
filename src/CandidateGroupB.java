public class CandidateGroupB extends Candidate{
    private double subjectMath;
    private double subjectChemistry;
    private double subjectBiology;

    public CandidateGroupB(int codeNumber, String name, String address, int priorityArea, double subjectMath, double subjectChemistry, double subjectBiology) {
        super(codeNumber, name, address, priorityArea);
        this.subjectMath = subjectMath;
        this.subjectChemistry = subjectChemistry;
        this.subjectBiology = subjectBiology;
    }

    public double getSubjectMath() {
        return subjectMath;
    }

    public double getSubjectChemistry() {
        return subjectChemistry;
    }

    public double getSubjectBiology() {
        return subjectBiology;
    }

    @Override
    public String toString() {
        return super.toString()+", subjectMath= " + this.getSubjectMath() + ", subjectChemistry= " +this.getSubjectChemistry() + ", subjectBiology= "+ this.getSubjectBiology()+'}';
    }
}
