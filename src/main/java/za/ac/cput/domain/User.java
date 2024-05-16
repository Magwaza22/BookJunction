package za.ac.cput.domain;
import java.util.Objects;

public class User {
    private final String userID;
    private final String username;
    private final String userType;
    private final String password;
    private final String demography;

    public User(String userID, String username, String userType, String password, String demography) {
        this.userID = userID;
        this.username = username;
        this.userType = userType;
        this.password = password;
        this.demography = demography;
    }

    protected User(Builder builder) {
        this.userID = builder.userID;
        this.username = builder.username;
        this.userType = builder.userType;
        this.password = builder.password;
        this.demography = builder.demography;
    }

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getUserType() {
        return userType;
    }

    public String getPassword() {
        return password;
    }

    public String getDemography() {
        return demography;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getUserID(), user.getUserID()) && Objects.equals(getUsername(), user.getUsername()) && Objects.equals(getUserType(), user.getUserType()) && Objects.equals(getPassword(), user.getPassword()) && Objects.equals(getDemography(), user.getDemography());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getUsername(), getUserType(), getPassword(), getDemography());
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", username='" + username + '\'' +
                ", userType='" + userType + '\'' +
                ", password='" + password + '\'' +
                ", demography='" + demography + '\'' +
                '}';
    }

    public static class Builder {
        private String userID;
        private String username;
        private String userType;
        private String password;
        private String demography;

        public Builder setUserID(String userID) {
            this.userID = userID;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setUserType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setDemography(String demography) {
            this.demography = demography;
            return this;
        }
        public User.Builder copy(User user) {
            this.userID=user.userID;
            this.username=user.username;
            this.userType=user.userType;
            this.password=user.password;
            this.demography=user.demography;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }


}


