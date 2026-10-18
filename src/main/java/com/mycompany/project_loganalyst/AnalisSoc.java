package com.mycompany.project_loganalyst;

import java.util.ArrayList;
import java.util.List;

/**
 * Class AnalisSOC
 */
public class AnalisSoc {

    private String nama;
    private List<LogEntry> daftarLog;

    public AnalisSoc(String nama) {
        this.nama = nama;
        this.daftarLog = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void tambahLog(LogEntry log) {
        daftarLog.add(log);
    }

    public void tampilkanLog() {
        System.out.println("Daftar log yang ditangani " + nama + ":");
        for (LogEntry log : daftarLog) {
            System.out.println("- " + log.getIp() + " (" + log.getLogType() + ")");
        }
    }
    
    public void periksa(FailedLogin log) {
        System.out.println(nama + " memeriksa IP " + log.getIp());
        log.checkAlert();
    }
}