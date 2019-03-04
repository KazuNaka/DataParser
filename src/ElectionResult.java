import java.util.ArrayList;

public class ElectionResult {

    private double votes_dem;
    private double votes_gop;
    private double total_votes;
    private double per_dem;
    private double per_gop;
    private int diff;
    private String per_point_diff;
    private String state_abbr;
    private String country_name;
    private int combined_fip;

    public ElectionResult(double votes_dem, double votes_gop, double total_votes, double per_dem, double per_gop, int diff, String per_point_diff, String state_abbr, String country_name, int combined_fip) {
        setVotes_dem(votes_dem);
        setVotes_gop(votes_gop);
        setTotal_votes(total_votes);
        setPer_dem(per_dem);
        setPer_gop(per_gop);
        setDiff(diff);
        setPer_point_diff(per_point_diff);
        setState_abbr(state_abbr);
        setCountry_name(country_name);
        setCombined_fip(combined_fip);
    }

    public void setVotes_dem(double votes_dem) {
        this.votes_dem = votes_dem;
    }

    public void setPer_gop(double per_gop) {
        this.per_gop = per_gop;
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

    public void setDiff(int diff) {
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


    public double getPer_gop() {
        return per_gop;
    }

    public double getTotal_votes() {
        return total_votes;
    }

    public double getPer_dem() {
        return per_dem;
    }

    public int getDiff() {
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
                "\n votes_dem :" + votes_dem +
                ",\n votes_gop :" + votes_gop +
                ",\n total_votes :" + total_votes +
                ",\n per_dem :" + per_dem +
                ",\n per_gop :" + per_gop +
                ",\n diff :" + diff +
                ",\n per_point_diff :'" + per_point_diff + '\'' +
                ",\n state_abbr :'" + state_abbr + '\'' +
                ",\n country_name :'" + country_name + '\'' +
                ",\n combined_fip :" + combined_fip +
                '}';
    }
}
