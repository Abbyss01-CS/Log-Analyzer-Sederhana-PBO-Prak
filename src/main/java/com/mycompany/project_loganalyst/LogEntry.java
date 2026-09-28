package com.mycompany.project_loganalyst;
 
/**
 * Class LogEntry
 * Struktur dasar merepresentasikan satu baris log login.
 *
 * Menerapkan: Class & Object, Field & Method, Constructor,
 * Encapsulation (private field + getter/setter), Validasi data
 */
public class LogEntry {
 
    // Field (private)
    private String ip;
    private String status;
    private String timestamp;
 
    // Constructor
    public LogEntry(String ip, String status, String timestamp) {
        this.ip = ip;
        this.status = status;
        this.timestamp = timestamp;
    }
 
    // Method
    public void printInfo() {
        System.out.println("[" + timestamp + "] IP: " + ip + " -> " + status);
    }
 
    // ===== Getter & Setter untuk ip =====
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