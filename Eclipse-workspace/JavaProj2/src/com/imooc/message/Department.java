package com.imooc.message;

public class Department {
	// ��Ա���ԣ����ű�š���������
	private String departNum;
	private String departName;
	private Staff[] department;
	private int staffNum;

	// �޲ι��췽��
	public Department() {

	}

	// ��ι��췽����ʵ�ֶԲ������ƺͲ��ű�����Եĸ�ֵ
	public Department(String departNum, String departName) {
		this.setDepartNum(departNum);
		this.setDepartName(departName);
	}

	// ��ι��췽����ʵ���������Եĸ�ֵ
	public Department(String departNum, String departName, Staff[] department) {
		this.setDepartNum(departNum);
		this.setDepartName(departName);
		this.setDepartment(department);
	}

	public void setDepartNum(String departNum) {
		this.departNum = departNum;
	}

	public String getDepartNum() {
		return this.departNum;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getDepartName() {
		return this.departName;
	}

	/**
	 * ��ȡ��������Ա��Ϣ��������沿����Ա��Ϣ������δ����ʼ�������ȳ�ʼ������Ϊ10
	 * 
	 * @return ���沿����Ա��Ϣ������
	 */
	public Staff[] getDepartment() {
		if (this.department == null) {
			this.department = new Staff[100];
		}
		return department;
	}

	public void setDepartment(Staff[] department) {
		this.department = department;
	}

	public int getStaffNum() {
		return staffNum;
	}

	public void setStaffNum(int staffNum) {
		this.staffNum = staffNum;
	}

	public void addStaff(Staff staff) {
		/*
		 * 1����Ա�����浽������ 2����Ա���������浽staffNum
		 */
		// 1����Ա�����浽������
		int i;

		for (i = 0; i < this.getDepartment().length; i++) {
			if (this.getDepartment()[i] == null) {
				staff.setDepartSub(this);
				this.getDepartment()[i] = staff;
				break;
			}
		}

		// 2����Ա���������浽staffNum
		this.staffNum = i + 1;
	}

}
