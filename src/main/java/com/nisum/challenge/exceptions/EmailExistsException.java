package com.nisum.challenge.exceptions;

public class EmailExistsException extends RuntimeException {
  public EmailExistsException(String message) {
    super(message);
  }
}
