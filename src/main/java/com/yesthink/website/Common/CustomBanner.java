package com.yesthink.website.Common;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

/**
 * Application 구동시 출력되는 기본 정보
 */
public class CustomBanner implements Banner {

    @Override
    public void printBanner(
            Environment environment,
            Class<?> sourceClass,
            PrintStream out
    ) {
        out.println("__   __            _    _      _         _    ");
        out.println("\\ \\ / /           | |  | |    (_)       | |   ");
        out.println(" \\ V /   ___  ___ | |_ | |__   _  _ __  | | __");
        out.println("  \\ /   / _ \\/ __|| __|| '_ \\ | || '_ \\ | |/ /");
        out.println("  | |  |  __/\\__ \\| |_ | | | || || | | ||   < ");
        out.println("  \\_/   \\___||___/ \\__||_| |_||_||_| |_||_|\\_\\");
        out.println(":: Project :: " + environment.getProperty("project.name"));
        out.println(":: Version :: " + environment.getProperty("project.version"));
        out.println(":: State   :: " + environment.getProperty("project.state"));
        out.println(" ");
    }
}