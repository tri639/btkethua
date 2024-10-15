class Magazine extends LibraryItem {
    private int issueNumber;
    private String published;

    public Magazine (int issueNumber, String published, String title, int yearPublished) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
        this.published = published;
    }
    public void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("YearPublished: " + yearPublished);
        System.out.println("IssueNumber: " + issueNumber);
        System.out.println("Published: " + published);
    }
}
