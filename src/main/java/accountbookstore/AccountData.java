package accountbookstore;

public class AccountData {
    private String date;
    private String summary;
    private String income;
    private String expend;

    public AccountData(String date, String summary, String income, String expend) {
        this.date = date;
        this.summary = summary;
        this.income = income;
        this.expend = expend;
    }

    public String getDate() {
        return date;
    }

    public String getSummary() {
        return summary;
    }

    public String getIncome() {
        return income;
    }

    public String getExpend() {
        return expend;
    }
}
