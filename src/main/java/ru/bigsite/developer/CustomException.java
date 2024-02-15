package ru.bigsite.developer;

import java.time.LocalDateTime;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
    private String time = String.valueOf(LocalDateTime.now());

    public String getTime() {
        return time;
    }
}