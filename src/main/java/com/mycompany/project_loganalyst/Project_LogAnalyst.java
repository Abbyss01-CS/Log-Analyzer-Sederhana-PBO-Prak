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
        LogEntry log2 = new LogEntry("192.168.1.11", "SUCCESS", "07:51:03");
 
        log1.printInfo();
        log2.printInfo();
    }
}
