package com.training.java.exercise.lesson14.lowLevel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskThree {

    public int amountOfNumbers(String userString) {
        String[] strings = userString.split(" ");
        int result = 0;
        Pattern pattern = Pattern.compile("\\d{3,}");
        Matcher matcher = pattern.matcher(userString);
        while (matcher.find()) {
            result++;
        }
        return result;
    }
}

// TODO: 16.09.2021 https://www.google.com/search?q=regular+expression+java&sxsrf=AOaemvIoQyRv1p2BN-WlID2YnpDEZ1spvw%3A1631772211388&ei=M95CYf3qFv2L9u8P2Nag2AQ&oq=regular+expression+java&gs_lcp=Cgdnd3Mtd2l6EAMyBQgAEMsBMgUIABCABDIFCAAQywEyBQgAEMsBMgUIABDLATIFCAAQywEyBQgAEMsBMgUIABDLATIFCAAQywEyBQgAEMsBOgcIIxCwAxAnOgcIABBHELADOgcIABCwAxBDOgQIIxAnOgQIABBDOgQIABANSgQIQRgAUOIJWMAVYP0WaAJwAngAgAFuiAGlBJIBAzQuMpgBAKABAcgBCsABAQ&sclient=gws-wiz&ved=0ahUKEwi90I2Y6YLzAhX9hf0HHVgrCEsQ4dUDCA4&uact=5