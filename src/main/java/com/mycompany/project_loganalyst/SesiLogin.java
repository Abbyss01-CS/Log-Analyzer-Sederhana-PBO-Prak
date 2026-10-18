package com.mycompany.project_loganalyst;

/**
 * Class SesiLogin
 */
public class SesiLogin {

    private String idSesi;

    public SesiLogin(String idSesi) {
        this.idSesi = idSesi;
        System.out.println("Sesi " + idSesi + " dibuat.");
    }

    public void tampilkanSesi() {
        System.out.println("=== Sesi Login ===");
        System.out.println("ID Sesi: " + idSesi);
    }
}