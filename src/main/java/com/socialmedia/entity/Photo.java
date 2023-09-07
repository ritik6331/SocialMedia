package com.socialmedia.entity;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Photo")
public class Photo{
	
	
	private String filename;
    private String fileType;
    private String fileSize;
    private byte[] file;
		public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "Photo [filename=" + filename + ", fileType=" + fileType + ", fileSize=" + fileSize + ", file="
				+ Arrays.toString(file) + "]";
	}
	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Photo(String filename, String fileType, String fileSize, byte[] file) {
		super();
		this.filename = filename;
		this.fileType = fileType;
		this.fileSize = fileSize;
		this.file = file;
	}
	

}
