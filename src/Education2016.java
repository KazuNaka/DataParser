public class Education2016 {
    private double noHighSchool;
    private double OnlyHighSchool;
    private double someCollege;
    private double bachelorsOrMore;

    public Education2016(double noHigh, double OnlyHigh, double someCollege, double bachelorsorMore) {
        setNoHighSchool(noHigh);
        setOnlyHighSchool(OnlyHigh);
        setSomeCollege(someCollege);
        setBachelorsOrMore(bachelorsorMore);
    }

    public void setNoHighSchool(double noHighSchool) {
        this.noHighSchool = noHighSchool;
    }

    public void setOnlyHighSchool(double onlyHighSchool) {
        OnlyHighSchool = onlyHighSchool;
    }

    public void setSomeCollege(double someCollege) {
        this.someCollege = someCollege;
    }

    public void setBachelorsOrMore(double bachelorsOrMore) {
        this.bachelorsOrMore = bachelorsOrMore;
    }

    public double getNoHighSchool() {
        return noHighSchool;
    }

    public double getOnlyHighSchool() {
        return OnlyHighSchool;
    }

    public double getSomeCollege() {
        return someCollege;
    }

    public double getBachelorsOrMore() {
        return bachelorsOrMore;
    }
}
