package io.enumeration_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;

public class InpStreamEnum implements Enumeration<InputStream> {
    private Enumeration<String> files;

    public InpStreamEnum(Vector<String> files){
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public InputStream nextElement() {
        try{
            return new FileInputStream(files.nextElement());
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
