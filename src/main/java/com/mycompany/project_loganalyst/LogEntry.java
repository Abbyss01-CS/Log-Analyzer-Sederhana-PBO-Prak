package com.mycompany.project_loganalyst;
 

public class LogEntry {
 
    private String ip;
    private String status;
    private String timestamp;
 
    public LogEntry(String ip, String status, String timestamp) {
        this.ip = ip;
        this.status = status;
        this.timestamp = timestamp;
    }
 
    public void printInfo() {
        System.out.println("[" + timestamp + "] IP: " + ip + " -> " + status);
    }
 
    public String getIp() {
        return ip;
    }
 
    public void setIp(String ip) {
        this.ip = ip;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        if (status.equalsIgnoreCase("FAILED") || status.equalsIgnoreCase("SUCCESS")) {
            this.status = status;
        } else {
            System.out.println("Gagal ubah status: nilai \"" + status
                    + "\" tidak valid. Harus FAILED atau SUCCESS.");
        }
    }
 
    public String getTimestamp() {
        return timestamp;
    }
 
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}