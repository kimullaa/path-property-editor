package com.example.path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.file.Path;

@Component
public class Application implements CommandLineRunner {
    @Value(("${home.dir}"))
    Path path;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("----------------");
        System.out.println(path);
        System.out.println("----------------");
    }
}
