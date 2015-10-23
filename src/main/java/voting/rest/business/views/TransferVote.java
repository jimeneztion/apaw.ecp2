package voting.rest.business.views;

public class TransferVote {
    
    private String themeName;
    private int vote;

    public TransferVote(String themeName, int vote) {
        this.themeName = themeName;
        this.vote = vote;
    }

    public String getThemeName() {
        return themeName;
    }

    public int getVote() {
        return vote;
    }
}
