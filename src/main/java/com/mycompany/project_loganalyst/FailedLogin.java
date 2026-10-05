package com.mycompany.project_loganalyst;

/**
 * Class FailedLogin (Subclass / Child)
 */
public class FailedLogin extends LogEntry implements Alertable {

    private int attemptCount;

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

    public boolean isSuspicious() {
        return attemptCount > 2;
    }

    @Override
    public String getLogType() {
        return "FAILED LOGIN";
    }

    @Override
    public void checkAlert() {
        if (isSuspicious()) {
            System.out.println("[ALERT] IP " + getIp() + " mencurigakan - "
                    + attemptCount + "x gagal login!");
        } else {
            System.out.println("[OK] IP " + getIp() + " masih dalam batas wajar.");
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   Percobaan gagal: " + attemptCount + "x"
                + (isSuspicious() ? "  [MENCURIGAKAN]" : ""));
    }
}