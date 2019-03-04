import java.util.ArrayList;

public class ElectionResult {

    private double votes_dem;
    private double votes_gop;
    private double total_votes;
    private double per_dem;
    private double diff;
    private String per_point_diff;
    private String state_abbr;
    private String country_name;
    private int combined_fip;

    public ElectionResult() {

    }

    public void setVotes_dem(double votes_dem) {
        this.votes_dem = votes_dem;
    }

    public void setVotes_gop(double votes_gop) {
        this.votes_gop = votes_gop;
    }

    public void setTotal_votes(double total_votes) {
        this.total_votes = total_votes;
    }

    public void setPer_dem(double per_dem) {
        this.per_dem = per_dem;
    }

    public void setDiff(double diff) {
        this.diff = diff;
    }

    public void setPer_point_diff(String per_point_diff) {
        this.per_point_diff = per_point_diff;
    }

    public void setState_abbr(String state_abbr) {
        this.state_abbr = state_abbr;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public void setCombined_fip(int combined_fip) {
        this.combined_fip = combined_fip;
    }

    public double getVotes_dem() {
        return votes_dem;
    }

    public double getVotes_gop() {
        return votes_gop;
    }

    public double getTotal_votes() {
        return total_votes;
    }

    public double getPer_dem() {
        return per_dem;
    }

    public double getDiff() {
        return diff;
    }

    public String getPer_point_diff() {
        return per_point_diff;
    }

    public String getState_abbr() {
        return state_abbr;
    }

    public String getCountry_name() {
        return country_name;
    }

    public int getCombined_fip() {
        return combined_fip;
    }

    @Override
    public String toString() {
        return "ElectionResult{" +
                "votes_dem=" + votes_dem +
                ", votes_gop=" + votes_gop +
                ", total_votes=" + total_votes +
                ", per_dem=" + per_dem +
                ", diff=" + diff +
                ", per_point_diff='" + per_point_diff + '\'' +
                ", state_abbr='" + state_abbr + '\'' +
                ", country_name='" + country_name + '\'' +
                ", combined_fip=" + combined_fip +
                '}';
    }
}
