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
        FailedLogin gagal1 = new FailedLogin("192.168.1.10", "07:50:12", 3);
        FailedLogin gagal2 = new FailedLogin("192.168.1.12", "07:52:41", 1);
        Successlogin sukses1 = new Successlogin("192.168.1.11", "07:51:03", "abbas");
 
        System.out.println("=== Info tiap log (method hasil override) ===");
        gagal1.printInfo();
        gagal2.printInfo();
        sukses1.printInfo();
 
        System.out.println("\n=== Method warisan dari LogEntry ===");
        System.out.println("IP gagal1: " + gagal1.getIp());
        System.out.println("Status sukses1: " + sukses1.getStatus());
 
        System.out.println("\n=== Method milik subclass ===");
        System.out.println("gagal1 mencurigakan? " + gagal1.isSuspicious());
        System.out.println("gagal2 mencurigakan? " + gagal2.isSuspicious());
 
        System.out.println("\n=== Daftar log (tipe LogEntry) ===");
        LogEntry[] semuaLog = {gagal1, gagal2, sukses1};
        for (LogEntry log : semuaLog) {
            log.printInfo();
        }
    }
}