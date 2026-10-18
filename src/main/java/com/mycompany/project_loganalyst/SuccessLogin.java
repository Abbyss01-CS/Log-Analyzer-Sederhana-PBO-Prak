package com.mycompany.project_loganalyst;

/**
 * Class SuccessLogin (Subclass / Child)
 */
public class SuccessLogin extends LogEntry {

    private String username;
    private final SesiLogin sesi;

    public SuccessLogin(String ip, String timestamp, String username) {
        super(ip, "SUCCESS", timestamp);
        this.username = username;
        this.sesi = new SesiLogin(username + "-" + timestamp); // dibuat bersamaan
    }

    public void tampilkanSesi() {
        sesi.tampilkanSesi();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getLogType() {
        return "SUCCESS LOGIN";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   User: " + username);
    }
}