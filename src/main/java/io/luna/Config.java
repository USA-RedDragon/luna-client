package io.luna;

import io.luna.config.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.yaml.snakeyaml.Yaml;

public final class Config {
    private static Config instance = null;

    private Configuration config = null;

    private Config(Configuration config) {
        this.config = config;
    }

    public Configuration getConfig() {
        return config;
    }

    public static Configuration get()
    {
        if(instance == null) {
            Configuration conf = null;
            Yaml yaml = new Yaml();
            try (InputStream in = Files.newInputStream(Paths.get("config.yaml"))) {
                conf = yaml.loadAs(in, Configuration.class);
                System.out.println(conf.toString());
            } catch (IOException ex) {
                System.err.println("config.yaml does not exist");
            }

            instance = new Config(conf);
        }

        return instance.getConfig();
    }
}