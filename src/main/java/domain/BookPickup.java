package domain;

import java.util.Objects;

public class BookPickup {
    private String address;
    private String contactInformation;
    private String operatingHours;
    private String city;

    protected BookPickup() {
    }

    private BookPickup(Builder builder){
        this.address = builder.address;
        this.contactInformation = builder.contactInformation;
        this.operatingHours = builder.operatingHours;
        this.city = builder.city;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookPickup)) return false;
        BookPickup that = (BookPickup) o;
        return Objects.equals(getAddress(), that.getAddress()) &&
                Objects.equals(getContactInformation(), that.getContactInformation()) &&
                Objects.equals(getOperatingHours(), that.getOperatingHours()) &&
                Objects.equals(getCity(), that.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress(), getContactInformation(), getOperatingHours(), getCity());
    }

    @Override
    public String toString() {
        return "BookPickup{" +
                "address='" + address + '\'' +
                ", contactInformation='" + contactInformation + '\'' +
                ", operatingHours='" + operatingHours + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static class Builder {
        private String address;
        private String contactInformation;
        private String operatingHours;
        private String city;

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setContactInformation(String contactInformation) {
            this.contactInformation = contactInformation;
            return this;
        }

        public Builder setOperatingHours(String operatingHours) {
            this.operatingHours = operatingHours;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder copy(BookPickup bookPickup) {
            this.address = bookPickup.address;
            this.contactInformation = bookPickup.contactInformation;
            this.operatingHours = bookPickup.operatingHours;
            this.city = bookPickup.city;
            return this;
        }

        public BookPickup build(){
            return new BookPickup(this);
        }
    }
}
