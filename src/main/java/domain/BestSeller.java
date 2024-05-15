package domain;

import java.util.Objects;

public class BestSeller {
    private String isbn;
    private String title;
    private String author;
    private String edition;
    private int salesCount;
    private double revenue;
    private String publisher;
    private String description;

    protected BestSeller() {}

    private BestSeller(Builder builder){
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.author = builder.author;
        this.edition = builder.edition;
        this.salesCount = builder.salesCount;
        this.revenue = builder.revenue;
        this.publisher = builder.publisher;
        this.description = builder.description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getEdition() {
        return edition;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public double getRevenue() {
        return revenue;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BestSeller)) return false;
        BestSeller that = (BestSeller) o;
        return salesCount == that.salesCount &&
                Double.compare(that.revenue, revenue) == 0 &&
                Objects.equals(isbn, that.isbn) &&
                Objects.equals(title, that.title) &&
                Objects.equals(author, that.author) &&
                Objects.equals(edition, that.edition) &&
                Objects.equals(publisher, that.publisher) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, edition, salesCount, revenue, publisher, description);
    }

    @Override
    public String toString() {
        return "BestSeller{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", edition='" + edition + '\'' +
                ", salesCount=" + salesCount +
                ", revenue=" + revenue +
                ", publisher='" + publisher + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private String isbn;
        private String title;
        private String author;
        private String edition;
        private int salesCount;
        private double revenue;
        private String publisher;
        private String description;

        public Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setEdition(String edition) {
            this.edition = edition;
            return this;
        }

        public Builder setSalesCount(int salesCount) {
            this.salesCount = salesCount;
            return this;
        }

        public Builder setRevenue(double revenue) {
            this.revenue = revenue;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(BestSeller bestSeller) {
            this.isbn = bestSeller.isbn;
            this.title = bestSeller.title;
            this.author = bestSeller.author;
            this.edition = bestSeller.edition;
            this.salesCount = bestSeller.salesCount;
            this.revenue = bestSeller.revenue;
            this.publisher = bestSeller.publisher;
            this.description = bestSeller.description;
            return this;
        }

        public BestSeller build(){
            return new BestSeller(this);
        }
    }
}
