package com.mycompany.project_loganalyst;
 
/**
 * Class SuccessLogin (Subclass / Child)
 * Turunan dari LogEntry, khusus untuk log login yang BERHASIL.
 */
public class SuccessLogin extends LogEntry {
 
    private String username;
 
    public SuccessLogin(String ip, String timestamp, String username) {
        super(ip, "SUCCESS", timestamp);
        this.username = username;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   User: " + username);
    }
}