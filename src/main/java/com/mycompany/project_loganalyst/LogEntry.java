/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_loganalyst;

/**
 *
 * @author ASUS
 */
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

}
