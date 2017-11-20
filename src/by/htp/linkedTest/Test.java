package by.htp.linkedTest;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<String>();
        
        // ������� � ������ ��� ���������
        states.add("��������");
        states.add("�������");
        states.addLast("��������������"); // ��������� �� ��������� �����
        states.addFirst("�������"); // ��������� �� ������ �����
        states.add(1, "������"); // ��������� ������� �� ������� 1
       
        System.out.printf("� ������ %d ��������� \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "�����");
        
        for(String state : states){
         
            System.out.println(state);
        }
        
        System.out.println("");

	}

}
