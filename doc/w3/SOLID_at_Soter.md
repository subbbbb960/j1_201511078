		S : comparator 한가지의 일만하는것
여러개를 넣으면 하나만 바꾸고 싶은데 다른거에도 영향이감
침대를 생각하면됨 싱글침대(뛰어도 옆침대에 영향안감) 
더블침대(뛰면 같은침대도 흔들림)

interface Comparator {
    public int compare(Object o1, Object o2);
    public boolean equals(Object o);
}



		O : 확장에는 열려있고 수정에는 닫혀있고

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

DateComparator는 Comparator에서 확장된것이고
수정을해도 StringComparator에는 영향이 안간다



		L : 객체지향에서 상속이 제일중요함
부모가 하는일을 부분적으로 부정하는건 불가능
ex)사람밑에 학생 , 직장인이 있으면 안됨 (학생과 직장인을 동시에 할수있어서)

상속받은 모든부분에서 LSP를 볼수있음.



		I : 인터페이스 분리

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

인터페이스를 분리



		D : 의존성 역전의 원칙
의존관계가 바뀜
Sorter에서는 원래 DateComparator한테 의존했었는데
DateComparator가 Comparator를 상속받아서 의존관계가 바꼈다.
