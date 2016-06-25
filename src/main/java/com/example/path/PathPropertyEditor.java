package com.example.path;

import java.beans.PropertyEditorSupport;
import java.nio.file.Paths;

public class PathPropertyEditor extends PropertyEditorSupport{

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        this.setValue(text == null?null: Paths.get(text));
    }
}
