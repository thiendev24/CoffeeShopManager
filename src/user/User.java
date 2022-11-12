package user;

import java.util.Date;

import static utils.DateUtils.parseStringToDate;

public class User {
    private Long id;
    private String userName;
    private String password;
    private String fullName;
    private String phone;
    private String email;
    private String address;
    private String role;
    private Date dateCreate;
    private Date dateUpdate;

    public User() {
    }

    public User(String userName, String password, String fullName, String phone, String email, String address, String role) {
        this.id = System.currentTimeMillis() / 1000000;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.role = role;
        this.dateCreate = new Date();
        this.dateUpdate = new Date();
    }
    public User(String userName, String password, String fullName, String phone, String email, String address) {
        this.id = System.currentTimeMillis() / 1000000;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.dateCreate = new Date();
        this.dateUpdate = new Date();
    }
    public static User parseUser(String raw) {
        User user = new User();
        String[] fields = raw.split(",");
        user.id = Long.parseLong(fields[0]);
        user.userName = fields[1];
        user.password = fields[2];
        user.fullName = fields[3];
        user.phone = fields[4];
        user.email = fields[5];
        user.address = fields[6];
        user.role = fields[7];
        user.dateCreate = parseStringToDate(fields[8]);
        user.dateUpdate = parseStringToDate(fields[9]);
        return user;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Date getDateCreate() {
        return dateCreate;
    }


    @Override
    public String toString() {
        return String.format("%d,%s,%s,%s,%s,%s,%s,%s,%s,%s", id, userName, password, fullName, phone, email, address,
                role, dateCreate, dateUpdate);
    }
}