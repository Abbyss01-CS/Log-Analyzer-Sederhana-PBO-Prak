/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.project_loganalyst;

/**
 *
 * @author ASUS
 */
public class Project_LogAnalyst {

    public static void analisisLog(LogEntry log) {
        System.out.println("--- Menganalisis satu log ---");
        log.printInfo();
    }

    public static void main(String[] args) {
        FailedLogin gagal1 = new FailedLogin("192.168.1.10", "07:50:12", 3);
        FailedLogin gagal2 = new FailedLogin("192.168.1.12", "07:52:41", 1);
        SuccessLogin sukses1 = new SuccessLogin("192.168.1.11", "07:51:03", "abbas");

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

        System.out.println("\n=== Polymorphism: tipe parent menampung objek berbeda ===");
        LogEntry[] semuaLog = {gagal1, gagal2, sukses1};
        for (LogEntry log : semuaLog) {
            log.printInfo();
        }

        System.out.println("\n=== Polymorphism: method yang sama, perilaku beda ===");
        analisisLog(gagal1);
        analisisLog(sukses1);

        System.out.println("\n=== Abstract method getLogType() ===");
        for (LogEntry log : semuaLog) {
            System.out.println(log.getIp() + " -> " + log.getLogType());
        }

        System.out.println("\n=== Interface Alertable (cuma FailedLogin) ===");
        for (LogEntry log : semuaLog) {
            if (log instanceof Alertable alertableLog) {
                alertableLog.checkAlert();
            } else {
                System.out.println(log.getIp() + " -> tidak implements Alertable, dilewati.");
            }
        }

        System.out.println("\n=== Exception Handling: ubah status ===");
        try {
            gagal1.setStatus("FAILED");   // valid
            System.out.println("Status valid diterima: " + gagal1.getStatus());
            gagal1.setStatus("UNKNOWN");  // tidak valid -> melempar exception
            System.out.println("Baris ini tidak akan dijalankan.");
        } catch (StatusTidakValidException e) {
            System.out.println("Gagal ubah status: " + e.getMessage());
        } finally {
            System.out.println("Proses ubah status selesai.");
        }

        System.out.println("\n=== Composition: SuccessLogin & SesiLogin ===");
        SuccessLogin sukses2 = new SuccessLogin("192.168.1.20", "08:10:00", "bas");
        sukses2.tampilkanSesi();

        System.out.println("\n=== Aggregation: AnalisSOC & LogEntry ===");
        AnalisSoc analis = new AnalisSoc("Abbas");
        analis.tambahLog(gagal1);
        analis.tambahLog(gagal2);
        analis.tambahLog(sukses1);
        analis.tampilkanLog();

        System.out.println("\n=== Association: AnalisSOC memeriksa log ===");
        analis.periksa(gagal1);
    }
}