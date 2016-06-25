package com.example.path;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.PropertyEditor;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class PathPropertyEditorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PathPropertyEditorApplication.class, args);
	}

	@Bean
	public CustomEditorConfigurer getCustomEditorConfigurer(){
		CustomEditorConfigurer configurer = new CustomEditorConfigurer();
		Map<Class<?>, Class<? extends PropertyEditor>> map = new HashMap<>();
		map.put(Path.class, PathPropertyEditor.class);
		configurer.setCustomEditors(map);
		return configurer;
	}
}
