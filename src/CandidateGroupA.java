public class CandidateGroupA extends Candidate{
    private double subjectMath;
    private double subjectPhysical;
    private double subjectChemistry;

    public CandidateGroupA(int codeNumber, String name, String address, int priorityArea, double subjectMath, double subjectPhysical, double subjectChemistry) {
        super(codeNumber, name, address, priorityArea);
        this.subjectMath = subjectMath;
        this.subjectPhysical = subjectPhysical;
        this.subjectChemistry = subjectChemistry;
    }

    public double getSubjectMath() {
        return subjectMath;
    }

    public double getSubjectPhysical() {
        return subjectPhysical;
    }

    public double getSubjectChemistry() {
        return subjectChemistry;
    }

    @Override
    public String toString() {
        return super.toString() +", subjectMath= " + this.getSubjectMath() + ", subjectPhysical= " +this.getSubjectPhysical() + ", subjectChemistry= "+ this.getSubjectChemistry()+'}';
    }
}
