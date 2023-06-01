package ru.itmo.homework.hwExceptions;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class Task {
    private static void throwException(Status status)
            throws JarException, FileNotFoundException, AccessDeniedException {
        switch (status) {
            case JAR_ERROR -> throw new JarException();
            case ACCESS_DENIED -> throw new AccessDeniedException("file");
            case FILE_NOT_FOUND -> throw new FileNotFoundException();
        }
    }

    public static void main(String[] args) {
        var status = Status.ACCESS_DENIED;

        try {
            throwException(status);
        } catch (FileNotFoundException | JarException e) {
            e.printStackTrace();
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
