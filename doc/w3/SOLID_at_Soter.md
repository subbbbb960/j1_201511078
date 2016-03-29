		S : comparator �Ѱ����� �ϸ��ϴ°�
�������� ������ �ϳ��� �ٲٰ� ������ �ٸ��ſ��� �����̰�
ħ�븦 �����ϸ�� �̱�ħ��(�پ ��ħ�뿡 ����Ȱ�) 
����ħ��(�ٸ� ����ħ�뵵 ��鸲)

interface Comparator {
    public int compare(Object o1, Object o2);
    public boolean equals(Object o);
}



		O : Ȯ�忡�� �����ְ� �������� �����ְ�

interface Comparator {
    public int compare(Object o1, Object o2);
    public boolean equals(Object o);
}

class DateComparator implements Comparator {
    public DateComparator() {}
    public int compare(Object o1, Object o2) {
      return ((Date) o1).compareTo((Date) o2);
    }
}

class StringComparator implements Comparator {
    public StringComparator() {}
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;
        String s2=(String)o2;
        return s1.compareTo(s2);
    }
}

DateComparator�� Comparator���� Ȯ��Ȱ��̰�
�������ص� StringComparator���� ������ �Ȱ���



		L : ��ü���⿡�� ����� �����߿���
�θ� �ϴ����� �κ������� �����ϴ°� �Ұ���
ex)����ؿ� �л� , �������� ������ �ȵ� (�л��� �������� ���ÿ� �Ҽ��־)

��ӹ��� ���κп��� LSP�� ��������.



		I : �������̽� �и�

interface Comparator {
    public int compare(Object o1, Object o2);
    public boolean equals(Object o);
}



class DateComparator implements Comparator {
    public DateComparator() {}
    public int compare(Object o1, Object o2) {
      return ((Date) o1).compareTo((Date) o2);
    }
}

class ReverseComparator implements Comparator {
    private final Comparator c;
    public ReverseComparator(Comparator c) {this.c = c; }
    public int compare(Object o1, Object o2) {
        return c.compare(o2, o1);
    }
}


class TurtleComparator implements Comparator {
    public int compare(Object t1, Object t2) {
        return ((WeightTurtle)t1).getWeight()-((WeightTurtle)t2).getWeight();
    }
}

class StringComparator implements Comparator {
    public StringComparator() {}
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;
        String s2=(String)o2;
        return s1.compareTo(s2);
    }
}

�������̽��� �и�



		D : ������ ������ ��Ģ
�������谡 �ٲ�
Sorter������ ���� DateComparator���� �����߾��µ�
DateComparator�� Comparator�� ��ӹ޾Ƽ� �������谡 �ٲ���.
