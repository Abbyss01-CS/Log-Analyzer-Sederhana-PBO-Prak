package com.mycompany.project_loganalyst;

/**
 * Custom Exception
 */
public class StatusTidakValidException extends Exception {

    public StatusTidakValidException(String pesan) {
        super(pesan);
    }
}