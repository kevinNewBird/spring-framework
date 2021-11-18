package com.mashibing.analysis.selfConverter;

/**
 * description  People <BR>
 * <p>
 * author: zhao.song
 * date: created in 11:37  2021/11/17
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class People {

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "People{" +
				"student=" + student +
				'}';
	}
}
