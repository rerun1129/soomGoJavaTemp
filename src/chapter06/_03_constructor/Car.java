package chapter06._03_constructor;

public class Car {
    /**
     * 보통 하나의 완전한 객체는 불변성을 가져야하며 이를 통상적으로 Value Object, VO라고 부른다.
     * 그리고 이 불변 객체에서 필요한 데이터를 옮기는데 사용하는 객체를 Data Transfer Object, DTO라고 부른다.
     * VO는 불변성을 지켜줘야 하나 DTO는 불변성에서 비교적 자유롭다.
     *
     * 여기에서 불변성이라 함은 객체의 필드 변수 즉, 프로퍼티를 setter로 고치지 않아야 한다는 것이다.
     * 프로퍼티를 setter로 고치게 된다면 해당 객체의 불변성이 깨지게 되며 그 객체를 사용하는 사용자는 어디에서건 해당 객체 내부의 값을 신뢰하기 위하여
     * 그 값을 확인하는 절차를 거쳐야 하며 이는 어플리케이션 전체의 안정성을 저해하게 된다.
     * 따라서, 객체는 기본적으로 불변하여야 하며 매우 한정적으로 내부 프로퍼티가 변하는 것을 허용해야 한다.
     * 그래서 객체가 변해야 한다면 원본 객체를 변경하는 것이 아닌 생성자를 통해서 새로운 객체를 만들어야 한다.
     *
     * 예를 들어 서울에 사는 30살 홍길동 씨 객체가 있는데 25살 홍길동 씨로 변경해야 한다면 원본 객체의 생성자 초기화 데이터를 수정하거나
     * 새롭게 서울에 사는 25살 홍길동 씨 객체를 만들어야 하는 것이다. 이는 개발자의 의도에 맞게 조율하면 된다.
     * */
    String model;
    String color;
    int speed;

    /**
     * 커스텀 생성자가 하나라도 존재한다면 빈 생성자를 기본적으로 만들어주지 않는다.
     * */
    public Car ( String model, String color, int speed ) {
        /**
         * this의 의미는 객체 자기 자신을 가리킨다.
         * 기본적으로 변수의 스코프(범위)는 자신과 가장 가까운 변수를 참조하게 되어 있다.
         * 따라서, 객체 자기 자신의 필드가 더 멀리 있기 때문에 멀리있는 필드 변수에 값을 대입하기 위하여 'this.변수'로 접근하여 값을 할당하게 된다.
         * */
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
}
