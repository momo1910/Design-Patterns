package com.designpatterns.Design.CreationalPatterns.PrototypePattern;

import java.util.List;

public class File implements Cloneable {
    String filename;
    String contentStatus;
    String location;
    List<String> pages;

    public List<String> getPages() {
        return pages;
    }

    public void setPages(List<String> pages) {
        this.pages = pages;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContentStatus() {
        return contentStatus;
    }

    public void setContentStatus(String contentStatus) {
        this.contentStatus = contentStatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "File{" +
                "filename='" + filename + '\'' +
                ", contentStatus='" + contentStatus + '\'' +
                ", location='" + location + '\'' +
                ", pages=" + pages +
                '}';
    }


    @Override
    protected File clone() throws CloneNotSupportedException {
        return (File) super.clone();
    }
}
