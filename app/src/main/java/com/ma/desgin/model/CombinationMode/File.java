package com.ma.desgin.model.CombinationMode;

class File implements Node {
	private String fileName;

	public File(String fileName) {
		this.fileName = fileName;
	}

	public void copy() {
		System.out.println("复制文件：" + fileName);
	}
}