package com.convert;
/*
 * ��ת�Ͷ����ܲ������������ӵĳ�Ա�����ͳ�Ա����
 * ��ת�Ͷ�����Դ�������������������д��ʵ������
 * ��ת�Ͷ�����Ե�������̳еĳ�Ա���������صĳ�Ա����
 */
public class Convert3 {

	public static void main(String[] args) {
		Lady missLiu = new Lady();
		missLiu.pet = new Dog2();	//��������ָ��������������ʵ����ֵ�����������
		missLiu.petEnjoy();
		
		Lady missWang = new Lady();
		missWang.pet = new Bird();	//��������ָ��������������ʵ����ֵ�����������
		missWang.petEnjoy();
	}

}
