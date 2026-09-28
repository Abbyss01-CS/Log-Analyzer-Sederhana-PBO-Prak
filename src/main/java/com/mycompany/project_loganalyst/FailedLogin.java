package com.mycompany.project_loganalyst;
 
/**
 * Class FailedLogin (Subclass / Child)
 * Turunan dari LogEntry, khusus untuk log login yang GAGAL.
 */
public class FailedLogin extends LogEntry {
 
    private int attemptCount;
 
    // Constructor: memanggil constructor parent lewat super()
    public FailedLogin(String ip, String timestamp, int attemptCount) {
        super(ip, "FAILED", timestamp);
        this.attemptCount = attemptCount;
    }
 
    public int getAttemptCount() {
        return attemptCount;
    }
 
    public void setAttemptCount(int attemptCount) {
        if (attemptCount > 0) {
            this.attemptCount = attemptCount;
        } else {
            System.out.println("Jumlah percobaan harus lebih dari 0.");
        }
    }
 
    // Method baru khusus subclass
    public boolean isSuspicious() {
        return attemptCount > 2;
    }
 
    // Override method dari parent
    @Override
    public void printInfo() {
        super.printInfo(); // pakai tampilan dasar dari parent
        System.out.println("   Percobaan gagal: " + attemptCount + "x"
                + (isSuspicious() ? "  [MENCURIGAKAN]" : ""));
    }
}