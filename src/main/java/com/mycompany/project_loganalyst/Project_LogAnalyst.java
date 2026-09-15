/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_loganalyst;

/**
 *
 * @author ASUS
 */
public class Project_LogAnalyst {

    public static void main(String[] args) {
        LogEntry log1 = new LogEntry("192.168.1.10", "FAILED", "07:50:12");
 
        System.out.println("=== Data awal ===");
        System.out.println("IP: " + log1.getIp());
        System.out.println("Status: " + log1.getStatus());
        System.out.println("Timestamp: " + log1.getTimestamp());
 
        System.out.println("\n=== Ubah status jadi SUCCESS (valid) ===");
        log1.setStatus("SUCCESS");
        System.out.println("Status sekarang: " + log1.getStatus());
 
        System.out.println("\n=== Coba ubah status jadi UNKNOWN (tidak valid) ===");
        log1.setStatus("UNKNOWN");
        System.out.println("Status sekarang: " + log1.getStatus());
 
        System.out.println("\n=== Ubah ip dan timestamp ===");
        log1.setIp("192.168.1.99");
        log1.setTimestamp("08:15:30");
        System.out.println("IP sekarang: " + log1.getIp());
        System.out.println("Timestamp sekarang: " + log1.getTimestamp());
    }
}
