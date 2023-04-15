package com.bridgelabz.user;

@FunctionalInterface
public interface Email {
void email(String Email) throws UserRegistationException;
}
