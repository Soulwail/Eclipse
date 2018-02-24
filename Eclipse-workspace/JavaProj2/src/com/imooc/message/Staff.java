package com.imooc.message;

/**
 * Ա����Ϣ
 * 
 * @author 87945
 */
public class Staff {
	// ��Ա���ԣ�Ա�����������š����䡢�Ա�ְ����Ϣ
	private String name;
	private String number;
	private int age;
	private String sex;
	private Department departSub;
	private Duty dutyName;

	// �޲ι��췽��
	public Staff() {

	}
	
	// ���ι��췽����ʵ�ֶ�Ա�����������š����䡢�Ա�ְ����Ϣ���Եĸ�ֵ
	public Staff(String name, String number, int age, String sex, Duty dutyName) {
		this.setName(name);
		this.setNumber(number);
		this.setAge(age);
		this.setSex(sex);
		this.setDutyName(dutyName);
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	// �������������
	public void setAge(int age) {
		if (age < 0 || age < 18 || age > 65) {
			this.age = 18;
		} else
			this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	// ���Ա��������
	public void setSex(String sex) {
		if (sex.equals("��") || sex.equals("Ů")) {
			this.sex = sex;
		} else
			this.sex = "��";
	}

	public String getSex() {
		return this.sex;
	}

	public void setDutyName(Duty dutyName) {
		this.dutyName = dutyName;
	}

	public Duty getDutyName() {
		if (this.dutyName == null) {
			this.dutyName = new Duty();
		}
		return this.dutyName;
	}

	/**
	 * ��ȡ�������ƣ����û��ʵ��������ʵ�����ٷ���
	 * 
	 * @return ��������
	 */
	public Department getDepartSub() {
		if (this.departSub == null) {
			this.departSub = new Department();
		}
		return departSub;
	}

	public void setDepartSub(Department departSub) {
		this.departSub = departSub;
	}

	/**
	 * Ա����Ϣ
	 * 
	 * @return Ա�����ܵ������Ϣ������Ա�����������š����䡢�Ա��������š�ְ����Ϣ
	 */
	public String info() {
		String str = "������" + this.getName() + "\n���ţ�" + this.getNumber() + "\n�Ա�" + this.getSex() + "\n���䣺"
				+ this.getAge() + "\nְ��" + this.getDepartSub().getDepartName() + this.getDutyName().getDutyName() + "\n=======================";
		return str;
	}
}
