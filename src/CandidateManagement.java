import java.util.ArrayList;

public class CandidateManagement {
    private ArrayList<Candidate> candidateManagement = new ArrayList<>();

    public void addCandidate(Candidate candidate) {
        candidateManagement.add(candidate);
    }

    public void findCandidateByCode(int code) {
        boolean checkCode = false;
        for (int i = 0; i < candidateManagement.size(); i++) {
            Candidate candidate = candidateManagement.get(i);
            if (candidate.getCodeNumber() == code){
                System.out.println(candidate);
                checkCode = true;
            }
        }
        if(!checkCode){
            System.err.println("Not found");
        }
    }

}
